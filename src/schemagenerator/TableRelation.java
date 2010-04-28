package schemagenerator;


import java.util.ArrayList;

/**
 *
 * @author Priscilla
 */
public class TableRelation {

    private String tableName;
    private ArrayList listOtherTables = new ArrayList();

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
