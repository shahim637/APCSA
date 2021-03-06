package Chapter02;

import java.util.Scanner;

/**
 * Program to ask the user for the balance and interest rate and to display the
 * interest to the console
 *
 * @author Shahim Panjwani
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = balance * (interestRate / 1200);
        System.out.println("The interest is " + interest);
    }
}
