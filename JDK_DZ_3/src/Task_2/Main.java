package Task_2;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] array2 = {1, 2, 2, 4, 5, 6, 7, 8, 9, 10};
        Integer[] array3 = {1, 2, 3, 3, 5, 6, 7, 8, 9, 10};
        Integer[] array4 = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        String[] array5 = {"a", "b", "X", "d", "e", "f"};
        String[] array6 = {"a", "b", "d", "e", "f"};
        String[] array7 = {"a", "b", "c", "d", "e", "f"};
        String[] array8 = {"a", "b", "c", "d", "e", "f"};

        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));
        System.out.println(compareArrays(array1, array4));
        System.out.println(compareArrays(array1, array5));
        System.out.println(compareArrays(array5, array6));
        System.out.println(compareArrays(array5, array7));
        System.out.println(compareArrays(array5, array8));
    }

    public static <T> boolean compareArrays(T[] a, T[] b) {
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i].getClass().equals(b[i].getClass())){
                return true;
            }
        }
        return true;
    }
}
