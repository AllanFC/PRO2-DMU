package Ex02;

public abstract class FigureComponent {

    private String name;

    public FigureComponent(String name) {
        this.name = name;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
        throw new UnsupportedOperationException();
    }
    public void add(FigureComponent component){
        throw new UnsupportedOperationException();
    }

    public void remove(FigureComponent component){
        throw new UnsupportedOperationException();
    }

    public FigureComponent getIndex(int index){
        throw new UnsupportedOperationException();
    }

    public void draw(){
        throw new UnsupportedOperationException();
    }

    public double calcCirc(){
        throw new UnsupportedOperationException();
    }
}
