package javaprogrammesweek8;

import java.util.Scanner;

/*
. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
public class Programme3Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object created for user input
        System.out.println("Enter a single character from the alphabet: ");
        String input = scanner.nextLine(); //reading input using scanner.nextLine()

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) { //Checking to see if valid single letter is used
            System.out.println("Error: Invalid input, please enter a single letter from the alphabet.");
        } else {
            char letter = Character.toLowerCase(input.charAt(0));
            //Converting character to lowercase so both uppercase and lowercase inputs work
             if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') { //Checking to see if input matches the vowels
                System.out.println("Input letter is a Vowel");
            } else {
                System.out.println("Input letter is Consonant");

            }
        }
        scanner.close();
    }
}
