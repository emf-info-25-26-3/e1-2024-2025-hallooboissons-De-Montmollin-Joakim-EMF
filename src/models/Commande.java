package models;

public class Commande {

    // Constantes
    public static final int NBRE_CAGEOT_MAX = 8;

    // Attributs
    private final Client client;
    private int nbreCageots;
    private Cageot[] tableauCageots;

    // Constructeur
    public Commande(Client client) {
        this.client = client;
        this.nbreCageots = 0;
        this.tableauCageots = new Cageot[NBRE_CAGEOT_MAX];
    }

    // Méthodes
    public void ajouterCageot(Cageot cageot) {
        if (nbreCageots < NBRE_CAGEOT_MAX) {
            for (int i = 0; i < tableauCageots.length; i++) {
                if (tableauCageots[i] == null) {
                    tableauCageots[i] = cageot;
                    nbreCageots++;
                    break;
                }
            }
        }
    }

    public void supprimerCageot(Cageot cageot) {
        if (nbreCageots >= 1) {
            for (int i = 0; i < nbreCageots; i++) {
                if (tableauCageots[i] == cageot) {
                    // Commencer au lieu supprimé
                    for (int j = i; j < nbreCageots - 1; j++) {
                        tableauCageots[j] = tableauCageots[j + 1];
                    }
                    // Nettoyage de la dernière case
                    tableauCageots[nbreCageots - 1] = null;
                    nbreCageots--;
                    break;
                }
            }
        }
    }

    public Cageot[] listeCageotsALivrer() {
        int taille = 0;
        for (int i = 0; i < tableauCageots.length; i++) {
            if (tableauCageots[i] != null) {
                taille++;
            }
        }
        Cageot[] tabTemp = new Cageot[taille];
        for (int i = 0; i < tabTemp.length; i++) {
            tabTemp[i] = tableauCageots[i];
        }
        return tabTemp;
    }

    public double prixTotal() {
        double compteur = 0;
        for (int i = 0; i < tableauCageots.length; i++) {
            if (tableauCageots[i] != null) {
                compteur += tableauCageots[i].prixTotal();
            }
        }
        return compteur;
    }

    // Getters et Setters
    public Client getClient() {
        return client;
    }

    public int getCageot() {
        return nbreCageots;
    }

    // toString
    @Override
    public String toString() {
        return "";
    }
}
