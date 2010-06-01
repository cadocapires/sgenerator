/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

/**
*
* @author Administrador
*/
 import javax.swing.JFileChooser;
 import org.jdesktop.application.Action;
 
 public class Search {


   
     
     @Action
     public static String searchFile(){

           String fileWave;
           JFileChooser arquivo = new JFileChooser();
           arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

           if(arquivo.showOpenDialog(arquivo) == JFileChooser.APPROVE_OPTION){
               fileWave = arquivo.getSelectedFile().getPath();
           }

           else{
               fileWave = "";

           }

           return fileWave;
           }


    


 }

 