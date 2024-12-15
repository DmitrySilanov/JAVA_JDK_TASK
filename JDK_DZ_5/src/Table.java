public class Table extends Thread {
    private final Philosophers[] philosophers;

    public Table() {
        philosophers = new Philosophers[5];
        Object[] forks = new Object[philosophers.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];
            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosophers("Philosopher" + String.valueOf(i + 1), rightFork, leftFork);
            } else {
                philosophers[i] = new Philosophers("Philosopher" + String.valueOf(i + 1), leftFork, rightFork);
            }
        }
    }

    @Override
    public void run() {
        startFeast();
    }

    private void startFeast() {
        System.out.println("Feast is started");
        for (Philosophers philosopher : philosophers) {
            philosopher.start();
        }
    }
}
