package javaprogrammesweek8;

/*
15. Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *
 */
public class Programme15_LeftAngleTriangle {
    public static void main(String[] args){
        int a = 5; //number of rows in the triangle

        for (int b = 1; b <= a; b++) { //outer loop

            for (int c = 1; c <= b; c++) { //inner loop
                System.out.print("* ");
            }

            // Move to next line after each row is printed
            System.out.println();
        }
    }
    }
