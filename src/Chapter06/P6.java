package Chapter06;

import java.util.Scanner;

/**
 * program to enter what type of currency you want to buy and convert from that
 * currency to American dollars
 *
 * @author Shahim Panjwani
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Euro Rate: ");
        double euroRate = input.nextDouble();
        System.out.print("Pound Sterling Rate: ");
        double poundSterlingRate = input.nextDouble();
        System.out.print("Yen Rate: ");
        double yenRate = input.nextDouble();
        String response = "";

        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            double dollars = input.nextDouble();

            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen:");
            String code = input.next().toUpperCase();
            switch (code) {
                case "E":
                    System.out.printf("%.2f dollars = %.2f Euros.\n", dollars, convert(dollars, euroRate));
                    break;
                case "P":
                    System.out.printf("%.2f dollars = %.2f Pound Sterlings.\n", dollars, convert(dollars, poundSterlingRate));
                    break;
                case "Y":
                    System.out.printf("%.2f dollars = %.2f Yen.\n", dollars, convert(dollars, yenRate));
                    break;
            }

            do {
                System.out.print("Are there more conversions to perform? ");
                response = input.next().toLowerCase();
            } while (!response.equals("yes") && !response.equals("no"));

        } while (response.equals("yes"));

    }

    /**
     * This method will be the exchange rate
     *
     * @param dollars the amount of dollars that is being converted
     * @param exchangeRate the currency that is being converted
     * @return the amount of dollars in the conversion
     */
    public static double convert(double dollars, double exchangeRate) {
        if (dollars > 100) {
            return 0.95 * dollars * exchangeRate;
        } else {
            return 0.90 * dollars * exchangeRate;
        }
    }
}
