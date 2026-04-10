package models;

public class Cageot {

    private final int nombreUnique;
    private final Cageot identifiantUnique;

    public Cageot(Cageot identifiantUnique) {
        this.nombreUnique = 12;
        this.identifiantUnique = identifiantUnique;
    }

    public int getNombreUnique() {
        return nombreUnique;
    }

    public Cageot getIdentifiantUnique() {
        return identifiantUnique;
    }

    @Override
    public String toString() {
        return "Cageot '" + identifiantUnique + "' avec " + "/" + nombreUnique + " bouteilles";
    }

}
