package threads;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread Class");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread running using Runnable");
    }
}

public class MyFirstThreadUsingThreadClassExample {
    public static void main(String[] args) {
        System.out.println("*******************************");
        MyThread myThread1=new MyThread();
        myThread1.start();

        Thread myThread2=new Thread(new MyRunnable());
        myThread2.start();

    }
}
