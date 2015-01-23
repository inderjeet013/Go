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
    private int nombrePierresdAvance;
    private int pierresNoiresCapturees;
    private int pierresBlanchesCapturees;
    private int nombreToursPasses;
    private Case Cases[][];

    public PlateauJeu(int k, int c, int n, int pNc, int pBc) {
        this.komi = k;
        this.cote = c;
        this.nombrePierresdAvance = n;
        this.pierresNoiresCapturees = pNc;
        this.pierresBlanchesCapturees = pBc;
        this.nombreToursPasses = 0;
        this.Cases = new Case[cote][cote];
        int i; int j; 
        for (i=0; i<c; i++) {
            for (j=0; j<c; j++) {
                Point2D p = new Point2D(i, j);
                this.Cases[i][j] = new Case(p);
            }
        }
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

    public int getNombrePierresdAvance() {
        return nombrePierresdAvance;
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

    public void setPierresNoiresCapturees(int pierresNoiresCapturees) {
        this.pierresNoiresCapturees = pierresNoiresCapturees;
    }

    public void setPierresBlanchesCapturees(int pierresBlanchesCapturees) {
        this.pierresBlanchesCapturees = pierresBlanchesCapturees;
    }

    public void setNombrePierresdAvance(int nombrePierresdAvance) {
        this.nombrePierresdAvance = nombrePierresdAvance;
    }

    //Méthodes
    /**
     * Une pierre peut être posée si sa position est bien dans le plateau et est inoccupée, et si cela ne provoque pas de suicide ni de ko
     *
     * @param p
     */
    public void poserPierre(Point2D p, String c) {
        if (this.estDansLePlateau(p) && this.caseEstLibre(p)) {
            // Si la case est bien dans le plateau et libre, on pose la pierre et on met à jour la liste de ses voisins et ses libertés
            this.casesAutourDe(p);
            
            // On regarde si la pose de la pierre ne génère pas de suicide
            if (this.verifierNonSuicide(p) == false) {
                this.retirerPierre(p);
            }
            // On passe ensuite à une éventuelle phase de capture
            this.capturerAutourDe(p);  
        }
    }

    /**
     * Verifier si une position est innocupée
     *
     * @param p
     * @return
     */
    public boolean caseEstLibre(Point2D p) {
        if (this.Cases[p.getX()][p.getY()].getCouleur().equals("vide")) {
            return true;
        } 
        else {
            System.out.println("Case déjà occupée ! ");
            return false;
        }
    }

    /**
     * vérifie si une position est à l'intérieur du plateau
     * @param p
     *
     * @return
     */
    public boolean estDansLePlateau(Point2D p) {
        if ((p.getX() <= 0) || (p.getX() >= this.cote) || (p.getY() <= 0) || (p.getY() >= this.cote)) {
            System.out.println("La position demandée est hors plateau !");
            return false;
        } else {
            return true;
        }

    }

    /**
     * Détermine le nombre de libertés d'une pierre qui vient d'être posée,la
     * liste de ses voisins de même couleur et la liste de ses voisins de couleur différente
     *
     * @param p
     */
    public void casesAutourDe(Point2D p) {

        int x = p.getX();
        int y = p.getY();
        Point2D pos = new Point2D(x + 1, y);
        this.caseACote(p, pos);

        pos.setX(x - 1);
        this.caseACote(p, pos);

        pos.setX(x);
        pos.setY(y + 1);
        this.caseACote(p, pos);

        pos.setY(y - 1);
        this.caseACote(p, pos);
    }

    /**
     * Examine une case voisine d'une pierre qui vient d'être posée. En fonction
     * de la nature de la case voisin on modifie les libertés et les voisins de
     * la pierre étudiées et idem pour cette case voisine
     *
     * @param p
     * @param pos
     */
    public void caseACote(Point2D p, Point2D pos) {
        int x = p.getX();
        int y = p.getY();
        int a = pos.getX();
        int b = pos.getY();
        // On teste si la case voisine est bien dans le plateau
        if (estDansLePlateau(pos)) {;
            // Si oui et qu'elle est libre la pierre posée à une liberté
            if (caseEstLibre(pos)) {
                this.Cases[x][y].setLibertes(1);
            } else {
                // si la case voisine est occupée, 
                // que la pierre voisine soit de même couleur ou non on lui retire une liberté
                this.Cases[a][b].setLibertes(-1);
                // si elle contient une pierre de même couleur 
                if (Cases[a][b].getCouleur() == this.Cases[x][y].getCouleur()) {
                    // on rajoute cette case voisine parmi les voisins de la case étudiée
                    this.Cases[x][y].setVoisins(this.Cases[a][b]);
                    // on rajoute la case étudiée parmi les voisins de la case voisine
                    this.Cases[a][b].setVoisins(this.Cases[x][y]);
                }
                //si la case voisine contient une pierre de l'autre couleur 
                else { 
                    // on rajoute cette case voisine parmi les voisins méchants de la case étudiée
                    this.Cases[x][y].setVoisinsMechants(this.Cases[a][b]);
                    // on rajoute la case étudiée parmi les voisins méchants de la case voisine
                    this.Cases[a][b].setVoisinsMechants(this.Cases[x][y]);
                }
                
            }

        }
    }


    /* verifier que la pose d'une pierre n'entraîne pas de suicide
     * 
     */
    public boolean verifierNonSuicide(Point2D p) {
        boolean test;
        // si la pierre a des libertés elle est en vie
        if (Cases[p.getX()][p.getY()].getLibertes() > 0) {
            return true;
        } else {
            // si la case n'a pas de libertés et pas de voisins de même couleur la pierre est morte
            if (Cases[p.getX()][p.getY()].getVoisins().isEmpty()) {
                return false;
            } // si la case a des voisins de même couleur elle fait partie d'un groupe.  
            // On regarde si ce groupe a des libertés car la pierre étudiée n'en a pas. 
            else {
                ArrayList<Case> voisinsVerifies = new ArrayList<Case>();
                voisinsVerifies.add(Cases[p.getX()][p.getY()]);
                test = this.verifierNonSuicideVoisin(p, voisinsVerifies);
                // Si suicide message d'erreur
                if (test == false) {
                    System.out.println("Impossible de poser la pièce à cet endroit car il s'agit d'un suicide");
                }
                return test;
            }

        }
    }

    /**
     * Fonction récursive permettant de vérifier si le groupe de la pierre
     * étudiée possède une liberté.
     *
     * @param p
     * @param voisinsVerifies
     * @return
     */
    public boolean verifierNonSuicideVoisin(Point2D p, ArrayList<Case> voisinsVerifies) {
        boolean test = false;
// On parcourt la liste des voisins de la pierre étudiée
        for (Case voisin : Cases[p.getX()][p.getY()].getVoisins()) {

            // on vérifie que la pierre n'a pas déjà été étudiée pour éviter de boucler indéfiniment
            if (voisinsVerifies.contains(voisin) == false) {
                // Si ce n'est pas le cas on l'ajoute dans les voisins étudiées
                voisinsVerifies.add(voisin);
                // Puis on regarde si elle  possède des libertés. Si oui pas besoin de tester tous les voisins on peut sortir de la boucle. 
                if (voisin.getLibertes() > 0) {
                    return true;
                } // Si elle n'en a pas on regarde si elle-même a des voisins ayant des libertés
                else {
                    // Le caractère récursif de la fonction fait qu'on va tester des pierres du groupe tant qu'on ne trouvera pas de liberté 
                    test = this.verifierNonSuicideVoisin(voisin.getPosition(), voisinsVerifies);
                }
            }
            // Si on trouve un voisin avec des libertés pas besoin de tester tous les autres on peut sortir de la boucle.
            if (test) {
                break;
            }
        }
        return test;
    }

    /**
     * Pour retirer une Pierre il faut rajouter une liberté à ses voisins méchants et supprimer sa place dans la liste des voisins méchants,
     * ré-initialiser la case, et incrémenter le compteur de pièces capturées. 
     * Pas besoin de rajouter une liberté à ses voisins gentils car ils sont supprimés aussi. 
     *
     * @param p
     */
    public void retirerPierre(Point2D p) {
        for (Case mechant: Cases[p.getX()][p.getY()].getVoisinsMechants()) {
            mechant.setLibertes(1); // ajoute une liberté au voisin méchant
            mechant.enleverVoisinMechant(Cases[p.getX()][p.getY()]);}// retire la pierre en position p de la liste des voisins méchants de voisin
       if (Cases[p.getX()][p.getY()].getCouleur().equals("noir")) {
           this.pierresNoiresCapturees ++; // incrémente le compteur de pièces capturées
       }
       else {
           this.pierresBlanchesCapturees ++;
       }
        Cases[p.getX()][p.getY()] = new Case(p);
    }

    
    public void capturerAutourDe(Point2D p) {
        for (Case voisin : Cases[p.getX()][p.getY()].getVoisinsMechants()) {
            // On vérifie que le voisin méchant n'est pas déjà été supprimé
            if ((voisin.getCouleur() != "vide") && (verifierNonCapture(voisin.getPosition()) == false)) {
            
            System.out.println("Capture du groupe contenant la pièce " + voisin.getCouleur() + "en position ("+ voisin.getPosition().getX() + ","+ voisin.getPosition().getY() + ")");
                
            }
        }
    }
    
    /* verifier que la pose d'une pierre n'entraîne pas de suicide
     * 
     */
    public boolean verifierNonCapture(Point2D p) {
        boolean test;
        // si la pierre a des libertés elle est en vie
        if (Cases[p.getX()][p.getY()].getLibertes() > 0) {
            return true;
        } else {
            // si la case n'a pas de libertés et pas de voisins de même couleur la pierre est morte
            if (Cases[p.getX()][p.getY()].getVoisins().isEmpty()) {
                return false;
            } // si la case a des voisins de même couleur elle fait partie d'un groupe.  
            // On regarde si ce groupe a des libertés car la pierre étudiée n'en a pas. 
            else {
                ArrayList<Case> voisinsVerifies = new ArrayList<Case>();
                voisinsVerifies.add(Cases[p.getX()][p.getY()]);
                test = this.verifierNonCaptureVoisin(p, voisinsVerifies);
                return test;
            }

        }
    }

    public boolean verifierNonCaptureVoisin(Point2D p, ArrayList<Case> voisinsVerifies) {
        boolean test = false;
// On parcourt la liste des voisins de la pierre étudiée
        for (Case voisin : Cases[p.getX()][p.getY()].getVoisins()) {

            // on vérifie que la pierre n'a pas déjà été étudiée pour éviter de boucler indéfiniment
            if (voisinsVerifies.contains(voisin) == false) {
                // Si ce n'est pas le cas on l'ajoute dans les voisins étudiées
                voisinsVerifies.add(voisin);
                // Puis on regarde si elle  possède des libertés. Si oui pas besoin de tester tous les voisins on peut sortir de la boucle. 
                if (voisin.getLibertes() > 0) {
                    return true;
                } // Si elle n'en a pas on regarde si elle-même a des voisins ayant des libertés
                else {
                    // Le caractère récursif de la fonction fait qu'on va tester des pierres du groupe tant qu'on ne trouvera pas de liberté 
                    test = this.verifierNonCaptureVoisin(voisin.getPosition(), voisinsVerifies);
                }
            }
            // Si  on trouve un voisin avec des libertés pas besoin de tester tous les autres on peut sortir de la boucle.
            if (test) {
                break;
            }
        }
        // On retire les pierres si elles sont capturées
        if (test == false) {
            for (Case voisin2 : voisinsVerifies) {
                this.retirerPierre(voisin2.getPosition());
            }           
        }
        return test;
    }
}

    /**
     * Termine la partie
     *//*
    public void finPartie() {
        if (this.nombreToursPasses == 2) {
            System.out.println("Partie terminée !");
            this.compterScores();
        }
    }

    /**
     * Définit le tour de jeu
     *
     * @param j
     */
    /*public void jouer(Joueur j) {
        Scanner console = new Scanner(System.in);
        System.out.println("Voulez-vous placer une pierre ?");
        String reponse = console.nextLine();
        System.out.println(reponse);

        if (reponse == "oui") {
            Scanner console2 = new Scanner(System.in);
            System.out.println("Quelle est l'abscisse de la pierre ?");
            int abs = console.nextInt();
            System.out.println("Quelle est l'ordonnée de la pierre ?");
            int ord = console.nextInt();

            Point2D p = new Point2D(abs, ord);

            while () {
            }
        }
        j.placerPierre(null);
    }
}
*/