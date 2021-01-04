package day1;
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables. */
        // Note: If you have trouble reading the entire String, please go back and
        // review the Tutorial closely.

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double doubleNumber = scan.nextDouble();
        String name = scan.next();

        System.out.println(number);
        System.out.println(doubleNumber);
        System.out.println(name);

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /*
         * Concatenate and print the String variables on a new line; the 's' variable
         * above should be printed first.
         */

        scan.close();
    }


}
