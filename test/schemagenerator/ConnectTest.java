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
 * @author demontie
 */
public class ConnectTest {

    public ConnectTest() {
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
     * Test of connected method, of class Connect.
     */
    @Test
    public void testConnected() throws Exception {
        System.out.println("connected");
        String login = "tpce";
        String password = "tpce";
        Connect instance = new Connect();
        String expResult = " Priscilla Márcio";
        String result = instance.connected(login, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}