package ClassesStudents;

public class PrintStudentData {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Tommy";
        student1.birthYear = 1992;
        student1.homeTown = "Næstved";

        Student student2 = new Student();
        student2.name = "Test Person";
        student2.birthYear = 2000;
        student2.homeTown = "Slagelse";


        int avgAge = (student1.getAge() + student2.getAge()) / 2;

        System.out.println("The names are: " + student1.name + ", " + student2.name);
        System.out.println("Average age is: " + avgAge);
        System.out.println("Home towns are: " + student1.homeTown + " and " + student2.homeTown);
    }

}
