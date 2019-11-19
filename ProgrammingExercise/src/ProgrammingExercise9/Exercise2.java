package ProgrammingExercise9;

public class Exercise2 {
    static class Stock {
        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;


        public Stock(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
        }

        double getChangePercent() {
            if (previousClosingPrice < currentPrice)
                return ((currentPrice - previousClosingPrice) / currentPrice) * 100;
            else
                return ((previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
        }


    }
}
