package ClassesStudents;

public class Student {

    String name;
    int birthYear;
    String homeTown;

    public String hello() {
        return "Hello";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getAge() {
        return 2019 - birthYear;
    }
}
