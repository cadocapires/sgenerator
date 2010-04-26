/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

import java.util.ArrayList;

/**
 *
 * @author Priscilla
 */
public class TableRelation {

    private String tableName;
    private ArrayList listOtherTables;
    
    public TableRelation(String name){
        this.tableName = name;
    }
    public String getNameOfTable(){
        return this.tableName;
    }
     public ArrayList getRelations(){
        return this.listOtherTables;
    }
      public void setRelation(TableRelation table){
        this.listOtherTables.add(table);
    }

    

}
