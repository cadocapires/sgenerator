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
              //ResultSet rs = st.executeQuery("SELECT c.table_name taborigem, c.column_name colorigem, p.table_name tabdestino, p.column_name coldestino FROM  (SELECT x.constraint_name, y.column_name, x.table_name, x.constraint_type, x.r_owner, x.r_constraint_name FROM   user_constraints x, user_cons_columns y WHERE  x.constraint_name = y.constraint_name) c, (SELECT x.constraint_name, y.column_name, x.table_name, x.constrain)");
                ResultSet rs = st.executeQuery("SELECT * FROM HELP");
                sucess = true;
                while(rs.next()) {
              //String nome =  rs.getString("TABORIGEM");
                  String nome =  rs.getString("INFO");
                    name = name + " " + nome;
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
