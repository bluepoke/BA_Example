package tierarzt;

public class Tier {

    private int beine;
    private String name;
    public static String location = "Universum";

    private static int anzahlTiere = 0;

    public Tier(int beine, String name) {
        this.beine = beine;
        this.name = name;
        anzahlTiere++;
    }

    public Tier(String name) {
        this.beine = 0;
        this.name = name;
        anzahlTiere++;
    }

    public int getBeine() {
        return beine;
    }

    public String getName() {
        return name;
    }

    public static int getAnzahlTiere() {
        return anzahlTiere;
    }

    @Override
    public String toString() {
        return "Ich bin ein "+ this.getClass().getSimpleName()+" mit "+ beine + " Beinen und heiße "+name;
    }
}
