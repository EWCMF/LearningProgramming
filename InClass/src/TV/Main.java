package TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println();

        System.out.println(tv.volumeLevel);

        tv.turnOn();

        tv.volumeUp();
        tv.volumeUp();

        System.out.println(tv.volumeLevel);
    }
}
