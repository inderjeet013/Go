package go2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//Setters
/**
 *
 * @author slevy
 */
public class PlateauJeu {

    private int komi;
    private int cote;
    private boolean handicap;
    private int pierresNoiresCapturees;
    private int pierresBlanchesCapturees;
    private LinkedList<Point2D> pierresNoires;
     private LinkedList<Point2D> pierresBlanches;

    public PlateauJeu(int k, int c, boolean h, int pNc, int pBc) {
        this.komi = k;
        this.cote = c;
        this.handicap = h;
        this.pierresNoiresCapturees = pNc;
        this.pierresBlanchesCapturees = pBc;
    }

    public LinkedList<Point2D> getPierresNoires() {
        return pierresNoires;
    }

    public LinkedList<Point2D> getPierresBlanches() {
        return pierresBlanches;
    }

    public boolean isHandicap() {
        return handicap;
    }

    public void setPierresNoires(LinkedList<Point2D> pierresNoires) {
        this.pierresNoires = pierresNoires;
    }

    public void setPierresBlanches(LinkedList<Point2D> pierresBlanches) {
        this.pierresBlanches = pierresBlanches;
    }

    //getters
    public int getKomi() {
        return komi;
    }

    public int getCote() {
        return cote;
    }

    public int getPierresNoiresCapturees() {
        return pierresNoiresCapturees;
    }

    public int getPierresBlanchesCapturees() {
        return pierresBlanchesCapturees;
    }

    public void setKomi(int komi) {
        this.komi = komi;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    public void setHandicap(boolean handicap) {
        this.handicap = handicap;
    }

    public void setPierresNoiresCapturees(int pierresNoiresCapturees) {
        this.pierresNoiresCapturees = pierresNoiresCapturees;
    }

    public void setPierresBlanchesCapturees(int pierresBlanchesCapturees) {
        this.pierresBlanchesCapturees = pierresBlanchesCapturees;
    }

    //Méthodes
    
    public boolean caseLibre (Point2D p) {
        boolean test = true ;
        for (int i=0; i=; i++) {
            
        }
    }
    
    
    public LinkedList<Point2D> caseLibreAutourDe(Point2D p) {
        LinkedList<Point2D> list = new LinkedList();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if((i<>0)&&(j<>0)){
                Point2D p1 = new Point2D(p.getX()+i,p.getY()+j);
                if (this.caseLibre(p1)) {
                    list.add(p1);
                }
          
            }
        }

    }
        return list;
}
}
