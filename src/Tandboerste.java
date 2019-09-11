public class Tandboerste {
    static int antalBoerstehaar = 250;
    boolean erStartede;

    public void setErStartede(boolean erStartede) {
        this.erStartede = erStartede;
    }


    public static void main(String[] args) {
        Tandboerste patricksTandboerste = new Tandboerste();
        Tandboerste lisasTandboerste = new Tandboerste();
        patricksTandboerste.setErStartede(true);
        System.out.println("Er den startede? " + patricksTandboerste.erStartede);
        if (patricksTandboerste.erStartede) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
