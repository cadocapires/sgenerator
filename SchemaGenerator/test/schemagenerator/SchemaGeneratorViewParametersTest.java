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
public class SchemaGeneratorViewParametersTest {

    public SchemaGeneratorViewParametersTest() {
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
     * Test of getNumberTables method, of class SchemaGeneratorViewParameters.
     */
    @Test
    public void testGetNumberTables() {
        System.out.println("getNumberTables");
        SchemaGeneratorViewParameters instance = null;
        int expResult = 0;
        int result = instance.getNumberTables();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberSchemas method, of class SchemaGeneratorViewParameters.
     */
    @Test
    public void testGetNumberSchemas() {
        System.out.println("getNumberSchemas");
        SchemaGeneratorViewParameters instance = null;
        int expResult = 0;
        int result = instance.getNumberSchemas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUseDictionary method, of class SchemaGeneratorViewParameters.
     */
    @Test
    public void testGetUseDictionary() {
        System.out.println("getUseDictionary");
        SchemaGeneratorViewParameters instance = null;
        boolean expResult = false;
        boolean result = instance.getUseDictionary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepeatedSchemas method, of class SchemaGeneratorViewParameters.
     */
    @Test
    public void testGetRepeatedSchemas() {
        System.out.println("getRepeatedSchemas");
        SchemaGeneratorViewParameters instance = null;
        boolean expResult = false;
        boolean result = instance.getRepeatedSchemas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeAboutBox method, of class SchemaGeneratorViewParameters.
     */
    @Test
    public void testCloseAboutBox() {
        System.out.println("closeAboutBox");
        SchemaGeneratorViewParameters instance = null;
        instance.closeAboutBox();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateParameters method, of class SchemaGeneratorViewParameters.
     */
    @Test
    public void testUpdateParameters() {
        System.out.println("updateParameters");
        SchemaGeneratorViewParameters instance = null;
        instance.updateParameters();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}