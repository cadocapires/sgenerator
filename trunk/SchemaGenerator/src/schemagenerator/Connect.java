package schemagenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

    public class Connect {

        public String connected(String login, String password) throws ClassNotFoundException, IOException {
          String name = "";
            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");


                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@150.165.75.171",login,password);
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
                ResultSet rs = st.executeQuery("Select * from Usuario");

                while(rs.next()) {
                   //String name =  rs.getString("TABORIGEM");
                	String nome =  rs.getString("NOME");
                    name = name + " " + nome;

                   //System.out.println(name);
                }
            }catch(SQLException e) {
                System.out.print("");
                System.out.println("Erro ao conectar com o banco");

            } finally {
                System.out.println("Conexao finalizada....");
            }
            return name;
        }

    }
