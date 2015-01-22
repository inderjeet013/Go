/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package go2;

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
public class Point2DTest {
    
    public Point2DTest() {
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
     * Test of getX method, of class Point2D.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Point2D instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Point2D.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Point2D instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Point2D.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Point2D instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Point2D.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Point2D instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of affichePosition method, of class Point2D.
     */
    @Test
    public void testAffichePosition() {
        System.out.println("affichePosition");
        Point2D instance = null;
        instance.affichePosition();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparePoint method, of class Point2D.
     */
    @Test
    public void testComparePoint() {
        System.out.println("comparePoint");
        Point2D p = null;
        Point2D instance = null;
        boolean expResult = false;
        boolean result = instance.comparePoint(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
