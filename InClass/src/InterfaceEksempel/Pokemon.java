package InterfaceEksempel;

public class Pokemon {
    private String navn, koen, udviklesFra, kanUdviklesTil;
    private int nummerPokedex;
    private short skade;

    Pokemon() {

    }

    @Override
    public String toString() {
        String beskrivelse = "Pokemon " + navn + " nr. " + nummerPokedex + " er en " + koen + ".";
        return beskrivelse;
    }

    boolean angreb() {
        return false;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKoen() {
        return koen;
    }

    public void setKoen(String koen) {
        this.koen = koen;
    }

    public String getUdviklesFra() {
        return udviklesFra;
    }

    public void setUdviklesFra(String udviklesFra) {
        this.udviklesFra = udviklesFra;
    }

    public String getKanUdviklesTil() {
        return kanUdviklesTil;
    }

    public void setKanUdviklesTil(String kanUdviklesTil) {
        this.kanUdviklesTil = kanUdviklesTil;
    }

    public int getNummerPokedex() {
        return nummerPokedex;
    }

    public void setNummerPokedex(int nummerPokedex) {
        this.nummerPokedex = nummerPokedex;
    }

    public short getSkade() {
        return skade;
    }

    public void setSkade(short skade) {
        this.skade = skade;
    }
}
