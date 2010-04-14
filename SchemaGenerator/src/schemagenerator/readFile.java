/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Márcio
 */
public class readFile {
   
public void readThis(String address) throws FileNotFoundException, IOException{
        File f = new File(address);
		FileReader rd = new FileReader(f);
		BufferedReader brd = new BufferedReader(rd);

		while (brd.ready()){
			String dados = brd.readLine();
			if(!dados.equals("") && !dados.equals(" ")){
				System.out.print(dados);
			}
		}
}



}



