package TestSpillefelt;

import junit.framework.TestCase;

import java.util.ArrayList;

public class SpilleFeltTest extends TestCase {

    SpilleFelt spilleFelt = new SpilleFelt();

    /** Hvert spillefelt skal have en beskrivelse */
    public void testBeskriv() {
        spilleFelt.beskrivelse = "Et flot område med blomster.";
        assertEquals( "Et flot område med blomster.", spilleFelt.beskriv());
    }

    /** Hvert spillefelt har en bredde og længde, herfra udregnes spillefeltetsareal. */
    public void testHvorStortiKvm() {
        spilleFelt.bredde = 10;
        spilleFelt.laengde = 10;
        assertEquals(100, spilleFelt.hvorStortiKvm());
    }

    /** Et område betragtes som lille, når den er under 10 kvm.
     *  Et mellemstort område er mellem 11-101 kvm.
     *  Alt større er et stort område. */
    public void testHvorStortLille() {
        spilleFelt.bredde = 3;
        spilleFelt.laengde = 3;
        assertEquals("lille", spilleFelt.hvorStort());
    }

    public void testHvorStortMellemstort() {
        spilleFelt.bredde = 10;
        spilleFelt.laengde = 10;
        assertEquals("mellem", spilleFelt.hvorStort());
    }

    public void testHvorStortStort() {
        spilleFelt.bredde = 20;
        spilleFelt.laengde = 20;
        assertEquals("stort", spilleFelt.hvorStort());
    }

    /** Et spillefelt kan indeholde 0 eller flere objekter som et arraylist */

    public void testListGenstandeMedIngenGenstande() {
        spilleFelt.genstande.clear();
        assertEquals("Spillefeltet indeholder ikke genstande.", spilleFelt.listGenstande());
    }

    public void testListGenstandeMedEnGenstand() {
        spilleFelt.genstande.clear();
        Genstand a = new Genstand();
        a.setName("en økse");
        SpilleFelt.genstande.add(a);
        assertEquals("Spillefeltet indeholder en økse.", spilleFelt.listGenstande());
    }

    public void testListGenstandeMed2Genstande() {
        spilleFelt.genstande.clear();
        Genstand a = new Genstand();
        a.setName("en økse");
        Genstand b = new Genstand();
        b.setName("en flaske whisky");
        spilleFelt.genstande.add(a);
        spilleFelt.genstande.add(b);

        assertEquals("Spillefeltet indeholder: en økse, en flaske whisky.", spilleFelt.listGenstande());
    }

    /** F.eks. vand, strand, ørken eller hus */
    public void testGetLokationsType() {
        spilleFelt.lokationsType = "ørken";
        assertEquals("ørken", spilleFelt.getLokationsType());
    }

    public void testSetLokationsType() {
        spilleFelt.setLokationsType("ørken");
        assertEquals("ørken", spilleFelt.lokationsType);
    }

    // En hel sætning, f.eks. Et stort øde område med en ensom flamingo i midten.
    public void testGetBeskrivelse() {
        spilleFelt.beskrivelse = "Et østeurpæisk-udseende køkken med kakler, broderier og lugten spæk.";
        assertEquals("Et østeurpæisk-udseende køkken med kakler, broderier og lugten spæk.", spilleFelt.getBeskrivelse());
    }

    public void testSetBeskrivelse() {
        spilleFelt.setBeskrivelse("Et hul i jorden.");
        assertEquals("Et hul i jorden.", spilleFelt.beskrivelse);
    }

    /* Bredde og længde skal være mellem 0 - 50 */
    public void testSetBredde() {
        spilleFelt.setBredde(10);
        assertEquals(10, spilleFelt.getBredde());
    }

    public void testSetLaengde() {
        spilleFelt.setLaengde(50);
        assertEquals(50, spilleFelt.laengde);
    }

}