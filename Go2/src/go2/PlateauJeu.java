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


/** ajout d'une pierre dans une liste
 * 
 * @param p 
 */

    public void ajouterPierre(Pierre p) {
        this.pierres.add(p);
    }

    /**Verification si une position est innocupée
     * 
     * @param p
     * @return 
     */
    public boolean caseLibre (Point2D p) {
    }
        boolean test = true ;
        
       for (int i=0; (i<=this.pierres.size()); i++) {
            
            if (p.comparePoint(this.pierres.get(i).getPosition())){

                test = false;
            }
        }
        return test;
    }


    /**
     * vérifie si une position est à l'intérieur du plateau
     * @param p
     * @return 
     */
    public boolean estDansLePlateau (Point2D p) {
        return (p.getX()>=0)&&(p.getX()<=this.cote)&&(p.getY()>=0)&&(p.getY()<=this.cote);
    }
    /**
     * Vérifie les cases libres autour d'une position
     * @param p
     * @return 
     */

    public LinkedList<Point2D> caseLibreAutourDe(Point2D p) {
        LinkedList<Point2D> list = new LinkedList();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {

                if ((i != 0) && (j != 0)) {
                    Point2D p1 = new Point2D(p.getX() + i, p.getY() + j);
                    if (this.caseLibre(p1)) {
                        list.add(p1);
                    }

                if((i!=0)&&(j!=0)&&(i!=j)){
                Point2D p1 = new Point2D(p.getX()+i,p.getY()+j);
                if ((this.caseLibre(p1))&&(this.estDansLePlateau(p1))) {
                    list.add(p1);
                }
          
            }
        }


                }
            }

        }
        return list;

    }


    public checkSuicide() {
    }


}
    /** 
     * Termine la partie
     */

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

    /**
     * Définit le tour de jeu
     * @param j 
     */
       public void jouer(Joueur j){
        Scanner console = new Scanner(System.in);
        System.out.println("Voulez-vous placer une pierre ?");
        String reponse = console.nextLine();
        System.out.println(reponse);
        
        if (reponse=="oui") {
            Scanner console2 = new Scanner(System.in);
            System.out.println("Quelle est l'abscisse de la pierre ?");
            int abs = console.nextInt();
            System.out.println("Quelle est l'ordonnée de la pierre ?");
            int ord = console.nextInt();
            
            Point2D p = new Point2D(abs,ord);
            
            while()
            
        }
            j.placerPierre(null);
        }
    

}
