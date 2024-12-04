package Task_1;

public class Main {
    public static void main(String[] args) {

        Calculator.sum(3, 4.0);
        System.out.println(Calculator.getResult());

        Calculator.multiply(3.0f, 4.0);
        System.out.println(Calculator.getResult());

        Calculator.multiply(10, 4.0);
        System.out.println(Calculator.getResult());

        Calculator.divide(3.0f, 4.0);
        System.out.println(Calculator.getResult());

        Calculator.subtract(100.2, 2.9f);
        System.out.println(Calculator.getResult());
    }
}
