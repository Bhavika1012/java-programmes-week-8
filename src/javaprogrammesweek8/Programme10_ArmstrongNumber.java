package javaprogrammesweek8;
/*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
import java.util.Scanner;

public class Programme10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object created for user input
        System.out.println("Enter a number: ");
        int number = scanner.nextInt(); //Read integer input and stores it in number.

        int firstNumber = number;
        int sum = 0;

        while (number > 0) {  //loops until number is 0
            int value = number % 10; //calculates last value of number and by taking remainder when divided by 10
            sum += (value * value * value);
            number /= 10;
        }
        if (firstNumber ==sum) { //if it is an armstrong number print the below
            System.out.println(firstNumber + " is an Armstrong number.");
        } else { //if not then print the below here
            System.out.println(firstNumber + " is not Armstrong number.");

        }
scanner.close();

    }
}
