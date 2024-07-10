package threads;

public class ProducerConsumer {
    private final int limit;
    private int number = 1;
    private final Object lock = new Object();

    public ProducerConsumer(int limit) {
        this.limit = limit;
    }

    class printEven implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                while (number < limit) {
                    if (number % 2 != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("Even:" + number);
                    number++;
                    lock.notifyAll();
                }
            }

        }
    }

    class printOdd implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                while (number < limit) {
                    if (number % 2 == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("OddNumber:" + number);
                    number++;
                    lock.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {

        ProducerConsumer evenOdd = new ProducerConsumer(10);
        Thread evenThread = new Thread(evenOdd.new printEven());
        Thread oddThread = new Thread(evenOdd.new printOdd());

        evenThread.start();
        oddThread.start();


    }
}
