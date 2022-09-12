import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] given = {5, 10, 5, 6, 4, 9, 8};
        System.out.println(Arrays.toString(prefixAverage(given)));
    }

    public static double[] prefixAverage(int[] input){
        double[] narray = new double[input.length];
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            narray[i] = sum / (i+1);
        }
        return narray;
    }
}
