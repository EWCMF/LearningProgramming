package ProgrammingExercise9;

public class Exercise1 {
    static class Rectangle {
        double width;
        double height;


        public Rectangle() {
            width = 1;
            height = 1;
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double getArea() {
            return width * height;
        }

        double getPerimeter() {
            return 2 * width + 2 * height;
        }
    }
}
