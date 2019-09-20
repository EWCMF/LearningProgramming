package Subclasses;

public class Main {
    public static void main(String[] args) {
        Bil jensBil = new Bil();

        jensBil.antalHjul = 4;
        jensBil.motor = "Forbrændingsmotor";
        jensBil.gennemsnitshastighed = 123.45;

        jensBil.antalSaeder = 2;
        jensBil.antalVinduer = 4;
        jensBil.nummerplade = "Roadster";


        Cykel hansCykel = new Cykel();

        hansCykel.antalHjul = 2;
        hansCykel.motor = "Menneskedrevet";
        hansCykel.gennemsnitshastighed = 34.56;

        hansCykel.cykelBremsetype = "Håndbremse";
        hansCykel.cykelstyrType = "Racerstyr";
    }
}
