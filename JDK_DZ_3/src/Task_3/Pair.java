package Task_3;

public class Pair <T, S>{
    private T first;
    private S second;

    public Pair(T first, S second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }


    @Override
    public String toString() {
        return "first element = " + first +
                ", second element = " + second;
    }
}
