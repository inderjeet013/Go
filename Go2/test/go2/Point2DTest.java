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
    
    private int x = 1;
    private int y = 2;
    private Point2D instance = new Point2D(x,y);

    
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
        x = 1;
        y = 1;
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
        int expResult = 1;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getY method, of class Point2D.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        int expResult = 2;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setX method, of class Point2D.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        instance.setX(1);
        assertEquals(1, instance.getX());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
