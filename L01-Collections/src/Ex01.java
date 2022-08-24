import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Set<Integer> ints = new HashSet<>();
        ArrayList<Integer> numbers = new ArrayList<>(List.of(34, 12, 23, 45, 67, 34, 98));
        ints.addAll(numbers);
        System.out.println(ints);
        ints.add(23);
        System.out.println(ints);
        ints.remove(67);
        System.out.println(ints);
        System.out.println(ints.contains(23));
        System.out.println(ints.size());
    }
}
