package schemagenerator;


import java.util.ArrayList;

/**
 *
 * @author Priscilla
 */
public class TableRelation {

    private String tableName;
    private ArrayList listOtherTables = new ArrayList();
    private ArrayList fieldRelations = new ArrayList();

    public TableRelation(String name){
        this.tableName = name;
    }
    public String getNameOfTable(){
        return this.tableName;
    }
     public ArrayList getRelations(){
        return this.listOtherTables;
    }
      public void setRelation(TableRelation table, String  fieldFrom, String fieldTo){
        this.listOtherTables.add(table);
        this.fieldRelations.add(fieldFrom);
        this.fieldRelations.add(fieldTo);
    }



}
