package Practice;

public class VoidAndNonVoidMethods {

    public static void main(String[] args) {

        // Deklarer class.
        VoidAndNonVoidMethods test = new VoidAndNonVoidMethods();

        // Print message på 2 måder.
        System.out.println(test.stringMethod());
        test.voidMethod();
    }

    void voidMethod() {
        // sout her fordi ingen værdi returneres.
        String a = "Værdi1";
        System.out.println(a);
    }

    String stringMethod() {
        // Ikke void så return er nødvendig.
        return "Værdi2";
    }


}

