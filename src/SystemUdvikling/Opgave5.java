package SystemUdvikling;

public class Opgave5 {
    public static void main(String[] args) {
        // Test case for hvilket 'tier-interval' x tilhører hvor x er i [60:69]
        // input: x = 62
        // Forventet output: output == "62 tilhører [60:69]"

        // opstil input
        int x = 62;

        String output = whatTierInterval(x);

        if (output == "Tallet tilhører [60:69]") {
            System.out.println(output);
            System.out.println("Pass");
        }
        else {
            System.out.println(output);
            System.out.println("Fail");
        }
    }

    static String whatTierInterval(int a) {
        int compare = a / 10;
        switch (compare) {
            case 0:
                return "Tallet tilhører [0:9]";
            case 1:
                return a + " tilhører [10:19]";
            case 2:
                return a + " tilhører [20:29]";
            case 3:
                return a + " tilhører [30:39]";
            case 4:
                return a + " tilhører [40:49]";
            case 5:
                return a + " tilhører [50:59]";
            case 6:
                return "Tallet tilhører [60:69]";
            case 7:
                return a + " tilhører [70:79]";
            case 8:
                return a + " tilhører [80:89]";
            case 9:
                return "Tallet tilhører [90:99]";
        }
        return null;
    }
}