package models;

import java.text.DecimalFormat;

public class Bouteille {

    // Attributs
    private final String nom;
    private final double prix;
    private final int contenance;
    private double remplissage;
    private final boolean estEnVerre;

    // Constructeur
    public Bouteille(String nom, double prix, int contenance, double remplissage, boolean estEnVerre) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        this.remplissage = remplissage;
        this.estEnVerre = estEnVerre;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getContenance() {
        return contenance;
    }

    public double getRemplissage() {
        return remplissage;
    }

    public void setRemplissage(double remplissage) {
        this.remplissage = remplissage;
    }

    public boolean EstEnVerre() {
        return estEnVerre;
    }

    DecimalFormat df = new DecimalFormat("#.00");

    // toString
    @Override
    public String toString() {
        return "Bouteille '" + nom + "' de " + contenance + "L en " + estEnVerre + " à " + df.format(prix) + "Frs - "
                + remplissage;
    }
}
