package models;

import java.text.DecimalFormat;

public class Bouteille {

    // Attributs
    private final String nom;
    private final double prix;
    private final double contenance;
    private double remplissage;
    private final boolean estEnVerre;

    // Constructeur
    public Bouteille(String nom, double prix, int contenance, boolean estEnVerre) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        this.remplissage = 100.0;
        this.estEnVerre = estEnVerre;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public double getContenance() {
        return contenance;
    }

    public double getRemplissage() {
        return remplissage;
    }

    public void setRemplissage(double remplissage) {
        this.remplissage = remplissage;
    }

    public boolean getEstEnVerre() {
        return estEnVerre;
    }

    DecimalFormat df = new DecimalFormat("#.00");

    // toString
    @Override
    public String toString() {
        String bouteille;
        if (estEnVerre == false) {
            bouteille = "plastique";
        } else {
            bouteille = "verre";
        }

        String etat;
        if (remplissage == 100.0) {
            etat = "pleine";
        } else if (remplissage <= 0.0) {
            etat = "vide";
        } else {
            etat = "entamée";
        }
        return "Bouteille '" + nom + "' de " + contenance + "L en " + bouteille + " à " + df.format(prix) + "Frs - "
                + etat;
    }
}
