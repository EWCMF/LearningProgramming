package ProgrammingExercise10;

public class Exercise11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }

    static class Circle2D {
        private double x;
        private double y;
        private double radius;

        Circle2D() {
            x = 0;
            y = 0;
            radius = 1;
        }

        Circle2D(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        double getPerimeter() {
            return radius * 2 * Math.PI;
        }

        boolean contains(double x, double y) {
            double d = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
            return d < getRadius();
        }

        boolean contains(Circle2D circle) {
            double d = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2));
            return getRadius() > d + circle.getRadius();
        }

        boolean overlaps(Circle2D circle) {
            return Math.pow(radius + circle.radius, 2) >= Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2);
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getRadius() {
            return radius;
        }
    }
}
