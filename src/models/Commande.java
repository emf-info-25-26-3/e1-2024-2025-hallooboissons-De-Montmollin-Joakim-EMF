package models;

public class Commande {

    // Constantes
    public static final int NBRE_CAGEOT_MAX = 8;

    // Attributs
    private final Client client;
    private int cageot;
    private Cageot[] tableauCageots;

    //Constructeur
    public Commande(Client client, int cageot){
        this.client = client;
        this.cageot = cageot;
        this.cageots = new Cageot[NBRE_CAGEOT_MAX];
    }

    //Méthodes
    public void ajouterCageot(Cageot cageot){
        if (cageot < NBRE_CAGEOT_MAX) {
            tableauCageots[cageot] = cageot;
            cageot++;
            
        }
    }
    public void supprimerCageot(){
        if (cageot >= 1) {
            cageot--;
        }
    }
    public String listeCageotsALivrer(){
        Cageot[] tabCageot = new Cageot[NBRE_CAGEOT_MAX];

        return "";
    }

    //Getters et Setters
    public Client getClient(){
        return client;
    }

    public int getCageot() {
        return cageot;
    }

    public void setCageot(int cageot) {
        this.cageot = cageot;
    }

    //toString
    @Override
    public String toString() {
        return "";
    }
}
