package Ex02;

public class Circle extends FigureComponent{

    private String name;

    private double radius;

    public Circle(String name, int radius) {
        super(name);
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.printf("Name: %s Circ: %.2f\n", getName(), calcCirc());
    }

    @Override
    public double calcCirc() {
        return 2 * Math.PI * radius;
    }
}
