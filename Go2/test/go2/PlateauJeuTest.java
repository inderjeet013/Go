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
public class PlateauJeuTest {
    
    public PlateauJeuTest() {
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
     * Test of getCases method, of class PlateauJeu.
     */
    @Test
    public void testGetCases() {
        System.out.println("getCases");
        PlateauJeu instance = new PlateauJeu(0,5,0,0,0);
        Case[][] expResult = new Case[4][4];
        Case[][] result = instance.getCases();
        assertArrayEquals(expResult, result);
    }

    
    /**
     * Test of getCote method, of class PlateauJeu.
     */
    @Test
    public void testGetCote() {
        System.out.println("getCote");
        PlateauJeu instance = null;
        int expResult = 0;
        int result = instance.getCote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



    /**
     * Test of setCases method, of class PlateauJeu.
     */
    @Test
    public void testSetCases() {
        System.out.println("setCases");
        Case[][] Cases = null;
        PlateauJeu instance = null;
        instance.setCases(Cases);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCote method, of class PlateauJeu.
     */
    @Test
    public void testSetCote() {
        System.out.println("setCote");
        int cote = 0;
        PlateauJeu instance = null;
        instance.setCote(cote);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poserPierre method, of class PlateauJeu.
     */
    @Test
    public void testPoserPierre() {
        System.out.println("poserPierre");
        Point2D p = null;
        String c = "";
        PlateauJeu instance = null;
        instance.poserPierre(p, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of caseEstLibre method, of class PlateauJeu.
     */
    @Test
    public void testCaseEstLibre() {
        System.out.println("caseEstLibre");
        Point2D p = new Point2D(2, 2);
        Point2D p1 = new Point2D(3, 2);
        PlateauJeu instance = new PlateauJeu(0,5,0,0,0);
        instance.getCases()[3][2].setCouleur("noir");
        boolean result = instance.caseEstLibre(p);
        boolean result1 = instance.caseEstLibre(p1); 
        assertTrue(result);
        assertFalse(result1);
    }

    /**
     * Test of estDansLePlateau method, of class PlateauJeu.
     */
    @Test
    public void testEstDansLePlateau() {
        System.out.println("estDansLePlateau");
        Point2D p1 = new Point2D(10,3);
        Point2D p2 = new Point2D(5,5);
        Point2D p3 = new Point2D(2,2);

        PlateauJeu instance = new PlateauJeu(0,5,0,0,0);
        //boolean expResult = false;
        boolean result = instance.estDansLePlateau(p1);
        assertFalse(result);
        
        boolean result1 = instance.estDansLePlateau(p2);
        assertFalse(result1);

        boolean result2 = instance.estDansLePlateau(p3);
        assertTrue(result2);
    }
       

    /**
     * Test of casesAutourDe method, of class PlateauJeu.
     */
    @Test
    public void testCasesAutourDe() {
        System.out.println("casesAutourDe");
         Point2D p = new Point2D(4,3);
         
        PlateauJeu instance = new PlateauJeu(0,5,0,0,0);
        instance.getCases()[4][3].setCouleur("noir");
        instance.getCases()[3][3].setCouleur("noir");
        instance.getCases()[3][3].setLibertes(+1);
        instance.getCases()[4][4].setCouleur("blanc");
        instance.getCases()[4][4].setLibertes(+1);
        instance.getCases()[4][2].setCouleur("blanc");
        instance.getCases()[4][2].setLibertes(+1);
        
        instance.casesAutourDe(p);
       
        assertEquals(instance.getCases()[3][3].getLibertes(), 0);
        assertEquals(instance.getCases()[4][4].getLibertes(), 0);
        assertEquals(instance.getCases()[4][2].getLibertes(), 0);
   
        assertTrue(instance.getCases()[4][3].getVoisinsMechants().contains(instance.getCases()[4][4]));
        assertTrue(instance.getCases()[4][4].getVoisinsMechants().contains(instance.getCases()[4][3]));
        
        assertTrue(instance.getCases()[4][3].getVoisinsMechants().contains(instance.getCases()[4][2]));
        assertTrue(instance.getCases()[4][2].getVoisinsMechants().contains(instance.getCases()[4][3]));
        
        assertTrue(instance.getCases()[4][3].getVoisins().contains(instance.getCases()[3][3]));
        assertTrue(instance.getCases()[3][3].getVoisins().contains(instance.getCases()[4][3]));
        
    }

    /**
     * Test of caseACote method, of class PlateauJeu.
     */
    @Test
    public void testCaseACote() {
        System.out.println("caseACote");
        Point2D p = new Point2D(3,3);
        Point2D pos = new Point2D(3,4);
        PlateauJeu instance = new PlateauJeu(0,5,0,0,0);
        instance.getCases()[3][3].setCouleur("noir");
        
        // Test dans le cas où la pierre voisine est de couleur différente
        instance.getCases()[3][4].setCouleur("blanc");
        instance.getCases()[3][4].setLibertes(+1);
        
        instance.caseACote(p, pos);
        assertEquals(instance.getCases()[3][4].getLibertes(), 0);
        assertTrue(instance.getCases()[3][4].getVoisinsMechants().contains(instance.getCases()[3][3]));
        assertTrue(instance.getCases()[3][3].getVoisinsMechants().contains(instance.getCases()[3][4]));
        
        //Test dans le cas où la pierre voisine est de même couleur
        instance.getCases()[3][4].setCouleur("noir");
        instance.getCases()[3][4].setLibertes(+1);
        
        instance.caseACote(p, pos);
        assertEquals(instance.getCases()[3][4].getLibertes(), 0);
        assertTrue(instance.getCases()[3][4].getVoisins().contains(instance.getCases()[3][3]));
        assertTrue(instance.getCases()[3][3].getVoisins().contains(instance.getCases()[3][4]));
       
    }

    /**
     * Test of verifierNonSuicide method, of class PlateauJeu.
     */
    @Test
    public void testVerifierNonSuicide() {
        System.out.println("verifierNonSuicide");
        Point2D p = null;
        PlateauJeu instance = null;
        boolean expResult = false;
        boolean result = instance.verifierNonSuicide(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierNonSuicideVoisin method, of class PlateauJeu.
     */
    @Test
    public void testVerifierNonSuicideVoisin() {
        System.out.println("verifierNonSuicideVoisin");
        Point2D p = null;
        ArrayList<Case> voisinsVerifies = null;
        PlateauJeu instance = null;
        boolean expResult = false;
        boolean result = instance.verifierNonSuicideVoisin(p, voisinsVerifies);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirerPierre method, of class PlateauJeu.
     */
    @Test
    public void testRetirerPierre() {
        System.out.println("retirerPierre");
        Point2D p = null;
        PlateauJeu instance = null;
        instance.retirerPierre(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enleveMechant method, of class PlateauJeu.
     */
    @Test
    public void testEnleveMechant() {
        System.out.println("enleveMechant");
        Point2D p = new Point2D(3,3);
        Point2D pos = new Point2D(3,4);
        Case voisin = new Case(p);
        PlateauJeu instance = new PlateauJeu(0,5,0,0,0);
        instance.enleveMechant(voisin, p);

    }

    /**
     * Test of capturerAutourDe method, of class PlateauJeu.
     */
    @Test
    public void testCapturerAutourDe() {
        System.out.println("capturerAutourDe");
        Point2D p = null;
        PlateauJeu instance = null;
        instance.capturerAutourDe(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierNonCapture method, of class PlateauJeu.
     */
    @Test
    public void testVerifierNonCapture() {
        System.out.println("verifierNonCapture");
        Point2D p = null;
        PlateauJeu instance = null;
        boolean expResult = false;
        boolean result = instance.verifierNonCapture(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierNonCaptureVoisin method, of class PlateauJeu.
     */
    @Test
    public void testVerifierNonCaptureVoisin() {
        System.out.println("verifierNonCaptureVoisin");
        Point2D p = null;
        ArrayList<Case> voisinsVerifies = null;
        PlateauJeu instance = null;
        boolean expResult = false;
        boolean result = instance.verifierNonCaptureVoisin(p, voisinsVerifies);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
