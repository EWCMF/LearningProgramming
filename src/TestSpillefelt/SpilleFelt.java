package TestSpillefelt;

import java.util.ArrayList;

public class SpilleFelt {
    public String beskrivelse;
    public int bredde;
    public int laengde;

    static ArrayList<Genstand> genstande = new ArrayList<>();

    public String lokationsType;

    public String beskriv() {
        return beskrivelse;
    }

    public int hvorStortiKvm() {
        return bredde * laengde;
    }


    public String hvorStort() {
        if (bredde * laengde <= 10 && bredde * laengde >= 0)
            return "lille";
        else if (bredde * laengde >= 10 && bredde * laengde <= 101)
            return "mellem";
        else
            return "stort";
    }

    public String listGenstande() {
        String baseMessage = "Spillefeltet indeholder: ";
        if (genstande.size() == 0) {
            return "Spillefeltet indeholder ikke genstande.";
        }
        else if (genstande.size() == 1) {
            return "Spillefeltet indeholder " + genstande.get(0).navn + ".";
        }
        else if (genstande.size() > 1) {
            for (int i = 0; i < genstande.size(); i++) {
                baseMessage = baseMessage + genstande.get(i).navn + ", ";
            }
        }
        return baseMessage.substring(0, baseMessage.length() - 2) + ".";
    }

    public String getLokationsType() {
        return lokationsType;
    }

    public void setLokationsType(String lokation) {
        lokationsType = lokation;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String nyBeskrivelse) {
        beskrivelse = nyBeskrivelse;
    }

    public void setBredde(int nyBredde) {
        bredde = nyBredde;
    }

    public int getBredde() {
        return bredde;
    }

    public void setLaengde(int nyLængde) {
        laengde = nyLængde;
    }
}
