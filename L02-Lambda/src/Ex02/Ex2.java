package Ex02;

import Ex01.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();

        //a
        System.out.printf("\na)\n");
        runners.forEach(runner -> System.out.println(runner));

        //b
        System.out.printf("\nb)\n");
        runners.forEach(runner -> {
            if(runner.getLapTime() < 30){
                System.out.println(runner);
            }
        });

        //c
        System.out.printf("\nc)\n");
        runners.sort((runner1, runner2) -> {
            return Integer.compare(runner1.getLapTime(), runner2.getLapTime());
        });
        runners.forEach(runner -> System.out.println(runner));

        //d
        System.out.printf("\nd)\n");
        final int[] sum = new int[1];
        runners.forEach(runner -> sum[0] += runner.getLapTime());
        System.out.println("Sum of Laptimes " + sum[0] + "seconds");
        System.out.println();
    }
}