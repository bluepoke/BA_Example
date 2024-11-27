package tierarzt;

public class Hund extends Tier implements KannLautGeben {

    private String farbe;

    public Hund(int beine, String name, String farbe) {
        super(beine, name);
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    @Override
    public void gibLaut() {
        System.out.println("Wuff!");
    }
}
