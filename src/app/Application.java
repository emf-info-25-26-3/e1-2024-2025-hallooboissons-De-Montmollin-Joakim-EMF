package app;

import models.Client;
import models.Commande;

public class Application {

    public static void main(String[] args) {
    

    }

    public static void afficherCommande(Commande commande) {
        
    Client client = new Client("De Montmollin", "Joakim", "Fribourg");
    Commande commandetest = new Commande(client, 5);

        if (commande != null) {
            System.out.println("-----------------------------");
            System.out.println("Commande pour le client : " + commandetest.getClient());
            String cageotsALivrer = commandetest.listeCageotsALivrer();
        } else {
            
        }
    }
}
