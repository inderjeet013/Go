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
     * Test of getNombreToursPasses method, of class PlateauJeu.
     */
    @Test
    public void testGetNombreToursPasses() {
        System.out.println("getNombreToursPasses");
        PlateauJeu instance = null;
        int expResult = 0;
        int result = instance.getNombreToursPasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCases method, of class PlateauJeu.
     */
    @Test
    public void testGetCases() {
        System.out.println("getCases");
        PlateauJeu instance = null;
        Case[][] expResult = null;
        Case[][] result = instance.getCases();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKomi method, of class PlateauJeu.
     */
    @Test
    public void testGetKomi() {
        System.out.println("getKomi");
        PlateauJeu instance = null;
        int expResult = 0;
        int result = instance.getKomi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of getPierresNoiresCapturees method, of class PlateauJeu.
     */
    @Test
    public void testGetPierresNoiresCapturees() {
        System.out.println("getPierresNoiresCapturees");
        PlateauJeu instance = null;
        int expResult = 0;
        int result = instance.getPierresNoiresCapturees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPierresBlanchesCapturees method, of class PlateauJeu.
     */
    @Test
    public void testGetPierresBlanchesCapturees() {
        System.out.println("getPierresBlanchesCapturees");
        PlateauJeu instance = null;
        int expResult = 0;
        int result = instance.getPierresBlanchesCapturees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombrePierresdAvance method, of class PlateauJeu.
     */
    @Test
    public void testGetNombrePierresdAvance() {
        System.out.println("getNombrePierresdAvance");
        PlateauJeu instance = null;
        int expResult = 0;
        int result = instance.getNombrePierresdAvance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKomi method, of class PlateauJeu.
     */
    @Test
    public void testSetKomi() {
        System.out.println("setKomi");
        int komi = 0;
        PlateauJeu instance = null;
        instance.setKomi(komi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreToursPasses method, of class PlateauJeu.
     */
    @Test
    public void testSetNombreToursPasses() {
        System.out.println("setNombreToursPasses");
        int nombreToursPasses = 0;
        PlateauJeu instance = null;
        instance.setNombreToursPasses(nombreToursPasses);
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
     * Test of setPierresNoiresCapturees method, of class PlateauJeu.
     */
    @Test
    public void testSetPierresNoiresCapturees() {
        System.out.println("setPierresNoiresCapturees");
        int pierresNoiresCapturees = 0;
        PlateauJeu instance = null;
        instance.setPierresNoiresCapturees(pierresNoiresCapturees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPierresBlanchesCapturees method, of class PlateauJeu.
     */
    @Test
    public void testSetPierresBlanchesCapturees() {
        System.out.println("setPierresBlanchesCapturees");
        int pierresBlanchesCapturees = 0;
        PlateauJeu instance = null;
        instance.setPierresBlanchesCapturees(pierresBlanchesCapturees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombrePierresdAvance method, of class PlateauJeu.
     */
    @Test
    public void testSetNombrePierresdAvance() {
        System.out.println("setNombrePierresdAvance");
        int nombrePierresdAvance = 0;
        PlateauJeu instance = null;
        instance.setNombrePierresdAvance(nombrePierresdAvance);
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
        Point2D p = null;
        PlateauJeu instance = null;
        boolean expResult = false;
        boolean result = instance.caseEstLibre(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estDansLePlateau method, of class PlateauJeu.
     */
    @Test
    public void testEstDansLePlateau() {
        System.out.println("estDansLePlateau");
        Point2D p = null;
        PlateauJeu instance = null;
        boolean expResult = false;
        boolean result = instance.estDansLePlateau(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of casesAutourDe method, of class PlateauJeu.
     */
    @Test
    public void testCasesAutourDe() {
        System.out.println("casesAutourDe");
        Point2D p = null;
        PlateauJeu instance = null;
        instance.casesAutourDe(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of caseACote method, of class PlateauJeu.
     */
    @Test
    public void testCaseACote() {
        System.out.println("caseACote");
        Point2D p = null;
        Point2D pos = null;
        PlateauJeu instance = null;
        instance.caseACote(p, pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        Case voisin = null;
        Point2D p = null;
        PlateauJeu instance = null;
        instance.enleveMechant(voisin, p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
