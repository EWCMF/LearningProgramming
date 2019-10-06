package SelectionOpgaver;

public class Opgave5 {
    public static void main(String[] args) {
        // Test case for hvilket 'tier-interval' x tilhører hvor x er i [60:69]
        // input: x = 62
        // Forventet output: output == "Tallet tilhører [60:69]"

        // opstil input
        int x = 62;

        String output = whatTierInterval(x);

        if (output == "Tallet tilhører [60:69]") {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }

    static String whatTierInterval(int a) {
        int compare = a / 10;
        switch (compare) {
            case 0:
                System.out.println(a + " tilhører [0:9]");
                return "Tallet tilhører [0:9]";
            case 1:
                System.out.println(a + " tilhører [10:19]");
                return "Tallet tilhører [10:19]";
            case 2:
                System.out.println(a + " tilhører [20:29]");
                return "Tallet tilhører [20:29]";
            case 3:
                System.out.println(a + " tilhører [30:39]");
                return "Tallet tilhører [30:39]";
            case 4:
                System.out.println(a + " tilhører [40:49]");
                return "Tallet tilhører [40:49]";
            case 5:
                System.out.println(a + " tilhører [50:59]");
                return "Tallet tilhører [50:59]";
            case 6:
                System.out.println(a + " tilhører [60:69]");
                return "Tallet tilhører [60:69]";
            case 7:
                System.out.println(a + " tilhører [70:79]");
                return "Tallet tilhører [70:79]";
            case 8:
                System.out.println(a + " tilhører [80:89]");
                return "Tallet tilhører [80:89]";
            case 9:
                System.out.println(a + " tilhører [90:99]");
                return "Tallet tilhører [90:99]";
        }
        return null;
    }
}