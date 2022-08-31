package Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgittei", 17),
                new Person("Liselotte", 9)
        );


        System.out.println(persons);
        System.out.println();
        //a
        System.out.printf("\na\n");
        Predicate<Person> f44 = Person -> Person.getAge() == 44;
        System.out.println(findFirst(persons,f44));

        //b
        System.out.printf("\nb\n");
        Predicate<Person> fs = Person -> Person.getName().startsWith("S");
        System.out.println(findFirst(persons, fs));

        //c
        System.out.printf("\nc\n");
        Predicate<Person> fii = Person -> Person.getName().indexOf("i") != Person.getName().lastIndexOf("i");
        System.out.println(findFirst(persons, fii));

        //d
        System.out.printf("\nd\n");
        Predicate<Person> fnl = Person -> Person.getName().length() == Person.getAge();
        System.out.println(findFirst(persons, fnl));

        //e
        System.out.printf("\ne\n");
        List<Person> list1 = findAll(persons, p -> p.getAge() < 30);
        System.out.println(list1);

        //f
        System.out.printf("\nf\n");
        List<Person> list2 = findAll(persons, p -> p.getName().toLowerCase().contains("i"));
        System.out.println(list2);

        //g
        System.out.printf("\ng\n");
        List<Person> list3 = findAll(persons, p -> p.getName().indexOf("S") == 0);
        System.out.println(list3);

        //h
        System.out.printf("\nh\n");
        List<Person> list4 = findAll(persons, p -> p.getName().length() == 5);
        System.out.println(list4);

        //i
        System.out.printf("\ni\n");
        List<Person> list5 = findAll(persons, p -> p.getName().length() >= 6 && p.getAge() < 40);
        System.out.println(list5);
    }


    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    public static List findAll(List<Person> list, Predicate<Person> filter){
        List<Person> people = new ArrayList<>();
        for (Person p : list) {
            if (filter.test(p))
                people.add(p);
        }
        return people;
    }
}
