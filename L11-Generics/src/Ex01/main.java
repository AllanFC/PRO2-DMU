package Ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.printf("A)\n");
        Person<String> p1 = new Person<>("Hans", 32);
        FullName fn = new FullName("Erik", "Hansen");
        Person<FullName> p2 = new Person<>(fn, 42);

        System.out.println(p1);
        System.out.println(p2);

        System.out.printf("\nB)\n");
        Person<String> p3 = new Person<>("Lars", 30);
        System.out.println(p1.compareTo(p3));
        FullName fn1 = new FullName("Karsten", "Andersen");
        Person<FullName> p4 = new Person<>(fn1, 35);
        System.out.println(p2.compareTo(p4));
        FullName fn3 = new FullName("Peter", "Lorensen");
        Person<FullName> p5 = new Person<>(fn3, 28);
        ArrayList<Person<FullName>> list = new ArrayList<>(List.of(p5, p2, p4));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.printf("\nC)\n");
        list.sort((person1, person2) -> {
            return Integer.compare(person1.getAge(), person2.getAge());
        });
        System.out.println(list);
    }
}
