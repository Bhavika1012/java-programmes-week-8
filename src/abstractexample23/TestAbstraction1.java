package abstractexample23;

class TestAbstraction1 { //in real scenario, object is provided through method, e.g, getShape() method
    public static void main(String args[]) {

        Shape s = new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}
