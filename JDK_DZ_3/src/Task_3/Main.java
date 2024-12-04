package Task_3;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(123, "Hello");
        Pair<Boolean, Double> pair2 = new Pair<>(true, 3.14);
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair1.getFirst());
        System.out.println(pair2.getSecond());
    }
}