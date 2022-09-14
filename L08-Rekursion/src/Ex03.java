public class Ex03 {
    public static void main(String[] args) {
        int product = prod(5,5);
        System.out.println(product);

        int productRus = prodRus(5,5);
        System.out.println(productRus);
    }

    public static int prod(int a, int b){
        if(a > 1){
            return prod(a-1, b)+b;
        } else if (a == 1) {
            return b;
        }
        return 0;
    }

    public static int prodRus(int a, int b){
        if(a > 0){
            return a%2==0 ? prodRus(a/2,b+b) : prodRus(a-1,b)+b;
        }
        return 0;
    }
}
