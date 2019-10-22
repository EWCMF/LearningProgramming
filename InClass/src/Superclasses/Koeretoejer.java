package Superclasses;

// abstract gør at man ikke kan instansier.
public abstract class Koeretoejer {
    int antalHjul;
    String motor;
    double gennemsnitshastighed;

    void start() {
    }

    void stop() {
    }

    // Metoder kan også være abstract.
    abstract void travel();

}
