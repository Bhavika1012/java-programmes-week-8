package javaprogrammesweek8;

/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative

NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme11_EvenDigitSum {
    public static int getEvenDigitSum(int number) { //static method created with parameter called number
        if (number < 0) { // checks if number is negative are returns -1 if it is
            return -1;
        }
        int sum = 0;
        while (number > 0) { //loops until number is 0
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 123456789;
        int evenDigitSum = getEvenDigitSum(number); //calling method with number as argument
        System.out.println("The sum of even digits of " + number + " is " + evenDigitSum);

        number = 252;
        evenDigitSum = getEvenDigitSum(number);
        System.out.println("The sum of even digits of " + number + " is " + evenDigitSum);

        number = -22;
        evenDigitSum = getEvenDigitSum(number);
        System.out.println("The sum of even digits of " + number + " is " + evenDigitSum);
    }
}
