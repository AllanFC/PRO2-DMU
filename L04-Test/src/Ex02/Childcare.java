package Ex02;

public class Childcare {
    public Childcare() {
    }

    /*
     * Returns the total payment for a family minus discount
     * Pre: small >= 0, big >= 0
     * (small is the number of preschool children
     * and big is the number of children attending school)
     */
    public int totalPayment (int small, int big){
        int payment = 0;
        int children = small + big;
        int counter = 1;
        while(counter <= children){
            if(payment == 0){
                if(small > 0){
                    payment = 2000;
                    small--;
                } else{
                    payment = 1000;
                    big--;
                }
            }
            if(counter <= 2){
                if(small > 0){
                    payment += 2000*0.75;
                    small--;
                } else if (big > 0) {
                    payment += 1000*0.75;
                    big--;
                }
            } else {
                if(small > 0){
                    payment += 2000*0.5;
                    small--;
                } else if (big > 0) {
                    payment += 1000*0.5;
                    big--;
                }
            }
            counter++;
        }
        return payment;
    }
}
