package ProgrammingExercise10;

import java.util.Date;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean correctID = false;
            int id = -1;
            while (!correctID) {
                System.out.print("Enter an ID: ");
                id = scanner.nextInt();

                if (id < 0 || id >= accounts.length) {
                    System.out.println("Incorrect ID");
                } else
                    correctID = true;
            }
            boolean exit = false;

            while (!exit) {
                System.out.println("Main Menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[id].balance);
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        int withdrawAmount = 0;
                        withdrawAmount = scanner.nextInt();
                        accounts[id].balance -= withdrawAmount;
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        int depositAmount = 0;
                        depositAmount = scanner.nextInt();
                        accounts[id].balance += depositAmount;
                        System.out.println();
                        break;
                    case 4:
                        System.out.println();
                        exit = true;
                        break;
                }
            }
        }
    }
}
