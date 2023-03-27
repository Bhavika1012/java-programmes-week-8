package poolarea;

public class Cuboid extends Rectangle {
    public double height; //instance variable of double type

    public Cuboid(double width, double length, double height) { //constructor with params
        super(width, length); //calling constructor of parent class with params
        this.height = height; // Initialize the height field with params

        if (height < 0) { //check if height is less than zero
            this.height = 0; //set height to zero
        }
    }
    public double getHeight() { //Method to get height
        return height;
    }


    public double getVolume() { // Method to get volume of the cuboid
        return getArea() * height; //Get area of rectangle from the parent class and multiply it with height
    }

}
