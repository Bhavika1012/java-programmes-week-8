package cylinder;

public class Cylinder extends Circle {
    public double height;


    public Cylinder(double radius, double height) { //Constructor to initialise the radius and height
        super(radius); //calling the parent class constructor
        if (height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getHeight() { //getter method for height
        return height;
    }
    public double getVolume(){ //Method for volume of cylinder
        return getArea() * height; //returning calculation of volume
    }
}
