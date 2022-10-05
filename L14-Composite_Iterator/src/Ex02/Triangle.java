package Ex02;

public class Triangle extends FigureComponent {

    private String name;
    private String type;
    private double length;

    public Triangle(String name, String type, double length) {
        super();
        this.name = name;
        this.type = type;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void draw() {
        System.out.printf("Name: %s Type: %s\n", name, type);
    }

    @Override
    public double calcCirc() {
        return 3*length;
    }
}
