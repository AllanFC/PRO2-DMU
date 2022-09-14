public class Ex02 {
    public static void main(String[] args) {
        int pow = power(2,5);
        System.out.println(pow);

        int pow2 = power2(2,5);
        System.out.println(pow2);
    }

    public static int power(int n, int p){
        if(p == 0){
            return 1;
        }
        return n*power(n,p-1);
    }

    public static int power2(int n, int p){
        if(p > 0){
            if(p%2 ==0){
                return power2(n*n,p/2);
            } else{
                return n*power2(n,p-1);
            }
        }
        return 1;
    }
}
