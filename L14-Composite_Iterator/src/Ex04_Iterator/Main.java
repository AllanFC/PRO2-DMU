package Ex04_Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mads", 30);
        Person p2 = new Person("Henrik", 32);
        Person p3 = new Person("Lars", 35);

        ArrayedList<Person> list = new ArrayedList<>(3);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Iterator<Person> personIterator = list.iterator();

        printPeople(personIterator);

    }

    public static void printPeople(Iterator iterator){
        while(iterator.hasNext()){
            Person p = (Person) iterator.next();
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
