package ProgrammingExercise9;

import java.util.Date;

public class Exercise7 {
    static class Account {
        private int id;
        private double balance;
        private static double annualInterestRate = 0;

        private Date dateCreated;

        public Account() {
            id = 0;
            balance = 0;
            dateCreated = new Date();
        }
        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
            dateCreated = new Date();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public static double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public static void setAnnualInterestRate(double annualInterestRate) {
            Account.annualInterestRate = annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        double getMonthlyInterestRate() {
            return annualInterestRate / 100.0 / 12.0;
        }

        double getMonthlyInterest() {
            return balance * getMonthlyInterestRate();
        }

        void withdraw(double amount) {
            balance -= amount;
        }

        void deposit(double amount) {
            balance += amount;
        }
    }
}
