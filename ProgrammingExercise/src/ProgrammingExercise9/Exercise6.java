package ProgrammingExercise9;

public class Exercise6 {
    static class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch() {
            startTime = System.currentTimeMillis();
        }

        void start() {
            startTime = System.currentTimeMillis();
        }

        void stop() {
            endTime = System.currentTimeMillis();
        }

        public double getStartTime() {
            return startTime;
        }

        public double getEndTime() {
            return endTime;
        }

        public double getElapsedTime() {
            return endTime - startTime;
        }

    }
}
