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
import org.junit.Ignore;

/**
 *
 * @author Merwane
 */
public class CaseTest {
    
    private static final Point2D p = new Point2D(1,2);
    private  ArrayList<Case> listeVide;
    private  Case instance;
    
    private static final Point2D p1 = new Point2D(2,2);
    private static final Case v = new Case(p1);
    
    
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
        instance = new Case(p);
        listeVide = new ArrayList<Case>();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCouleur method, of class Case.
     */
   
    @Test
    public void testGetCouleur() {
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
        Point2D expResult = p;
        Point2D result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLibertes method, of class Case.
     */
   
    @Test
    public void testGetLibertes() {
        System.out.println("getLibertes");
        int expResult = 0;
        int result = instance.getLibertes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVoisins method, of class Case.
     */
  
    @Test
    public void testGetVoisins() {
        System.out.println("getVoisins");
        ArrayList<Case> result = instance.getVoisins();
        assertEquals(listeVide, result);
    }

    /**
     * Test of getVoisinsMechants method, of class Case.
     */
    @Test
    public void testGetVoisinsMechants() {
        System.out.println("getVoisinsMechants");
        ArrayList<Case> result = instance.getVoisinsMechants();
        assertEquals(listeVide, result);
    }

    /**
     * Test of setCouleur method, of class Case.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        instance.setCouleur("noir");
        assertEquals("noir", instance.getCouleur());
    }

    /**
     * Test of setPosition method, of class Case.
     */
    @Ignore
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        instance.setPosition(p1);
        assertEquals(instance.getPosition(), p1);
    }

    /**
     * Test of setLibertes method, of class Case.
     */
    @Test
    public void testSetLibertes() {
        System.out.println("setLibertes");
        int lib = 0;
        instance.setLibertes(lib);
        assertEquals(0, instance.getLibertes());
    }

    /**
     * Test of setVoisins method, of class Case.
     */
    @Test
    public void testSetVoisins_ArrayList() {
        System.out.println("setVoisins");  
        instance.setVoisins(listeVide);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(listeVide, instance.getVoisins());
        listeVide.add(instance);
        assertEquals(listeVide, instance.getVoisins());
    }

    /**
     * Test of setVoisins method, of class Case.
     */
    @Test
    public void testSetVoisins_Case() {
        System.out.println("setVoisins");
        instance.setVoisins(v);
        assertTrue(instance.getVoisins().contains(v)); 
    }

    /**
     * Test of setVoisinsMechants method, of class Case.
     */
    @Test
    public void testSetVoisinsMechants_ArrayList() {
        System.out.println("setVoisinsMechants");
        instance.setVoisinsMechants(listeVide);
        assertEquals(instance.getVoisinsMechants(), listeVide); 
        listeVide.add(instance);
        assertEquals(listeVide, instance.getVoisinsMechants());
    }

    /**
     * Test of setVoisinsMechants method, of class Case.
     */
    @Test
    public void testSetVoisinsMechants_Case() {
        System.out.println("setVoisinsMechants");
        instance.setVoisinsMechants(v);
        assertTrue(instance.getVoisinsMechants().contains(v)); 
    }
    
     @Test
    public void testEnleveMechant() {
        System.out.println("enleveMechant");
        instance.setVoisinsMechants(v);
        assertTrue(instance.getVoisinsMechants().contains(v));
        instance.enleverVoisinMechant(v);
        assertFalse(instance.getVoisinsMechants().contains(v));
    }
    
}
