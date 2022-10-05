package Ex02;

public class RectTri extends FigureComponent{

    private String name;
    private String type;

    private int tLength;
    private int rHeight;
    private int rLength;

    public RectTri(String name, String type, int tLength, int rHeight, int rLength) {
        super();
        this.name = name;
        this.type = type;
        this.tLength = tLength;
        this.rHeight = rHeight;
        this.rLength = rLength;
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
        return 3 * tLength + 2 * rHeight + 2 * rLength;
    }
}
