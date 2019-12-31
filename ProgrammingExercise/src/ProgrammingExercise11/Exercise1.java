package ProgrammingExercise11;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();

        System.out.print("Enter a color: ");
        String color = scanner.next();

        System.out.println("Is it filled or not?");
        Boolean filled = scanner.nextBoolean();

        System.out.println();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getColor());
        System.out.println(triangle.getFilled());
    }

    static class Triangle extends GeometricObject{
        private double side1;
        private double side2;
        private double side3;

        Triangle() {
            side1 = 1.0;
            side2 = 1.0;
            side3 = 1.0;
        }

        Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }


        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        public double getArea() {
            //Heron's formula
            double p = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

            return area;
        }

        public double getPerimeter() {
            return side1 + side2 + side3;
        }

        @Override
        public String toString() {
            return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
        }
    }

    static class GeometricObject {
        private String color;
        private Boolean filled;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Boolean getFilled() {
            return filled;
        }

        public void setFilled(Boolean filled) {
            this.filled = filled;
        }
    }
}
