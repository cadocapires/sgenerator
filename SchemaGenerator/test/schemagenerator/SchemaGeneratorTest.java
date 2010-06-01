/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

import java.awt.Window;
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
public class SchemaGeneratorTest {

    public SchemaGeneratorTest() {
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
     * Test of startup method, of class SchemaGenerator.
     */
    @Test
    public void testStartup() {
        System.out.println("startup");
        SchemaGenerator instance = new SchemaGenerator();
        instance.startup();
    }

    /**
     * Test of configureWindow method, of class SchemaGenerator.
     */
    @Test
    public void testConfigureWindow() {
        System.out.println("configureWindow");
        Window root = null;
        SchemaGenerator instance = new SchemaGenerator();
        instance.configureWindow(root);
     }

    /**
     * Test of main method, of class SchemaGenerator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SchemaGenerator.main(args);
    }

}