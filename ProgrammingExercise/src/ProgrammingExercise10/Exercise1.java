package ProgrammingExercise10;

public class Exercise1 {
    static class Time {
        long hour;
        long minute;
        long second;

        Time() {
            hour = System.currentTimeMillis() / 1000 / 60 / 60 % 24 + 1;
            minute = System.currentTimeMillis() / 1000 / 60 % 60;
            second = System.currentTimeMillis() / 1000 % 60;
        }

        Time(long milliseconds) {
            hour = milliseconds / 1000 / 60 / 60 % 24;
            minute = milliseconds / 1000 / 60 % 60;
            second = milliseconds / 1000 % 60;
        }

        Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        void setTime(long elapseTime) {
            hour = elapseTime / 1000 / 60 / 60 % 24;
            minute = elapseTime / 1000 / 60 % 60;
            second = elapseTime / 1000 % 60;
        }

        public long getHour() {
            return hour;
        }

        public long getMinute() {
            return minute;
        }

        public long getSecond() {
            return second;
        }
    }

    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println(time1.hour + ":" + time1.minute + ":" + time1.second);

        System.out.println();

        Time time2 = new Time(555550000);
        System.out.println(time2.hour + ":" + time2.minute + ":" + time2.second);

        System.out.println();

        Time time3 = new Time(5, 23, 55);
        System.out.println(time3.getHour() + ":" + time3.minute + ":" + time3.second);
    }
}
