package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Prepare variables
        // A = P * (1 + r/n) ^ (n*t)
        double totalWithInterest;
        double initialDeposit;
        int numberOfYears;

        //Ask user to insert information (initial deposit)
        System.out.print("Enter your deposit amount: $");
        initialDeposit = reader.nextDouble();

        //calculating interest rate
        System.out.print("Enter your interest rate (as a percentage): ");
        double rate = reader.nextDouble();

        //Asking for years
        System.out.print("How many years: ");
        numberOfYears = reader.nextInt();

        //Compound time
        System.out.print("Enter the amount of times interest is compounded per year: ");
        int compoundedAmount = reader.nextInt();

        //Converting annual interest rate from percentage to decimal
        double annualInterestRate = rate / 100;

        //calculate total with compound interest
        totalWithInterest = initialDeposit * Math.pow(1 + (annualInterestRate / compoundedAmount), compoundedAmount * numberOfYears);
        double totalEarnedInInterest = totalWithInterest - initialDeposit;

        //Display message
        System.out.printf("Total amount after %d years: $%.2f%n", numberOfYears, totalWithInterest);
        System.out.printf("Total earned in interest: $%.2f%n", totalEarnedInInterest);


        reader.close();
    }
}