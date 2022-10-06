package Ex02;

public class Rectangle extends FigureComponent{

    private int length;
    private int height;

    public Rectangle(String name, int length, int height) {
        super(name);
        this.length = length;
        this.height = height;
    }


    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.printf("Name: %s Circ: %.2f\n", getName(), calcCirc());
    }

    @Override
    public double calcCirc() {
        return 2 * length + 2 * height;
    }
}
