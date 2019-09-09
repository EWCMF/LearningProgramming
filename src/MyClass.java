// This prints the system message: 'Hello World'.
class MyClass1 {
    public static void main(String[ ] args) {
        System.out.println("Hello World");
    }
}

// This prints the system message: 'I am learning Java'.
class MyClass2 {
    public static void main(String[ ] args) {
        System.out.println("I am learning Java");
    }
}

// Defining variables and printing them as system messages.
class MyClass3 {
    public static void main(String[ ] args) {
        String name ="David";
        int age = 42;
        double score =15.9;
        char group = 'Z';
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
        System.out.println(group);
    }
}
// Trying simple arithmetic
class MyClass4 {
    public static void main(String[ ] args) {
        double x1 = 4, y1 = 5;
        double resultDiv = x1 / y1;

        int x2 = 7, y2 = 6;
        int resultAdd = x2 + y2;
        int resultSub = x2 - y2;

        System.out.println(resultDiv);
        System.out.println(resultAdd);
        System.out.println(resultSub);
    }
}

// Prints my name in a system message by adding strings.
class Program {
    public static void main(String[] args) {
        String firstName, lastName;
        firstName = "Tommy";
        lastName = "Hansen";

        System.out.println("My name is " + firstName +" "+lastName);
    }
}

class booleanTest {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
            if (x > y) {
                System.out.println("x is bigger");
            } else {
                System.out.println("y is bigger");
            }
    }
}