package Ex01;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Lend {

    public Lend() {
    }

    /*
     Returns the amount of the fine according to the table above.
     Pre: calculatedDate < actualDate
          (calculatedDate is the expected return date and
           actualDate is the day you actually return the book)
    */
    public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult){
        int fine = 0;
        int days = (int)calculatedDate.until(actualDate,ChronoUnit.DAYS);
        if(days >=1 && days <= 7){
            if(adult){
                fine = 20;
            } else {
                fine = 10;
            }
        } else if(days >=8 && days <= 14){
            if(adult){
                fine = 60;
            } else {
                fine = 30;
            }
        } else if(days >=15){
            if(adult){
                fine = 90;
            } else {
                fine = 45;
            }
        }
        return fine;
    }
}
