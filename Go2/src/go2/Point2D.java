/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jtaillan
 */
package go2; 

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    /**
     * affiche la position de la pierre
     */
    public void affichePosition() {
        System.out.println("Pierre en position (" + this.getX() + ", " + this.getY() + ")");
}
 
}
