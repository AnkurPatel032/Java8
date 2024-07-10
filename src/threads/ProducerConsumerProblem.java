package threads;

import java.util.LinkedList;
import java.util.Queue;

/*
Implement a producer-consumer scenario using threads in Java
where the producer generates data and the consumer processes it.
Use a shared buffer with a fixed size.
*/
public class ProducerConsumerProblem {

    private static final int BUFFER_SIZE = 5;
    private final Queue<Integer> buffer = new LinkedList<>();
    private final Object lock = new Object();

    class Producer implements Runnable {
        @Override
        public void run() {
            int value = 0;
            while (true) {
                synchronized (lock)
                {
                    while (buffer.size() == BUFFER_SIZE) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    buffer.add(value);
                    System.out.println("Produced: " + value);
                    value++;
                    lock.notifyAll();
                }
            }
        }
    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (buffer.isEmpty()) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    int value = buffer.poll();
                    System.out.println("Consumed: " + value);
                    lock.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {

        ProducerConsumerProblem pc = new ProducerConsumerProblem();
        Thread producerThread = new Thread(pc.new Producer());
        Thread consumerThread = new Thread(pc.new Consumer());

        producerThread.start();
        consumerThread.start();
    }
}
