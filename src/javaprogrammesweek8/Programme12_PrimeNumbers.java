package javaprogrammesweek8;

import java.util.Scanner;

public class Programme12_PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object to read user input
        System.out.println("Enter a number: ");
        int number = scanner.nextInt(); //store user input

        if (prime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
            scanner.close();
        }
    }

    public static boolean prime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int a = 2; a * a <= number; a++) {
            if (number % a == 0) {
                return false; //if number is divisible by a
            }
        }
        return true; //if number is not divisible by any number expect 1 and itself.

    }

}
