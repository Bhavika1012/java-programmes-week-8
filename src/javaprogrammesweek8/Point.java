package javaprogrammesweek8;

/*
16. Point
You have to represent a point in 2D space. Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters x and y of type int and it needs to initialize the
fields.
Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this
Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance
between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance
between this Point and another Point as double.
How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.
TEST EXAMPLE
→ TEST CODE: Write the below code into the main method.
Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());

System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());
OUTPUT
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0
NOTE: Use Math.sqrt to calculate the square root √.
NOTE: Try to avoid duplicated code.
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 7 methods.
 */
public class Point { //1st method
    //two instance variable with x and y
    public int y;
    public int x;

    public Point() { //constructor with no params //2nd method
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) { //constructor with params //3rd method
        this.x = x;
        this.y = y;
    }

    public int getX() { //instance method with no params //4th method
        return x; //returning x value
    }

    public int getY() { //instance method with no params //5th method
        return y; //returning y value
    }

    public void setX(int x) { //instance method with params, no return value //6th method
        this.x = x; //setting value of x field
    }

    public void setY(int y) {
        this.y = y; //setting value of y field
    }

    public double distance() { //Method to calculate distance between point 0.0.
        return distance(0, 0);
    }

    public double distance(int x, int y) { //Method to calculate distance between this point and another point.
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
