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
        fieldRelations.add("");    
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

      public TableRelation getRelation(int index){
          return (TableRelation) listOtherTables.get(index);
      }


      /**
       *
       * @param index
       * @return campo da tabela de origem
       */
      public String getFieldFrom(int index){
         return (String) fieldRelations.get((2*index) + 1);
       } 
/**
 *
 * @param index
 * @return campo da tabela destino
 */
       public String getFieldTo(int index){
         return (String) fieldRelations.get((2*index) + 2);
       }

    }










