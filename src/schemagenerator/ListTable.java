/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package schemagenerator;
import java.util.ArrayList;
import java.util.Iterator;
import sun.applet.Main;

/**
 *
 * @author Priscilla
 */
public class ListTable {


    private ArrayList<TableRelation> listTables = new ArrayList<TableRelation>() ;

    public ArrayList getTables(){
        return this.listTables;
    }

    /**
     *
     * @param tableFrom
     * @param tableTo
     */
      public void setRelation(String tableFrom, String tableTo){
          int indexFrom =0;
          int indexTo = 0;

          if (getTableIndex(tableFrom)== -1 ) {
           System.out.println("FROM N EXISTE");

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
           getTable(indexFrom).setRelation(getTable(indexTo));

    }


      public int getTableIndex(String nameTable){

          int index = -1;

          System.out.println("pega o index");

          for (Iterator<TableRelation> it = listTables.iterator(); it.hasNext();) {
              TableRelation tableRelation = it.next();
              System.out.println("não tá vazio");
             if (tableRelation.getNameOfTable().equals(nameTable)) {
                 index = listTables.indexOf(tableRelation);
                  System.out.println("entrou no if  " + index + " " + nameTable);

              }


          }

          System.out.println(index);
          return index;
      }


       public TableRelation getTable(int index){
           return this.listTables.get(index);

      }
        public ArrayList getListOfTables(){
           return this.listTables;

      }

        public static void main(String[] args) {
        ListTable lista = new ListTable();
        System.out.println("ajsdjdjudfi");
        lista.setRelation("a", "b");
        System.out.println("KKKKKKKKKKKKKKKKKKKKKKK");
        lista.setRelation("a", "c");
       lista.setRelation("d", "c");
        System.out.println("JIDSJSIODJSIODJASIOD");

           for (Iterator<TableRelation> it = lista.getListOfTables().iterator(); it.hasNext();) {
              TableRelation tableRelation = it.next();
             System.out.println(tableRelation.getNameOfTable() + "   resultado ");


          }



            for (int i = 0;  i < 2; i++) {

                TableRelation tableR = lista.getTable(0);
                ArrayList<TableRelation> array = tableR.getRelations();
                TableRelation tableRelation = array.get(i);

                System.out.println( tableRelation.getNameOfTable() + "resultado");

            }


        }



}
