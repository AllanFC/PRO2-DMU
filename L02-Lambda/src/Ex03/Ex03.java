package Ex03;

import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("a)");
        List<Integer> list = new ArrayList<>(List.of(8, 3, 5, 1, 0, 7, 4, 9));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int number = it.next();
            System.out.print(number + " ");
        }

        System.out.printf("\nb)\n");
        Map<Integer, Integer> map = new TreeMap<>(Map.of(2,4, 3,9, 4, 16, 5, 25, 6,36));
        Iterator<Integer> mapit = map.keySet().iterator();
        while(mapit.hasNext()){
            int k = mapit.next();
            System.out.printf("(%d,%d)",k,map.get(k));
        }
        }
    }

