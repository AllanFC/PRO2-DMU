package Ex02;

public class Rectangle extends FigureComponent{

    private String name;
    private String type;
    private int length;
    private int height;

    public Rectangle(String name, String type, int length, int height) {
        super();
        this.name = name;
        this.type = type;
        this.length = length;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.printf("Name: %s Type: %s\n", name, type);
    }

    @Override
    public double calcCirc() {
        return 2 * length + 2 * height;
    }
}
