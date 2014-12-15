package go2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
// Penser à changer les fonctions utilisant pierres et remplacer par cases
// Pour la capture de pions, on recherche les cases de couleur différentes
// Puis avec recherche on regarde si la case a des voisins vides et sinon on checke si elle a des voisins de meme couleur, etc...

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
    private int nombreToursPasses;
    private LinkedList<Pierre> pierres;
    private Case[][] Cases =new Case[cote-1][cote-1];
    
    public PlateauJeu(int k, int c, boolean h, int pNc, int pBc) {
        this.komi = k;
        this.cote = c;
        this.handicap = h;
        this.pierresNoiresCapturees = pNc;
        this.pierresBlanchesCapturees = pBc;
        this.nombreToursPasses = 0;
        this.Cases =new Case[cote-1][cote-1];
        
    }

    public LinkedList<Pierre> getPierres() {
        return pierres;
    }

    public boolean isHandicap() {
        return handicap;
    }

    public void setPierres(LinkedList<Pierre> pierres) {
        this.pierres = pierres;
    }

    //getters
    public int getNombreToursPasses() {
        return nombreToursPasses;
    }

    public Case[][] getCases() {
        return Cases;
    }
    
    
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

    //Setters
    
    public void setKomi(int komi) {
        this.komi = komi;
    }

    public void setNombreToursPasses(int nombreToursPasses) {
        this.nombreToursPasses = nombreToursPasses;
    }

    public void setCases(Case[][] Cases) {
        this.Cases = Cases;
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
    public void ajouterPierre(Pierre p) {
        this.pierres.add(p);
    }

    public boolean caseLibre(Point2D p) {
        boolean test = true;

        for (int i = 0; (i <= this.pierres.size()); i++) {

            if (this.pierres.get(i).getPosition().comparePoint(p)) {
                test = false;
            }
        }
        return test;
    }

    public LinkedList<Point2D> caseLibreAutourDe(Point2D p) {
        LinkedList<Point2D> list = new LinkedList();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if ((i != 0) && (j != 0)) {
                    Point2D p1 = new Point2D(p.getX() + i, p.getY() + j);
                    if (this.caseLibre(p1)) {
                        list.add(p1);
                    }

                }
            }

        }
        return list;
    }


    public checkSuicide() {
    }

    public void finPartie() {
        if (this.nombreToursPasses == 2) {
            System.out.println("Partie terminée !");
            this.compterScores();
        }
    }

    public void capturerPierre(Pierre pierre) {
        LinkedList<Pierre> listePierre = new LinkedList<>();
        String couleur = pierre.getCouleur();
        Point2D position = pierre.getPosition();
        
    }
    public void recherchePierre (Point2D positionPrec){
        if ((caseLibreAutourDe(pierre.getPosition())).isEmpty()){
            for(int k=-1;k<=1;k+=2){
                
            }
                
        }
    }
}
