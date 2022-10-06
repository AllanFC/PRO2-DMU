package Ex02;

import java.util.ArrayList;
import java.util.Arrays;

public class FigureComposed extends FigureComponent{
    ArrayList<FigureComponent> components = new ArrayList<>();

    public FigureComposed(String name) {
        super(name);
    }

    @Override
    public void add(FigureComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FigureComponent component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        System.out.println(getName() + ":");
        double sum = 0;
        for(FigureComponent fc : components){
            fc.draw();
            sum += fc.calcCirc();
        }
        System.out.println("Total group circumference: " + sum);
    }
}
