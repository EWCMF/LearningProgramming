package InterfaceEksempel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Interface eksempel");

        FirePokemon pikachu = new FirePokemon();
        pikachu.setNavn("Pikachu");
        pikachu.setKoen("han");
        pikachu.setSkade((short) 80);
        pikachu.setNummerPokedex(25);

        pikachu.spydIld();
        pikachu.ex();
        pikachu.fly();
        System.out.println(pikachu.sej);

        System.out.println(pikachu.toString());

        WaterPokemon squirtle = new WaterPokemon();
        squirtle.setNavn("Squirtle");
        squirtle.setKoen("hun");
        squirtle.setSkade((short) 50);
        squirtle.setNummerPokedex(4);

        squirtle.svoem();

        System.out.println(squirtle.toString());
    }
}
