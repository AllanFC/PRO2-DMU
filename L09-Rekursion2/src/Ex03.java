public class Ex03 {
    public static void main(String[] args) {
        System.out.println(CalcNo(3));
        System.out.println(CalcNo(4));
        System.out.println(CalcNo(5));
        System.out.println(CalcNo(6));

    }


    //Requires: n >= 0
    public static int CalcNo(int n){
        if(n == 0){
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 2){
            return 5;
        }
        return n % 2 == 0 ? 2*CalcNo(n-3) - CalcNo(n-1) : CalcNo(n-1) + CalcNo(n-2) + 3*CalcNo(n-3);
    }

    public static int calcNoIt(int n){
        int result = 0;
        while(n > 2){
            if(n % 2 == 0){

            }
        }
        return 0;
    }
}
