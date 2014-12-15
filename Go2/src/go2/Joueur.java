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
    private String couleur;
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
        LinkedList<Point2D> cases = new  LinkedList<> (plateau.caseLibreAutourDe(point)); 
        
        for (Point2D p : cases) {
            if (point.comparePoint(p)) {
                Pierre pierre = new Pierre(this.couleur, point);
                this.plateau.ajouterPierre(pierre);
                System.out.println("Pierre placée");
                break;
            }
            else {
                System.out.println("Impossible de placer la pierre à cet endroit");
            }
        }
    }
    
    
    public void passerTour() {
        
    }
    
}
