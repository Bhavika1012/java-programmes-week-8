package javaprogrammesweek8;

import java.util.Scanner;

/*
6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
public class Programme6Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object created to read user input
        System.out.println("Enter number of rows: ");
        int numRows = scanner.nextInt(); //Reading input from user and storing it in numRows

        for (int a = 1; a <= numRows; a++) { //adding numbers to the previous in a row
            for (int b = 1; b <= a; b++) { //print numbers in each row
                System.out.print(b);
            }
            System.out.println(); //after printing all of the above in a row a new like will be printed
        }
        scanner.close();
    }
}
