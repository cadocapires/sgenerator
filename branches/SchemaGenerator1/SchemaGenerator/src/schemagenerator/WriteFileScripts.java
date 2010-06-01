/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Administrador
 */
class WriteFileScripts {

    List<String> scripts;
    private File file;

    public WriteFileScripts(List<String> scripts) {
        this.scripts = scripts;
    }

    void createFile() throws IOException {
        file = new File("C:/Documents and Settings/script.txt");
	FileWriter wr = new FileWriter(file);
	BufferedWriter bwr = new BufferedWriter(wr);
        for(int i = 0; i < scripts.size();i++){
            bwr.write(i+1+"º Script");
            bwr.newLine();
            bwr.write(scripts.get(i));
            bwr.newLine();
        }
	bwr.close();
    }




}
