import java.util.Random;


public class Philosophers extends Thread {
        private final String name;
        private final Random random;
        private final Object leftFork;
        private final Object rightFork;
        private int timesFood;


        public Philosophers(String name, Object leftFork, Object rightFork) {
            this.name = name;
            random = new Random();
            this.leftFork = leftFork;
            this.rightFork = rightFork;
            timesFood = 0;
        }

        @Override
        public void run() {
            while (timesFood < 3) {
                think();
                synchronized (leftFork) {
                    takeLeftFork();
                    synchronized (rightFork) {
                        takeRightFork();
                        takeFood();
                        releaseRightFork();
                    }
                    releaseLeftFork();
                }
            }
            System.out.println(name + " is full");
        }

        private void think() {
            System.out.println(name + " is thinking");
            try {
                sleep(random.nextInt(1500, 3500));
                System.out.println(name + " is hungry");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void takeFood() {
            System.out.println(name + " is taking food");
            try {
                sleep(random.nextInt(2000, 3500));
                System.out.println(name + " stops taking food");
                timesFood++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void takeLeftFork() {
            System.out.println(name + " takes left fork");
        }

        private void takeRightFork() {
            System.out.println(name + " takes right fork");
        }

        private void releaseLeftFork() {
            System.out.println(name + " releases left fork");
        }

        private void releaseRightFork() {
            System.out.println(name + " releases right fork");
        }


}