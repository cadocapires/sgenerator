package schemagenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JFrame;

    public class Connect {

        public String connected(String address, String login, String password) throws ClassNotFoundException, IOException {
          String name = "";
          boolean sucess = true;
          ConnectionBox sucessBox = null;
            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");

                Connection conn = DriverManager.getConnection(address,login,password);
                Statement st = conn.createStatement();

               /*File f = new File("C:/Documents and Settings/demontie/Desktop/aki/sql.txt");
        		FileReader rd = new FileReader(f);
        		BufferedReader brd = new BufferedReader(rd);

        		String sql = "";
        		while (brd.ready()){
        			String dados = brd.readLine()+" ";
        			if(!dados.equals("") && !dados.equals(" ")){
        					sql= sql+dados;
        			}
        		}

        		brd.close();

        		System.out.println(sql);
                */
                ResultSet rs = st.executeQuery("Select * from Help");
                sucess = true;
                while(rs.next()) {
                   //String name =  rs.getString("TABORIGEM");
                    String nome =  rs.getString("INFO");
                    name = name + " " + nome;

                   //System.out.println(name);
                }
            }catch(SQLException e) {
                System.out.print("");
                System.out.println("Error connecting to the bank");
                sucess =false;
            } finally {
                System.out.println("Connection terminated....");
                if (sucessBox == null) {
                        JFrame mainFrame = SchemaGenerator.getApplication().getMainFrame();
                        sucessBox = new ConnectionBox(mainFrame);
                        if(sucess){
                            sucessBox.setText("Success!");
                        }
                        else{
                            sucessBox.setText("Error: login or password don't exist.");
                        }

                        sucessBox.setLocationRelativeTo(mainFrame);

                    SchemaGenerator.getApplication().show(sucessBox);
                }

            }
            return name;
        }

    
    }
