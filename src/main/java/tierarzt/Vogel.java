package tierarzt;

public class Vogel extends Tier implements KannLautGeben{

    public Vogel(int beine, String name) {
        super(beine, name);
    }

    public void pieps() {
        System.out.println("Piep!");
    }


    @Override
    public void gibLaut() {
        pieps();
    }
}
