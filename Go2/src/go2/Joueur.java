/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package go2;

/**
 *
 * @author jtaillan
 */
public class Joueur {
    private boolean handicap;
    private int komi;
    private int pierresCapturees;
    private Plateau plateau;

    public Joueur(boolean handicap, int komi, Plateau plateau) {
        this.handicap = handicap;
        this.komi = komi;
        this.plateau = plateau;
    }


    public boolean isHandicap() {
        return handicap;
    }

    public int getKomi() {
        return komi;
    }

    public int getPierresCapturees() {
        return pierresCapturees;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setHandicap(boolean handicap) {
        this.handicap = handicap;
    }

    public void setKomi(int komi) {
        this.komi = komi;
    }

    public void setPierresCapturees(int pierresCapturees) {
        this.pierresCapturees = pierresCapturees;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }
    
    
    public void jouer(Point2D point){
        
    }
    
    public void placerPierre(Point2D point) {
        
    }
    
    public void passerTour() {
        
    }
    
}
