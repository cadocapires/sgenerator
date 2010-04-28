/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author priscilla
 */



public class ListTableTest {

    public ListTableTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTables method, of class ListTable.
     */
    @Test
    public void testGetTables() {
        System.out.println("getTables");

        ListTable list = new ListTable();
        list.setRelation("a", "b");
        list.setRelation("a", "c");
        list.setRelation("d", "c");
        String expResult = "a b c d ";
        String result = list.toStringTable();
        assertEquals(expResult, result);
     }

    /**
     * Test of setRelation method, of class ListTable.
     */
    @Test
    public void testSetRelation() {
        System.out.println("setRelation");
        String tableFrom = "";
        String tableTo = "";
        ListTable instance = new ListTable();
        instance.setRelation(tableFrom, tableTo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableIndex method, of class ListTable.
     */
    @Test
    public void testGetTableIndex() {
        System.out.println("getTableIndex");
        String nameTable = "";
        ListTable instance = new ListTable();
        int expResult = 0;
        int result = instance.getTableIndex(nameTable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTable method, of class ListTable.
     */
    @Test
    public void testGetTable() {
        System.out.println("getTable");
        int index = 0;
        ListTable instance = new ListTable();
        TableRelation expResult = null;
        TableRelation result = instance.getTable(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfTables method, of class ListTable.
     */
    @Test
    public void testGetListOfTables() {
        System.out.println("getListOfTables");
        ListTable instance = new ListTable();
        ArrayList expResult = null;
        ArrayList result = instance.getListOfTables();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ListTable.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ListTable.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}