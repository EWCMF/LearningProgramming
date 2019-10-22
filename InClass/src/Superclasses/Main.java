package Superclasses;

public class Main {
    public static void main(String[] args) {
        Bil jensBil = new Bil();

        // Superklasse variabler
        jensBil.antalHjul = 4;
        jensBil.motor = "Forbrændingsmotor";
        jensBil.gennemsnitshastighed = 123.45;

        // Bilklasse eksklusiv.
        jensBil.antalSaeder = 2;
        jensBil.antalVinduer = 4;
        jensBil.nummerplade = "Roadster";

        // Superklasse metode
        jensBil.travel();

        Cykel hansCykel = new Cykel();

        // Superklasse variabler
        hansCykel.antalHjul = 2;
        hansCykel.motor = "Menneskedrevet";
        hansCykel.gennemsnitshastighed = 34.56;

        // Cykelklasse eksklusiv
        hansCykel.cykelBremsetype = "Håndbremse";
        hansCykel.cykelstyrType = "Racerstyr";

        // Superklasse metode
        hansCykel.travel();
    }
}
