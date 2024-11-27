package tierarzt;

public class Tierarztpraxis {

    public static void main(String[] args) {
        System.out.println("Hier ist die Tierarztpraxis");
        System.out.println(Tier.location);

        Tier tausendfuessler = new Tier(1000, "Tausendfuessler");
        System.out.println(tausendfuessler.toString());
        Hund hund = new Hund(4, "Bello", "schwarz");
        System.out.println(hund.toString());
        hund.gibLaut();

        Vogel piepmatz = new Vogel(2, "Piepmatz");
        System.out.println(piepmatz.toString());
        piepmatz.gibLaut();

        Fisch blubber = new Fisch("Blubber");
        System.out.println(blubber.toString());
    }

}
