import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(8, 56, 45, 34, 15, 12, 34, 44));
        mergesort(list,0,list.size()-1);
    }

    private static void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        System.out.println(temp);
        // <flet list[low..middle] og list[middle+1..high] over i
        // en ny liste (temp) ved en total fletning>
        // <list[low..high] = temp>
    }
}
