/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package go2;



import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Merwane
 */
public class CaseTest {
    
    public CaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCouleur method, of class Case.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Point2D point = new Point2D(1,2); 
        Case instance = new Case(point);
        String expResult = "vide";
        String result = instance.getCouleur();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPosition method, of class Case.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Point2D point = new Point2D(1,2); 
        Case instance = new Case(point);
        Point2D expResult = point;
        Point2D result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLibertes method, of class Case.
     */
    @Test
    public void testGetLibertes() {
        System.out.println("getLibertes");
        Case instance = null;
        int expResult = 0;
        int result = instance.getLibertes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVoisins method, of class Case.
     */
    @Test
    public void testGetVoisins() {
        System.out.println("getVoisins");
        Case instance = null;
        ArrayList<Case> expResult = null;
        ArrayList<Case> result = instance.getVoisins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVoisinsMechants method, of class Case.
     */
    @Test
    public void testGetVoisinsMechants() {
        System.out.println("getVoisinsMechants");
        Point2D p = new Point2D(1, 2);
        Case instance = new Case(p);
        ArrayList<Case> expResult = new ArrayList<Case>();
        ArrayList<Case> result = instance.getVoisinsMechants();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCouleur method, of class Case.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        Point2D point = new Point2D(1,2); 
        Case instance = new Case(point);
        instance.setCouleur("noir");
        assertEquals("noir", instance.getCouleur());
    }

    /**
     * Test of setPosition method, of class Case.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Point2D position = null;
        Case instance = null;
        instance.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLibertes method, of class Case.
     */
    @Test
    public void testSetLibertes() {
        System.out.println("setLibertes");
        int l = 0;
        Case instance = null;
        instance.setLibertes(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoisins method, of class Case.
     */
    @Test
    public void testSetVoisins_ArrayList() {
        System.out.println("setVoisins");
        int x = 1;
        int y = 2;
        Point2D point = new Point2D(x, y); 
        
        ArrayList<Case> list = new ArrayList<Case>();
        Case instance = new Case (point);
        instance.setVoisins(list);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(list, instance.getVoisins());
        list.add(instance);
        assertEquals(list, instance.getVoisins());
    }

    /**
     * Test of setVoisins method, of class Case.
     */
    @Test
    public void testSetVoisins_Case() {
        System.out.println("setVoisins");
        Case v = null;
        Case instance = null;
        instance.setVoisins(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoisinsMechants method, of class Case.
     */
    @Test
    public void testSetVoisinsMechants_ArrayList() {
        System.out.println("setVoisinsMechants");
        ArrayList<Case> voisinsMechants = null;
        Case instance = null;
        instance.setVoisinsMechants(voisinsMechants);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoisinsMechants method, of class Case.
     */
    @Test
    public void testSetVoisinsMechants_Case() {
        System.out.println("setVoisinsMechants");
        Case v = null;
        Case instance = null;
        instance.setVoisinsMechants(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     @Test
    public void testEnleveMechant() {
        System.out.println("enleveMechant");
        Point2D p1 = new Point2D(3,3);
        Point2D p2 = new Point2D(3,4);
        Case mechant = new Case(p1);
        Case voisin = new Case(p2);
        voisin.setVoisinsMechants(mechant);
        assertTrue(voisin.getVoisinsMechants().contains(mechant));
        voisin.enleverVoisinMechant(mechant);
        assertFalse(voisin.getVoisinsMechants().contains(mechant));
    }
    
}
