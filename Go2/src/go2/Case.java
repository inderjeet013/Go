/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//
/// Julien
package go2;

import java.util.ArrayList;

/**
 *
 * @author jtaillan
 */
public class Case {

    private String couleur;
    private Point2D position;
    private int libertes;
    //pierres adjacents de la même couleur
    private ArrayList<Case> voisins;
    //pierres adjacents de la même couleur
    private ArrayList<Case> voisinsMechants;

    // Constructeur
    public Case(Point2D position) {
        this.couleur = "vide";
        this.position = position;
        this.libertes = 0;
        this.voisins = new ArrayList<Case>();
        this.voisinsMechants = new ArrayList<Case>();
    }

    public Case(Case c) {
        this.couleur = c.getCouleur();
        this.position = c.getPosition();
        this.libertes = c.getLibertes();
        this.voisinsMechants = c.getVoisins();

    }

    // Getters
    public String getCouleur() {
        return couleur;
    }

    public Point2D getPosition() {
        return position;
    }

    public int getLibertes() {
        return libertes;
    }

    public ArrayList<Case> getVoisins() {
        return voisins;
    }

    public ArrayList<Case> getVoisinsMechants() {
        return voisinsMechants;
    }

    // Setters
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public void setLibertes(int l) {
        this.libertes = this.libertes + l;
    }

    public void setVoisins(ArrayList<Case> voisins) {
        this.voisins = voisins;
    }

    public void setVoisins(Case v) {
        this.voisins.add(v);
    }

    public void setVoisinsMechants(ArrayList<Case> voisinsMechants) {
        this.voisinsMechants = voisinsMechants;
    }

    public void setVoisinsMechants(Case v) {
        this.voisinsMechants.add(v);
    }

    public void enleverVoisinMechant(Case v) {
        this.voisinsMechants.remove(v);
    }

}
