package Ex02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FigureComponent triangle = new Triangle("T1", 4);
        FigureComponent rectangle = new Rectangle("R1", 5,4);
        FigureComponent circle = new Circle("C1",5);
        FigureComponent square = new Square("S1", 4);

        FigureComponent figureGroup = new FigureComposed("4Sides");

        figureGroup.add(rectangle);
        figureGroup.add(square);

        ArrayList<FigureComponent> list = new ArrayList<>();
        list.add(triangle);
        list.add(circle);
        list.add(figureGroup);

        for(FigureComponent e : list){
            e.draw();
        }
    }
}
