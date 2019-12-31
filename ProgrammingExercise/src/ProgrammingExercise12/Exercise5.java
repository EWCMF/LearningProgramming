package ProgrammingExercise12;

public class Exercise5 {
    public static void main(String[] args) throws IllegalTriangleException {
        // Test exception
        Triangle triangle = new Triangle(1, 12, 15);
    }

    static class Triangle {
        private double side1;
        private double side2;
        private double side3;

        Triangle() {
            side1 = 1.0;
            side2 = 1.0;
            side3 = 1.0;
        }

        Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
            if ((side1 + side2) < side3)
                throw new IllegalTriangleException();
            if ((side1 + side3) < side2)
                throw new IllegalTriangleException();
            if ((side2 + side3) < side1)
                throw new IllegalTriangleException();
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

    static class IllegalTriangleException extends Exception {
        IllegalTriangleException() {
            super("The sum of any two sides of a triangle must be greater than the remaining side.");
        }
    }
}
