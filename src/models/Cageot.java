package models;

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
            for (int i = 0; i < tableauBouteilles.length; i++) {
                for (int j = 0; j < tableauBouteilles.length; j++) {
                    if (tableauBouteilles[j]) {
                        
                    }
               if (tableauBouteilles[i] == bouteille) {
                tableauBouteilles[i] = null;
                bouteilles--;
                tableauBouteilles[i] = tableauBouteilles[i + 1];
                tableauBouteilles[i + 1] = null;
                break;
               } 
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

    // toString
    @Override
    public String toString() {
        return "Cageot '" + identifiantUnique + "' avec " + bouteilles + "/" + nombreDePlacesDisponibles()
                + " bouteilles";
    }

}
