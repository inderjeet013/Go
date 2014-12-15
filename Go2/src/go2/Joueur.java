/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package go2;

import java.util.LinkedList;

/**
 *
 * @author jtaillan
 */
public class Joueur {
    private boolean handicap;
    private int komi;
    private int pierresCapturees;
    private PlateauJeu plateau;

    public Joueur(boolean handicap, int komi, PlateauJeu plateau) {
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

    public PlateauJeu getPlateau() {
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

    public void setPlateau(PlateauJeu plateau) {
        this.plateau = plateau;
    }
    
    
    public void jouer(Point2D point){
        
    }
    
    public void placerPierre(Point2D point) {
        LinkedList<Point2D> cases = new  LinkedList<>(); 
        
     
    }
    
    public void passerTour() {
        
    }
    
}
