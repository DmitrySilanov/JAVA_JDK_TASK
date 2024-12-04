package Task_1;

public class Calculator {

    private static Number result;

    public static Number getResult() {
        return result;
    }

    static <T extends Number> void sum(T a, T b) {
        if (a != null && b != null) {
            result = a.doubleValue() + b.doubleValue();
        } else {
            throw new IllegalArgumentException("Такой тип данных не поддерживается!");
        }
    }

    static <T extends Number> void multiply(T a, T b) {
        if (a != null && b != null) {
            result = a.doubleValue() * b.doubleValue();
        } else {
            throw new IllegalArgumentException("Такой тип данных не поддерживается!");
        }
    }

    static <T extends Number> void divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Деление на 0 запрещено!");
        }
        if (a != null && b != null) {
            result = a.doubleValue() / b.doubleValue();
        } else {
            throw new IllegalArgumentException ("Такой тип данных не поддерживается!");
        }
    }

    static <T extends Number> void subtract(T a, T b) {
        if (a != null && b != null) {
            result = a.doubleValue() - b.doubleValue();
        } else {
            throw new ArithmeticException("Такой тип данных не поддерживается!");
        }
    }
}