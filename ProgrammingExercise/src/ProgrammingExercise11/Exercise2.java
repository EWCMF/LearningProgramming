package ProgrammingExercise11;

import java.util.GregorianCalendar;

public class Exercise2 {
    public static void main(String[] args) {
        Person person = new Person("Carl");
        Student student = new Student("Benny", "Freshman");
        Employee employee = new Employee("Dennis");
        Faculty faculty = new Faculty("Gregory");
        Staff staff = new Staff("Janus");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }

    static class Person {
        protected String name;
        protected String address;
        protected String phoneNumber;
        protected String emailAddress;

        Person() {

        }

        Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person " + name;
        }
    }

    static class Student extends Person {
        private final String classStatus;

        Student(String name, String classStatus) {
            this.name = name;
            this.classStatus = classStatus;
        }

        @Override
        public String toString() {
            return "Student " + name;
        }
    }

    static class Employee extends Person {
        protected String office;
        protected double salary;
        protected MyDate dateHired;

        Employee() {

        }

        Employee(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee " + name;
        }
    }

    static class Faculty extends Employee {
        protected byte officeHours;
        protected String rank;

        Faculty(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Faculty " + name;
        }
    }

    static class Staff extends Employee {
        protected String rank;

        Staff(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Staff " + name;
        }
    }

    static class MyDate {
        private short year;
        private byte month;
        private byte day;

        MyDate() {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            year = (short) gregorianCalendar.get(GregorianCalendar.YEAR);
            month = (byte) gregorianCalendar.get(GregorianCalendar.MONTH);
            day = (byte) gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        }

        MyDate(short year, byte month, byte day) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(year, month, day);
            year = (short) gregorianCalendar.get(GregorianCalendar.YEAR);
            month = (byte) gregorianCalendar.get(GregorianCalendar.MONTH);
            day = (byte) gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        }

        public short getYear() {
            return year;
        }

        public byte getMonth() {
            return month;
        }

        public byte getDay() {
            return day;
        }

        public void setDate(long elapsedTime) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(elapsedTime);
            year = (short) gregorianCalendar.get(GregorianCalendar.YEAR);
            month = (byte) gregorianCalendar.get(GregorianCalendar.MONTH);
            day = (byte) gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        }
    }
}
