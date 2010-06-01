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
     * Test of getTables and setRelation method, of class ListTable.
     */
    @Test
    public void testGetTables() {
        System.out.println("getTables and setRelation");
        ListTable list = new ListTable();
        list.setRelation("a", "x", "b", "y");
        list.setRelation("a", "w", "c", "z");
        list.setRelation("d", "k", "c", "j");
        String expResult = "a b c d ";
        String result = list.toStringTable();
        assertEquals(expResult, result);
     }

    /**
     * Test of getTableIndex method, of class ListTable.
     */
    @Test
    public void testGetTableIndex() {
        System.out.println("getTableIndex");
        String nameTable = "a";
        ListTable instance = new ListTable();
        instance.setRelation("a", "x","b","y");
        int expResult = 0;
        int result = instance.getTableIndex(nameTable);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRelation method, of class ListTable.
     */
    @Test
    public void testGetRelation() {
        System.out.println("getTable");
        int index = 0;
        ListTable instance = new ListTable();
        instance.setRelation("a", "x", "b", "y");
        instance.setRelation("a", "w", "c", "z");

        String expResult = "b";
        TableRelation result = instance.getTable(index);
        ArrayList<TableRelation> array = result.getRelations();
        TableRelation tableRelation = array.get(index);
        assertEquals(expResult, tableRelation.getNameOfTable());

   
        expResult = "c";
        int index1 =1;
        result = instance.getTable(index);
        array = result.getRelations();
        tableRelation = array.get(index1);
        assertEquals(expResult, tableRelation.getNameOfTable());
        assertEquals(2, array.size());

        expResult = "a";
        result = instance.getTable(index1);
        array = result.getRelations();
        tableRelation = array.get(index);
        assertEquals(expResult, tableRelation.getNameOfTable());
        assertEquals(1, array.size());

    }

  

}