package ProgrammingExercise13.Exercise1;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private double area;
    private double perimeter;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
