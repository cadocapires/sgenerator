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
public class SearchTest {

    public SearchTest() {
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
     * Test of searchFile method, of class Search.
     */
    @Test
    public void testSearchFile() {
        System.out.println("searchFile");
        String expResult = "";
        //click on "cancel"
        String result = Search.searchFile();
        assertEquals(expResult, result);
        expResult = "C:\\Documents and Settings\\test.txt";
        result = Search.searchFile();
        assertEquals(expResult, result);
        //create a document. txt with the name "test" C: \ Documents and Settings \ and open using this test.
    }

}