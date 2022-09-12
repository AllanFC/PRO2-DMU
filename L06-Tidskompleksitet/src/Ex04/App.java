package Ex04;

public class App {
    public static void main(String[] args) {
        Rainfall rain = new Rainfall();
        System.out.println("A)");
        System.out.println(rain.minRainfall3());
        System.out.println();
        System.out.println("B)");
        System.out.println(rain.minRainfallN(3));
        System.out.println();
        System.out.println("C)");
        System.out.println(rain.sameRainfall());
    }
}
