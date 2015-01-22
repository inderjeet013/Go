/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package go2;
import java.util.ArrayList;

/**
 *
 * @author jtaillan
 */
public class Go2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String couleur = "noir";
        int libertes = 1;
        int x = 1;
        int y = 2;
        Point2D point = new Point2D(x, y);  
        Case mechant = new Case (point);
        Case gentil = new Case (point);
        
        ArrayList<Case> l1 = new ArrayList<Case>();
        l1.add(mechant);
        
        ArrayList<Case> l2 = new ArrayList<Case>();
        l2.add(gentil);
    
    }
}
