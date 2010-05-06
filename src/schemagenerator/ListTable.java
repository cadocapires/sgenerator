package schemagenerator;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Priscilla
 */
public class ListTable {

    private ArrayList<TableRelation> listTables = new ArrayList<TableRelation>() ;

     /**
     *
     * @param tableFrom
     * @param tableTo
     */
      public void setRelation(String tableFrom, String colFrom, String tableTo, String colTo){
          int indexFrom =0;
          int indexTo = 0;

          if (getTableIndex(tableFrom)== -1 ) {          

              TableRelation table = new TableRelation(tableFrom);
              this.listTables.add(table);
          }

          if (getTableIndex(tableTo)== -1 ) {

              TableRelation table = new TableRelation(tableTo);
              this.listTables.add(table);
          }
           indexFrom = getTableIndex(tableFrom);
           indexTo = getTableIndex(tableTo);
           // this.listTables.get(indexFrom).setRelation(listTables.get(indexTo));
           getTable(indexFrom).setRelation(getTable(indexTo), colFrom, colTo);
           getTable(indexTo).setRelation(getTable(indexFrom), colTo, colFrom);
    }


      public int getTableIndex(String nameTable){
          int index = -1;       
          for (Iterator<TableRelation> it = listTables.iterator(); it.hasNext();) {
              TableRelation tableRelation = it.next();
              if (tableRelation.getNameOfTable().equals(nameTable)) {
                 index = listTables.indexOf(tableRelation);
              }
          }
          return index;
      }


       public TableRelation getTable(int index){
           return this.listTables.get(index);

      }
        public ArrayList getListOfTables(){
           return this.listTables;

      }

      public ArrayList getTables(){
          return this.listTables;

      }

         public String toStringTable(){

            String tables = "";
            for (Iterator<TableRelation> it = this.listTables.iterator(); it.hasNext();) {
                TableRelation tableRelation = it.next();
                tables = tables + tableRelation.getNameOfTable() + " ";
            }
            return tables;
        }   
}
