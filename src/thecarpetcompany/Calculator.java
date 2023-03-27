package thecarpetcompany;

public class Calculator {
    public Floor floor;
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) { //constructor with params
        this.floor = floor; //initialising variables
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost(); //calculating total cost of carpet.
    }

}
