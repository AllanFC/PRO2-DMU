package Ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Henrik");
        Customer c2 = new Customer(2,"Anders");
        Customer c3 = new Customer(3, "Jerry");
        ArrayList<Customer> list = new ArrayList<>(List.of(c1, c3, c2));

        System.out.println(list);
        Collections.sort(list, new CompName());
        System.out.println(list);
        Collections.sort(list, new CompNumb());
        System.out.println(list);


        String s = "allan.allan@allan.dk";
        String[] strings = s.split("\\.");
        System.out.println(Arrays.toString(strings));
    }

}
