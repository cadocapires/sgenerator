package schemagenerator;

import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Márcio
 */
class GeneratorScriptCore {

    private String [] schemas;
    GeneratorScriptCore(String [] schemas){
        this.schemas = schemas;
    }

    public void getScript() throws IOException{
        String [] wordsOfSchema;
        List <String> scripts = new ArrayList(schemas.length);
        for(int i =0;i< schemas.length;i++){
            String script="";
            wordsOfSchema = schemas[i].split(" ");
            for(int j=0;j<wordsOfSchema.length;j++){
                if(!wordsOfSchema[j].equals("ColunaTo:") && !wordsOfSchema[j].equals("ColunaFrom:") && !wordsOfSchema[j].equals("ToTable")){
                    if(j-1>0){
                        if(!wordsOfSchema[j-1].equals("ColunaFrom:") && !wordsOfSchema[j-1].equals("ColunaTo:") && !wordsOfSchema[j-1].equals("ToTable:")){
                    
                            if(j+1<wordsOfSchema.length){
                                if(wordsOfSchema[j+1].equals("ColunaFrom:")){
                                    script+="CREATE TABLE "+wordsOfSchema[j]+"("+"\n"+"Foreign Key "+wordsOfSchema[j+2]+ " references " +wordsOfSchema[j+6]+"("+wordsOfSchema[j+4]+"));"+"\n"+"\n";
                                }
                            }
                            else{
                                script+="CREATE TABLE "+wordsOfSchema[j]+"();"+"\n"+"\n";
                            }
                        }
                    }
                }
            }        
                scripts.add(script);
        }
        for(int k=0;k<scripts.size();k++){
            System.out.println(scripts.get(k));
            System.out.println();
        }
        WriteFileScripts writer = new WriteFileScripts(scripts);
        writer.createFile();
    }
}
