package ProgrammingExercise13.Exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.setColor("blue");
        triangle.setFilled(false);
        System.out.println(triangle.getArea() + " " + triangle.getPerimeter() + " " + triangle.getColor() + " " + triangle.isFilled());
    }
}
