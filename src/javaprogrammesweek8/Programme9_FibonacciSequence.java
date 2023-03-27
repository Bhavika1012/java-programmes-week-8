package javaprogrammesweek8;
/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9_FibonacciSequence {
    public static void main(String[] args) {
        int a = 8; //number of values to print
        int first = 1, second = 1; //Creating two integer variables to value 1 which is the first two in the sequence.

        System.out.println(first);
        System.out.println(second);
        for (int b = 3; b <=a; b++){
            int nextNumber = first + second; //Calculating next number by adding the two previous numbers

            System.out.println(nextNumber + " ");
        first = second; //updates first number to second number
        second = nextNumber; //updates second number to next number

        }
    }
}
