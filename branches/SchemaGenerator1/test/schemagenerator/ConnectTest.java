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
        String address ="jdbc:oracle:thin:@150.165.75.171";
        Connect instance = new Connect();
        String expResult = " Priscilla Márcio";
        String result = instance.connected(address,login, password);
        assertEquals(expResult, result);
        login = "errado";
        password= "errado";
        address = "jdbc:oracle:thin:@150.165.75.171";
        expResult ="";
        result = instance.connected(address,login, password);
        assertEquals(expResult, result);
 
    }

}