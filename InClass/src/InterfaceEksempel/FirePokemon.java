package InterfaceEksempel;

public class FirePokemon extends Pokemon implements EX, CanFly {
    void spydIld() {
        System.out.println("Whaaaaaa");
    }

    @Override
    public void ex() {
        System.out.println("Jeg er ekstra sej.");
    }

    @Override
    public void fly() {
        System.out.println("*Bask med vingerne*");
    }
}
