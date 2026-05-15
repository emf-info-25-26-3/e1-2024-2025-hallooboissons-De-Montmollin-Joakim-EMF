package app;

import models.Bouteille;
import models.Cageot;
import models.Client;
import models.Commande;

public class Application {

    public static void main(String[] args) {
        Bouteille bouteille1 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille2 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille3 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille4 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille5 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille6 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille7 = new Bouteille("Coca-Cola", 3.85, 1, false);
        Bouteille bouteille8 = new Bouteille("Coca-Cola", 3.85, 1, false);
        Bouteille bouteille9 = new Bouteille("Pepsi", 3.55, 1, false);
        Bouteille bouteille10 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille11 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille12 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille13 = new Bouteille("Henniez verte", 2.6, 1, true);
        Bouteille bouteille14 = new Bouteille("Henniez verte", 2.6, 1, true);
        Bouteille bouteille15 = new Bouteille("Henniez verte", 2.6, 1, true);
        Bouteille bouteille16 = new Bouteille("Henniez verte", 2.6, 1, true);
        Bouteille bouteille17 = new Bouteille("Henniez verte", 2.6, 1, true);
        Bouteille bouteille18 = new Bouteille("Henniez verte", 2.6, 1, true);

        Cageot cageot1 = new Cageot("X83H4");
        Cageot cageot2 = new Cageot("X83H5");
        Cageot cageot3 = new Cageot("X83H6");
        Cageot cageot4 = new Cageot("X83H7");

        cageot1.rangerBouteille(bouteille1);
        cageot1.rangerBouteille(bouteille2);
        cageot1.rangerBouteille(bouteille3);
        cageot1.rangerBouteille(bouteille4);
        cageot1.rangerBouteille(bouteille5);
        cageot1.rangerBouteille(bouteille6);
        cageot2.rangerBouteille(bouteille7);
        cageot2.rangerBouteille(bouteille8);
        cageot3.rangerBouteille(bouteille9);
        cageot4.rangerBouteille(bouteille10);
        cageot4.rangerBouteille(bouteille11);
        cageot1.rangerBouteille(bouteille12);
        cageot1.rangerBouteille(bouteille13);
        cageot1.rangerBouteille(bouteille14);
        cageot1.rangerBouteille(bouteille15);
        cageot1.rangerBouteille(bouteille16);
        cageot1.rangerBouteille(bouteille17);
        cageot1.rangerBouteille(bouteille18);

        Client client1 = new Client("Ducobu", "Jean", "Bulle");
        Commande commande1 = new Commande(client1);
        Client client2 = new Client("Haroni", "Mac", "Fribourg");
        Commande commande2 = new Commande(client2);

        commande1.ajouterCageot(cageot1);
        commande1.ajouterCageot(cageot2);
        commande1.ajouterCageot(cageot3);
        commande2.ajouterCageot(cageot4);

        afficherCommande(commande1);
        afficherCommande(commande2);
    }

    public static void afficherCommande(Commande commande) {

        if (commande != null) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Commande pour le client : " + commande.getClient());
            Cageot[] cageotsALivrer = commande.listeCageotsALivrer();
            System.out.println("La commande contient " + cageotsALivrer.length + " cageots");
            System.out.println("Le prix total de la commande est de " + commande.prixTotal() + " Frs");
        }

    }
}
