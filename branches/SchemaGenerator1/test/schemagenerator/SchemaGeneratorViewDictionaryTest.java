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
public class SchemaGeneratorViewDictionaryTest {

    public SchemaGeneratorViewDictionaryTest() {
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
     * Test of closeAboutBox method, of class SchemaGeneratorViewDictionary.
     */
    @Test
    public void testCloseAboutBox() {
        System.out.println("closeAboutBox");
        SchemaGeneratorViewDictionary instance = new SchemaGeneratorViewDictionary(null);
        instance.closeAboutBox();
     }

    /**
     * Test of readTheme method, of class SchemaGeneratorViewDictionary.
     */
    @Test
    public void testReadTheme() throws Exception {
        System.out.println("readTheme");
        String address ="Businesses";
        SchemaGeneratorViewDictionary instance = new SchemaGeneratorViewDictionary(null);
        assertEquals(address, instance.readTheme());
    }

     /**
     * Test of readTheme method, of class SchemaGeneratorViewDictionary.
     */
    @Test
    public void testReadTheme2() throws Exception {
        System.out.println("readTheme");
        String address ="dinheiro = dimdim ";
        SchemaGeneratorViewDictionary instance = new SchemaGeneratorViewDictionary(null);
        assertEquals(address, instance.readTheme2());
    }
    

}