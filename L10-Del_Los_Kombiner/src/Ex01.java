import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    private static int sum = 0;
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(sumList(list,0,list.size()-1));
    }

    public static int sumList(List<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            sum = sumList(list, l, m) + sumList(list, m + 1, h);
        }
        return sum;
    }
}