package models;

import java.text.DecimalFormat;

public class Cageot {

    // Constantes
    public static final int NBRE_BOUTEILLES_MAX = 12;

    // Attributs
    private int bouteilles;
    private final String identifiantUnique;
    private Bouteille[] tableauBouteilles;

    // Constructeur
    public Cageot(String identifiantUnique) {
        this.bouteilles = 0;
        this.identifiantUnique = identifiantUnique;
        this.tableauBouteilles = new Bouteille[NBRE_BOUTEILLES_MAX];
    }

    // Méthodes
    public void rangerBouteille(Bouteille bouteille) {
        if (bouteilles < NBRE_BOUTEILLES_MAX) {
            tableauBouteilles[bouteilles] = bouteille;
            bouteilles++;
        }
    }

    public void prendreBouteille(Bouteille bouteille) {
        if (bouteilles >= 1) {
            for (int i = 0; i < bouteilles; i++) {
                if (tableauBouteilles[i] == bouteille) {
                    // Commencer au lieu supprimé
                    for (int j = i; j < bouteilles - 1; j++) {
                        tableauBouteilles[j] = tableauBouteilles[j + 1];
                    }
                    // Nettoyage de la dernière case
                    tableauBouteilles[bouteilles - 1] = null;
                    bouteilles--;
                    break;
                }
            }
        }
    }

    public int nombreDePlacesDisponibles() {
        int places = 0;
        places = NBRE_BOUTEILLES_MAX - bouteilles;
        return places;
    }

    public Bouteille[] listeBouteillesStockees() {
        Bouteille[] tabTemp = new Bouteille[bouteilles];
        for (int i = 0; i < tabTemp.length; i++) {
            tabTemp[i] = tableauBouteilles[i];

        }
        return tabTemp;
    }

    public double prixTotal() {
        double compteur = 0;
        for (int i = 0; i < tableauBouteilles.length; i++) {
            if (tableauBouteilles[i] != null) {
                compteur += tableauBouteilles[i].getPrix();
            }
        }
        return compteur;
    }

    // Getters et Setters
    public int getbouteilles() {
        return bouteilles;
    }

    public String getIdentifiantUnique() {
        return identifiantUnique;
    }

    public Bouteille[] getTableauBouteilles() {
        return tableauBouteilles;
    }

    DecimalFormat df = new DecimalFormat("#.0");

    // toString
    @Override
    public String toString() {
        return "Cageot '" + identifiantUnique + "' avec " + df.format(bouteilles) + "/" + nombreDePlacesDisponibles()
                + " bouteilles";
    }

}
