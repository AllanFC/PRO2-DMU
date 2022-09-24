import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(8, 56, 45, 34, 15, 12, 34, 44));
        mergesort(list);
        System.out.println(list);
    }

    public static void mergesort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
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
        int i = low;
        int j = middle+1;
        while(i <= middle && j <= high){
            if(list.get(i) <= list.get(j)){
                temp.add(list.get(i));
                i++;
            } else{
                temp.add(list.get(j));
                j++;
            }
        }

        while(i <= middle){
            temp.add(list.get(i));
            i++;
        }
        while(j <= high){
            temp.add(list.get(j));
            j++;
        }

        for (int k = 0; k < temp.size(); low++) {
            list.set(low, temp.get(k++));
        }
    }
}
