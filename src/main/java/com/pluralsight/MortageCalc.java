package com.pluralsight;
import java.util.Scanner;
public class MortageCalc {
    public static void main(String[]args){
       Scanner reader = new Scanner(System.in);
       //STILL FIXING THIS, MONTHLY LOAN CALC
        // define variables
        // Prepare variables
        // A = P * (1 + r/n) ^ (n*t)
        double totalOwedWithInterestMonthly;
        double initialLoan;
        int numberOfYears;

        //Ask user to insert information (initial deposit)
        System.out.print("Enter your loan amount: $");
        initialLoan = reader.nextDouble();

        //calculating interest rate
        System.out.print("Enter your interest rate (as a percentage): ");
        double rate = reader.nextDouble();

        //Asking for years
        System.out.print("Loan term (in years): ");
        numberOfYears = reader.nextInt();

        //Compound (Monthly APR)
        System.out.print("Compound: Monthly (APR)");

        //Converting annual interest rate from percentage to decimal
        double monthsInYears = 12;
        double monthlyRate = rate / monthsInYears;

        //calculate total with compound interest
        totalOwedWithInterestMonthly = initialLoan * Math.pow(1 + (monthlyRate / monthsInYears), monthsInYears * numberOfYears - initialLoan);
        double totalInterest = totalOwedWithInterestMonthly - initialLoan;

        System.out.print(totalOwedWithInterestMonthly);

        //Display message
       // System.out.printf("Total amount after %d years: $%.2f%n", numberOfYears, totalOwedWithInterest);
        //System.out.printf("Total earned in interest: $%.2f%n", totalEarnedInInterest);


        reader.close();

    }
}
