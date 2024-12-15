import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    static final int countIterations = 1000;
    static HashMap<Integer, Boolean> resultsWithSameDoor;
    static HashMap<Integer, Boolean> resultsWithOtherDoor;

    public static void main(String[] args) {
        Game game = new Game(3);
        resultsWithSameDoor = game.start(countIterations, false);
        resultsWithOtherDoor = game.start(countIterations, true);
        System.out.println("\nСтатистика при отказе от изменения двери: ");
        AtomicInteger winStat = new AtomicInteger();
        for (HashMap.Entry<Integer, Boolean> entry : resultsWithSameDoor.entrySet()) {
            if (entry.getValue()) {
                winStat.getAndIncrement();
            }
        }
        System.out.printf("Из %s игр выиграно %s", resultsWithSameDoor.size(), winStat);
        System.out.println('\n');
        System.out.println("Статистика при изменении двери: ");
        winStat.set(0);
        for (HashMap.Entry<Integer, Boolean> entry : resultsWithOtherDoor.entrySet()) {
            if (entry.getValue()) {
                winStat.getAndIncrement();
            }
        }
        System.out.printf("Из %s игр выиграно %s", resultsWithOtherDoor.size(), winStat);
    }
}