package ProgrammingExercise9;

public class Exercise8 {
    static class Fan {
        final byte SLOW = 1;
        final byte MEDIUM = 2;
        final byte FAST = 3;
        private int speed;
        private boolean on;
        private double radius;
        String color;


        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Fan() {
            speed = SLOW;
            radius = 5;
            color = "blue";
            on = false;
        }

        public String toString() {
            if (on)
                return "" + speed + " " + color + " " + radius;
            else
                return  "" + color + " " + radius + " fan is off";
        }
    }
}
