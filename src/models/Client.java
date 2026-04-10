package models;

public class Client {

    // Attributs
    private final String nom;
    private final String prenom;
    private final String ville;

    // Constructeur
    public Client(String nom, String prenom, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVille() {
        return ville;
    }

    // toString
    @Override
    public String toString() {
        return "Client " + nom.toUpperCase() + " " + prenom + " - " + ville;
    }

}
