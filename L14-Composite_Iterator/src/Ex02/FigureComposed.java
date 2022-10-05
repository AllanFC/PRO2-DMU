package Ex02;

import java.util.ArrayList;
import java.util.Arrays;

public class FigureComposed extends FigureComponent{

    ArrayList<FigureComponent> components = new ArrayList<>();
    private String groupName;
    private String groupType;

    public FigureComposed(String groupName, String groupType) {
        super();
        this.groupName = groupName;
        this.groupType = groupType;
    }

    @Override
    public String getName() {
        return groupName;
    }

    @Override
    public String getType() {
        return groupType;
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
        for(FigureComponent fc : components){
            fc.draw();
        }
    }
}
