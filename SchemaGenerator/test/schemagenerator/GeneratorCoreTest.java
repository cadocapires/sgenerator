/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package schemagenerator;

import java.awt.TextArea;
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
public class GeneratorCoreTest {

    public GeneratorCoreTest() {
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
     * Test of generatorNumber method, of class GeneratorCore.
     */
    @Test
    public void testGeneratorNumber() {
        System.out.println("generatorNumber");
        // it's impossible to test size>1, because we use a randon method from java.util.Random.
        int size = 1;
        GeneratorCore instance = new GeneratorCore(new TextArea(), 1, 1, true, true, new ListTable());
        int expResult = 0;
        int result = instance.generatorNumber(size);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTables method, of class GeneratorCore.
     */
    @Test
    public void testGetTables() {
        System.out.println("getTables");
        ListTable test = new ListTable();
        test.setOnetable(new TableRelation("A"));
        GeneratorCore instance = new GeneratorCore(new TextArea(), 1, 1, true, true, test);
        ListTable expResult = new ListTable();
        expResult.setOnetable(new TableRelation("A"));
        ListTable result = instance.getTables();
        assertEquals(expResult.getTable(0).getNameOfTable(), result.getTable(0).getNameOfTable());
       
    }

     /**
     * Test of existTableIntoSchema method, of class GeneratorCore.
     */
    @Test
    public void testExistTableIntoSchema() {
        System.out.println("existTableIntoSchema");
        ListTable schema = new ListTable();
        schema.setOnetable(new TableRelation("A"));
        schema.setRelation("B", "colFrom", "C", "colTo");
        String nameOfTable = "A";
        GeneratorCore instance = new GeneratorCore(new TextArea(), 1, 1, true, true, schema);
        boolean expResult = true;
        boolean result = instance.existTableIntoSchema(schema, nameOfTable);
        assertEquals(expResult, result);
        expResult = true;
        nameOfTable = "B";
        result = instance.existTableIntoSchema(schema, nameOfTable);
        assertEquals(expResult, result);
        expResult = true;
        nameOfTable = "C";
        result = instance.existTableIntoSchema(schema, nameOfTable);
        assertEquals(expResult, result);
        expResult = false;
        nameOfTable = "D";
        result = instance.existTableIntoSchema(schema, nameOfTable);
        assertEquals(expResult, result);


    }

     /**
     * Test of number of schema generated is equal of parameters specificaded.
     */
    @Test
    public void testNumberSchemasGenerated() {
        System.out.println("NumberSchemasGenerated");
        ListTable schema = new ListTable();
        schema.setOnetable(new TableRelation("A"));
        schema.setRelation("B", "colFrom", "C", "colTo");
        GeneratorCore instance = new GeneratorCore(new TextArea(), 1, 1, true, true, schema);
        int expResult = instance.numberSchemas;
        instance.GeneratingSchemas();
        int result = instance.schemas[0].getListOfTables().size();
        assertEquals(expResult, result);
        expResult = 2;
        instance = new GeneratorCore(new TextArea(), 2, 2, true, true, schema);
        instance.GeneratingSchemas();
    }


}