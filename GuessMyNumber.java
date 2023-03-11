/**
 * @author nethmeeperera
 * @version 01/11/2023
 * CSC2720 Lab #
 * due on 01/15/2023
 */
import java.util.Scanner;
public class GuessMyNumber {


    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int low = 0, high = 31;
        System.out.print("Enter n : ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Enter a positive integer for n: 32");

            System.out.println("Welcome to Guess My Number! ");
            System.out.println("Please think of a number between 0 and 31");
            System.out.print("Enter n : ");
            n = in.nextInt();

            while (n > 0) {
                int i = (low + high) / 2;
                System.out.print("Is your number : " + i + " ? ");
                System.out.println("\nPlease enter C for correct, H for too high and L for too low. ");
                System.out.print("Enter your answer (H/L/C) : ");
                char c = in.next().charAt(0);
                if (c == 'C') {
                    System.out.println("Thank you for playing Guess My Number!");
                    break;
                } else if (c == 'H') {
                    high = i;
                } else if (c == 'L') {
                    low = i;
                } else {
                    while (c != 'H' && c != 'L' && c != 'C') {
                        System.out.print("Enter your answer (H/L/C) : ");
                        c = in.next().charAt(0);
                    }
                    if (c == 'C') {
                        System.out.println("Thank you for playing Guess My Number!");
                        break;
                    } else if (c == 'H') {
                        high = i;
                    } else if (c == 'L') {
                        low = i;
                    }

                }
            }
        }
    }
}

