package Ex02;

public class Square extends FigureComponent{

    private double sLength;

    public Square(String name, double sLength) {
        super(name);
        this.sLength = sLength;
    }


    @Override
    public void draw() {
        System.out.printf("Name: %s Circ: %.2f\n", getName(), calcCirc());
    }

    @Override
    public double calcCirc() {
        return 4*sLength;
    }
}
