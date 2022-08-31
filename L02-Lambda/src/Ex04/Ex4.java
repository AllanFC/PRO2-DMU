package Ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex4 {

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

        //b
//        Iterator<Runner> it = runners.iterator();
//        while (it.hasNext()){
//            Runner r = it.next();
//            if(r.getLapTime() >= 40){
//                it.remove();
//            }
//        }

        //d
//        Predicate<Runner> gt40 = runner -> runner.getLapTime() >= 40;
//        removeIf(runners,gt40);

        //e
        runners.removeIf(runner -> runner.getLapTime() >= 40);

        System.out.println(runners);
        System.out.println();
    }

    /** c)
     * Removes runners that satisfies the given filter.
     * Returns true, if any runner is removed.
     */
    public static boolean removeIf(List<Runner> runners, Predicate<Runner> filter){
        Iterator<Runner> it = runners.iterator();
        boolean runnerRemoved = false;
        while(it.hasNext()){
            Runner r = it.next();
            if(filter.test(r)){
                it.remove();
                runnerRemoved = true;
            }
        }
        return runnerRemoved;
    }
}