/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Márcio
 */
public class readFileTest {

    public readFileTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of readThis method, of class readFile.
     */
    @Test
    public void testReadThis() throws Exception {
        System.out.println("readThis");
        String address = "C:\\Documents and Settings\\test.txt";
        readFile instance = new readFile();
        instance.readThis(address);
        //create a document. txt with the name "test" C: \ Documents and Settings \ and using this test.
    }


}