/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Priscilla
 */
class GeneratorCore {

    int numberTables;
    int numberSchemas;
    boolean useDictionary;
    boolean repeatedSchemas;
    java.awt.TextArea dictionarySelected;
    ListTable tables;
    ListTable schemas[];
    ArrayList<TableRelation> union;
    
    

    public GeneratorCore (java.awt.TextArea dictionarySelected, int numberTables, int numberSchemas, boolean useDictionary, boolean repeatedSchemas, ListTable tables){
        this.numberTables = numberTables;
        this.numberSchemas = numberSchemas;
        this.useDictionary = useDictionary;
        this.repeatedSchemas = repeatedSchemas;
        this.dictionarySelected = dictionarySelected;
        this.tables = tables;
        this.schemas = new ListTable[numberSchemas];
    }

    public GeneratorCore(int numTables, int numSchemas, ListTable tables){
        this.numberTables = numTables;
        this.numberSchemas = numSchemas;
        this.tables = tables;
        this.schemas = new ListTable[numberSchemas];
    }  

    public String[] toStringSchemas(){
        String eachSchema = "";
        String[] result;
        try{
            for(int i=0;i<schemas.length;i++){
                 //result += schemas[i].toStringTable2()+" "+ schemas[i].getListOfTables().size()+" \n"+"\n";
                eachSchema += schemas[i].toStringTable2() +" separator";
            }
            result = eachSchema.split("separator");
        }
        catch(Exception e){
            result =null;
            //Alert USER;
        }
        return result;
        
    } 

    public int generatorNumber(int size){
        Random ran = new Random();
        return ran.nextInt(size);
    }
    
    public ListTable getTables(){
        return tables;
    }   

    public boolean existTableIntoSchema(ListTable schema, String nameOfTable){
       boolean exist = false;
        
        for (int i = 0; i < schema.getListOfTables().size(); i++) {
            if (schema.getTable(i).getNameOfTable().equalsIgnoreCase(nameOfTable)) {
                exist = true;

            }

        }
       return exist;


    }

    /**
     * Create schemas.
     */
    public boolean GeneratingSchemas(){
         
        int indexTable = 0;
        boolean numberSchemasChanged = false;
        if(numberSchemas>tables.getListOfTables().size()){
            numberSchemas = tables.getListOfTables().size();
            numberSchemasChanged = true;
        }

        for (int i=0; i< numberSchemas; i++){

       
            ListTable schema =  new ListTable();
            int numberOfTables = 0;


            while(numberOfTables<numberTables){
                
                indexTable = generatorNumber(tables.getListOfTables().size());
                    
                if (schema.getListOfTables().size() == 0) {

                    TableRelation newTable = new TableRelation(tables.getTable(indexTable).getNameOfTable());
                    schema.setOnetable(newTable);
                    numberOfTables ++;                  
                   
                   

                }else{
                    if (!(existTableIntoSchema(schema, tables.getTable(indexTable).getNameOfTable()))) {
                        boolean exists = false;
                        for (int j = 0; j <tables.getTable(indexTable).getRelations().size(); j++) {                   

                             if (existTableIntoSchema(schema, tables.getTable(indexTable).getRelation(j).getNameOfTable())) {
                            
                                  String tableFrom = tables.getTable(indexTable).getNameOfTable();
                                  String colFrom = tables.getTable(indexTable).getFieldFrom(j);
                                  String tableTo =  tables.getTable(indexTable).getRelation(j).getNameOfTable();
                                  String colTo = tables.getTable(indexTable).getFieldTo(j);

                                 schema.setRelation(tableFrom, colFrom, tableTo, colTo);

                                 exists = true;
                                 break;

                             }
                         }

                        if (exists == false) {
                           
                            TableRelation newTable = new TableRelation(tables.getTable(indexTable).getNameOfTable());
                            schema.setOnetable(newTable);
                   
                      }
                     numberOfTables ++;                     

                  }

               }// do else
               
           }// do while
             
            schemas[i] = schema; // insere o novo esquema nos esquemas pedidos
    
        }//do for
        return numberSchemasChanged;
    }// do metodo

}// da classe

