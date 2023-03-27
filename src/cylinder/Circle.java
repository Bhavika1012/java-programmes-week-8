package cylinder;

public class Circle {
    double radius;
    public Circle(double radius){ //constructor with params
        if (radius < 0) { //setting radius fields
            this.radius = 0;
        }else {
            this.radius=radius;
        }
    }

    public double getRadius() { //getter method for radius field
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
