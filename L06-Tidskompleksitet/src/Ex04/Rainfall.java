package Ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Rainfall {
    private final int[] weeklyRainfall = {
            20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13, 15, 10,
            9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2,
            0, 0, 18, 0, 0, 0, 34, 12, 34, 23, 23, 12, 44,
            23, 12, 34, 22, 22, 22, 22, 18, 19, 21, 32, 24, 13};
    private final List<Integer> list = Arrays.stream(weeklyRainfall).boxed().toList();
    /**
     * Return the week number of the first week
     * in the period of 3 weeks with the least rainfall.
     */
    public int minRainfall3() {
        int firstWeekIndex = 0;
        int rainOver3 = weeklyRainfall[0] + weeklyRainfall[1] + weeklyRainfall[2];
        int sum = rainOver3;
        for (int i = 1; i < weeklyRainfall.length-2; i += 1) {
            sum += weeklyRainfall[i+2];
            sum -= weeklyRainfall[i-1];
            if(sum < rainOver3){
                rainOver3 = sum;
                firstWeekIndex = i;
            }
        }
        return firstWeekIndex + 1;
    }
    /**
     * Return the week number of the first week
     * in the period of n weeks with the least rainfall.
     */
    public int minRainfallN(int n) {
        int firstWeekIndex = 0;
        int rainOverN = 0;
        for (int i = 0; i < n; i++) {
            rainOverN += weeklyRainfall[i];
        }
        int sum = rainOverN;
        for (int i = 1; i < weeklyRainfall.length-n; i += 1) {
            sum += weeklyRainfall[i+n-1];
            sum -= weeklyRainfall[i-1];
            if(sum < rainOverN){
                rainOverN = sum;
                firstWeekIndex = i;
            }
        }
        return firstWeekIndex+1;
    }
    /**
     *  Return the week number of the first week in the longest period,
     *  where the rainfall has been exactly the same each week.
     */
    public int sameRainfall() {
        int maxPeriod = 0;
        int firstWeekIndex = 0;
        int counter = 0;
        for (int i = 1; i < weeklyRainfall.length; i++) {
            if(weeklyRainfall[i-1] == weeklyRainfall[i]){
                counter++;
            } else{
                counter = 0;
            }
            if(counter > maxPeriod){
                firstWeekIndex = i - counter;
                maxPeriod = counter;
            }
        }
        return firstWeekIndex + 1;
    }
}
