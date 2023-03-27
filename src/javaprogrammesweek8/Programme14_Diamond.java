package javaprogrammesweek8;

/*
14. Write a program in Java to display the pattern like a diamond.
While loop
       *
      ***
     *****
    *******
   *********
  ***********
 *************
  ***********
   *********
    *******
     *****
      ***
       *
 */
public class Programme14_Diamond {
    public static void main(String[] args) {
        int a = 7; //number of rows in the diamond
        int b = 1; //counting rows and starting stars in each row
        int c, spaces; //counts the number of stars and spaces in  each row

        //nested while loop
        while (b <= a) {
            spaces = a - b; // calculate number of spaces to print before the stars in each row
            c = 1;
            while (c <= spaces) {
                System.out.print(" ");
                c++;
            }

            c = 1;
            while (c <= b * 2 - 1) {
                System.out.print("*");
                c++;
            }

            System.out.println();
            b++;
        }

        b = a - 1; // start from the second last row
        while (b >= 1) {
            spaces = a - b; // calculate the number of spaces to print before the stars in each row
            c = 1;
            while (c <= spaces) {
                System.out.print(" ");
                c++;
            }

            c = 1;
            while (c <= b * 2 - 1) {
                System.out.print("*");
                c++;
            }

            System.out.println();
            b--;
        }
    }
}


