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
public class PlateauJeuTest {
    
    private PlateauJeu instance = new PlateauJeu(0,5,0,0,0);
    
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
        instance.setCote(5);
        int i; int j; 
        for (i=0; i<5; i++) {
            for (j=0; j<5; j++) {
                Point2D p = new Point2D(i, j);
                instance.getCases()[i][j] = new Case(p);
            }
        }
        // On initialise la case d'étude
        instance.getCases()[4][3].setCouleur("noir");
        
        // On initialise les voisins gentils
        instance.getCases()[3][3].setCouleur("noir");

        // On initialise les voisins mechants
        instance.getCases()[4][4].setCouleur("blanc");
        instance.getCases()[4][2].setCouleur("blanc");        
    }
    
    
    @After
    public void tearDown() {
    }

  
    /**
     * Test of getCases method, of class PlateauJeu.
     */ 
    @Ignore
    @Test
    public void testGetCases() {
        System.out.println("getCases");
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
        int expResult = 5;
        int result = instance.getCote();
        assertEquals(expResult, result);
    }



    /**
     * Test of setCases method, of class PlateauJeu.
     */
    @Ignore
    @Test
    public void testSetCases() {
        System.out.println("setCases");
        Case Test[][];   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCote method, of class PlateauJeu.
     */
    @Test
    public void testSetCote() {
        System.out.println("setCote");
        instance.setCote(456);
        assertEquals(instance.getCote(), 456);
           
    }

    /**
     * Test of poserPierre method, of class PlateauJeu.
     */
    @Ignore
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
        Point2D p10 = new Point2D(1, 1);
        Point2D p11 = new Point2D(4, 3);
        assertTrue(instance.caseEstLibre(p10));
        assertFalse(instance.caseEstLibre(p11));
    }

    /**
     * Test of estDansLePlateau method, of class PlateauJeu.
     */
    @Test
    public void testEstDansLePlateau() {
        System.out.println("estDansLePlateau");
        Point2D p10 = new Point2D(10,3);
        Point2D p11 = new Point2D(5,5);
        Point2D p12 = new Point2D(2,2);

        PlateauJeu instance = new PlateauJeu(0,5,0,0,0);
        //boolean expResult = false;
        boolean result = instance.estDansLePlateau(p10);
        assertFalse(result);
        
        boolean result1 = instance.estDansLePlateau(p11);
        assertFalse(result1);

        boolean result2 = instance.estDansLePlateau(p12);
        assertTrue(result2);
    }
       

    /**
     * Test of casesAutourDe method, of class PlateauJeu.
     */
   
    @Test
    public void testCasesAutourDe() {
        System.out.println("casesAutourDe");
         
        instance.getCases()[3][3].setLibertes(+1);
        instance.getCases()[4][4].setLibertes(+1);
        instance.getCases()[4][2].setLibertes(+1);
        
        instance.casesAutourDe(instance.getCases()[4][3].getPosition());
       // On vérifie qu'on a bien retirer une liberté à tous les voisins de la pierre posée
        assertEquals(instance.getCases()[3][3].getLibertes(), 0);
        assertEquals(instance.getCases()[4][4].getLibertes(), 0);
        assertEquals(instance.getCases()[4][2].getLibertes(), 0);
   
        // on teste le remplissage de la liste des voisins méchants
        assertTrue(instance.getCases()[4][3].getVoisinsMechants().contains(instance.getCases()[4][4]));
        assertTrue(instance.getCases()[4][4].getVoisinsMechants().contains(instance.getCases()[4][3]));
        
        assertTrue(instance.getCases()[4][3].getVoisinsMechants().contains(instance.getCases()[4][2]));
        assertTrue(instance.getCases()[4][2].getVoisinsMechants().contains(instance.getCases()[4][3]));
        
        // on teste le remplissage de la liste des voisins gentils
        assertTrue(instance.getCases()[4][3].getVoisins().contains(instance.getCases()[3][3]));
        assertTrue(instance.getCases()[3][3].getVoisins().contains(instance.getCases()[4][3]));
        
    }

    /**
     * Test of caseACote method, of class PlateauJeu.
     */
    @Test
    public void testCaseACote() {
        System.out.println("caseACote");       
        // Test dans le cas où la pierre voisine est de couleur différente
        instance.getCases()[4][2].setLibertes(+1);
        
        instance.caseACote(instance.getCases()[4][3].getPosition(), instance.getCases()[4][2].getPosition());
        assertEquals(instance.getCases()[4][2].getLibertes(), 0);
        assertTrue(instance.getCases()[4][3].getVoisinsMechants().contains(instance.getCases()[4][2]));
        assertTrue(instance.getCases()[4][2].getVoisinsMechants().contains(instance.getCases()[4][3]));
        
        //Test dans le cas où la pierre voisine est de même couleur
        instance.getCases()[3][3].setLibertes(+1);
        
        instance.caseACote(instance.getCases()[4][3].getPosition(), instance.getCases()[3][3].getPosition());
        assertEquals(instance.getCases()[3][3].getLibertes(), 0);
        assertTrue(instance.getCases()[4][3].getVoisins().contains(instance.getCases()[3][3]));
        assertTrue(instance.getCases()[3][3].getVoisins().contains(instance.getCases()[4][3]));
       
    }

    /**
     * Test of verifierNonSuicide method, of class PlateauJeu.
     */
    @Ignore
    @Test
    public void testVerifierNonSuicide() {
        System.out.println("verifierNonSuicide");
        
        boolean expResult = false;
      //  boolean result = instance.verifierNonSuicide(p);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierNonSuicideVoisin method, of class PlateauJeu.
     */
    @Ignore
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
        Point2D p = new Point2D(4,3);
        Point2D p1 = new Point2D(1,1);
         
        instance.getCases()[4][3].setLibertes(1);
        
        // On initialise les voisins mechants
        instance.getCases()[4][3].setVoisinsMechants(instance.getCases()[3][3]);
        
        // On initialise les voisins mechants
        instance.getCases()[4][3].setVoisinsMechants(instance.getCases()[4][4]);

        // On initilaise les voisins méchants      
        instance.getCases()[4][3].setVoisinsMechants(instance.getCases()[4][2]);

        
        instance.retirerPierre(p);
        
        // on teste qu'on a bien rajouté une liberté aux voisins méchants de la pierre retirée
        assertEquals(instance.getCases()[4][4].getLibertes(), 1);
        assertEquals(instance.getCases()[4][2].getLibertes(), 1);
        
        // on teste qu'on a bien retiré la pierre des listes de voisins méchants
        assertFalse(instance.getCases()[4][4].getVoisinsMechants().contains(instance.getCases()[4][3]));
        assertFalse(instance.getCases()[4][2].getVoisinsMechants().contains(instance.getCases()[4][3]));
        
        
        // on teste que la case a bien été réinitialisée
        assertTrue(instance.getCases()[4][3].getVoisins().isEmpty());
        assertTrue(instance.getCases()[4][3].getVoisinsMechants().isEmpty());
        assertEquals(instance.getCases()[4][3].getCouleur(), "vide");
        assertEquals(instance.getCases()[4][3].getPosition(), p);
        assertEquals(instance.getCases()[4][3].getLibertes(), 0);
    }

    /**
     * Test of capturerAutourDe method, of class PlateauJeu.
     */
    @Ignore
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
    @Ignore
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
    @Ignore
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
