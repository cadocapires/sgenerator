package schemagenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JFrame;



/**
 *
 * @author Priscilla
 */
    public class Connect {

        public String connected(String address, String login, String password) throws ClassNotFoundException, IOException {
          String results = "";
          boolean sucess = true;
          ConnectionBox sucessBox = null;
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection(address,login,password);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT c.table_name taborigem, c.column_name colorigem, p.table_name tabdestino, p.column_name coldestino FROM  (SELECT x.constraint_name, y.column_name, x.table_name, x.constraint_type, x.r_owner, x.r_constraint_name FROM   user_constraints x, user_cons_columns y       WHERE  x.constraint_name = y.constraint_name) c,     (SELECT x.constraint_name, y.column_name, x.table_name, x.constraint_type, x.owner       FROM   user_constraints x, user_cons_columns y       WHERE  x.constraint_name = y.constraint_name) p,       user_tab_columns col1,       user_tab_columns col2 WHERE  c.constraint_type = 'R' AND    c.r_owner = p.owner AND    c.r_constraint_name = p.constraint_name AND    c.column_name = col1.column_name AND    c.table_name = col1.table_name AND    p.column_name = col2.column_name AND    p.table_name = col2.table_name ORDER BY c.table_name");
             
                sucess = true;

                System.out.println("TABELA ORIGEM" + " -> " + "TABELA DESTINO");

                while(rs.next()) {
                       
                  String nameOrigin =  rs.getString("TABORIGEM");
                  String nameDestination =  rs.getString("TABDESTINO");

                  //System.out.println(nameOrigin + " -> " + nameDestination);
                  results += nameOrigin + " -> " + nameDestination +";";
                
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
            return results;
        }

    
    }
