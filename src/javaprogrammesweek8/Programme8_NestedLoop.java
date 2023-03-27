package javaprogrammesweek8;

/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */
public class Programme8_NestedLoop {
    public static void main(String[] args) {
        int rows = 5; //Number of rows required in the triangle
        for (int a = 0; a < rows; a++) { //outer loop, adding @ to previous until it is less than 5 @ symbols.
            for (int b = 0; b <= a; b++) {
                ; //inner loop, printing @ symbol but making sure it is less than a.
                System.out.print("@"); //print in same line
            }
            System.out.println(); //Move to next line
        }

    }
}
