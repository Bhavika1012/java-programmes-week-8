package javaprogrammesweek8;

import java.util.Scanner;

/*
2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; //initialise min and max variable to the smallest and largest possible values.
        int max = Integer.MIN_VALUE;
        while (true) { //while loop to keep entering number until invalid number is entered
            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // Update the min and max variables if the new number is smaller or larger
                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            } else {
                // The user entered an invalid number, break out of the loop
                break;
            }
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);

        scanner.close();
    }
    }