package thecarpetcompany;

public class Carpet {
    double cost;

    public Carpet(double cost) { //Constructor with parameter
            this.cost = (cost < 0) ? 0 : cost; //initialising cost and setting value to 0.
        }
public double getCost(){
    return cost;
}
    }
