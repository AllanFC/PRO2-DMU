package Ex01;

import java.io.Serializable;

public class MyTime implements Serializable {
    private int time = 0;

    public MyTime() {
    }

    public int getTime() {
        return time;
    }

    public void increase(){
        time++;
    }

    public void reset(){
        time = 0;
    }
}
