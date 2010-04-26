/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Priscilla
 */
public class ListTable {


    private ArrayList<TableRelation> listTables;
    
    public ArrayList getTables(){
        return this.listTables;
    }
      public void setRelation(String tableFrom, String tableTo){
          
          boolean found = false;
          for (Iterator<TableRelation> it = listTables.iterator(); it.hasNext();) {
              TableRelation tableRelation = it.next();

              if (tableRelation.getNameOfTable().equals(tableFrom)) {
                  found = true;
              }
          }

          if (found = false) {
              TableRelation table = new TableRelation(tableFrom);
              this.listTables.add(table);
          } 

    }   

}
