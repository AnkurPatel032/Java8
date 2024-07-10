package threads;

public class EvenOddPrinterUsingThread {

    private final int limit;
    private int number = 1;
    private final Object lock = new Object();

    public EvenOddPrinterUsingThread(int limit) {
        this.limit = limit;
    }

    public void printEven() {
        synchronized (lock) {
            while (number <= limit) {
                while (number % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Even: " + number);
                number++;
                lock.notifyAll();
            }
        }
    }

    public void printOdd() {
        synchronized (lock) {
            while (number <= limit) {
                while (number % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Odd: " + number);
                number++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {

        EvenOddPrinterUsingThread printer = new EvenOddPrinterUsingThread(10);

        Thread evenThread = new Thread(printer::printEven);
        Thread oddThread = new Thread(printer::printOdd);

        evenThread.start();
        oddThread.start();
    }
}
