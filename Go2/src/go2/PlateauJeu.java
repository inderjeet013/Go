/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package go2;

/**
 *
 * @author jtaillan
 */


import java.util.LinkedList;

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

    public PlateauJeu(int k, int c, boolean h, int pNc, int pBc) {
        this.komi = k;
        this.cote = c;
        this.handicap = h;
        this.pierresNoiresCapturees = pNc;
        this.pierresBlanchesCapturees = pBc;
    }
//getters
    public int getKomi() {
        return komi;
    }

    public int getCote() {
        return cote;
    }

    public boolean getHandicap() {
        return handicap;
    }

    public int getPierresNoiresCapturees() {
        return pierresNoiresCapturees;
    }

    public int getPierresBlanchesCapturees() {
        return pierresBlanchesCapturees;
    }
//Setters
    public void setKomi(int k) {
        komi = k;
    }

    public void setCote(int c) {
        cote = c;
    }

    public void setHandicap(boolean h) {
        handicap = h;
    }

    public void setPierresNoiresCapturees(int pNc) {
        pierresNoiresCapturees = pNc;
    }

    public void setPierresBlanchesCapturees(int pBc) {
        pierresBlanchesCapturees = pBc;
    }
//Méthodes
    public void initPlateau() {
    }
}
