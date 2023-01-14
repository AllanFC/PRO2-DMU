package Ex02;

public class Main {
    public static void main(String[] args) {
         BSTreeSet BStree = new BSTreeSet<>();
         BStree.add(45);
         BStree.add(22);
         BStree.add(30);
         BStree.add(25);
         BStree.add(11);
         BStree.add(15);
         BStree.add(77);
         BStree.add(90);
         BStree.add(88);

         System.out.println(BStree);
         System.out.println("Max value: " + BStree.max());
         System.out.println(BStree.contains(90));
         System.out.println(BStree.removeMin());
         System.out.println(BStree.removeMin());
         System.out.println(BStree.removeMin());
         System.out.println(BStree.removeMin());
         System.out.println(BStree.removeMin());
         System.out.println(BStree.removeMin());
         System.out.println(BStree.removeMin());
         System.out.println(BStree.removeMin());
         System.out.println(BStree.removeMin());
         System.out.println(BStree.removeMin());
         System.out.println(BStree);
    }
}
