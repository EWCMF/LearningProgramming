package ProgrammingExercise13.Exercise1;

public class Triangle extends GeometricObject {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return sideA * sideB * 0.5;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
