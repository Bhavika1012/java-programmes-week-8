package javaprogrammesweek8;

/*
4. Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
Hint: Use n % 10 to extract the least-significant digit.
Use n = n / 10 to discard the least-significant digit.
The method needs to be static
Create a class with the name DigitSumChallenge.
 */
public class DigitSumChallenge {
    public static int sumDigits(int number) {
        if (number < 10) { //invalid if under 10
            return -1; //returning =1 for negative numbers
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10; //continuously adds the least significant number to sum
            number /= 10; //discards the least-significant number until it is 0
        }
        return sum;

        }

    public static void main(String[] args) {
        System.out.println(sumDigits(125)); //should print 8
        System.out.println(sumDigits(1234567)); //should print 28
        System.out.println(sumDigits(8)); //should print -1 as input is invalid number

    }
    }