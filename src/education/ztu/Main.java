package education.ztu;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args)  {
        // Task 2
        MyThread myThread = new MyThread("Thread1");
        System.out.println(myThread.getState());
        myThread.start();
        System.out.printf("Name: %s%nPriority: %s%nisAlive: %s%nisDaemon: %s%n", myThread.getName(), myThread.getPriority(), myThread.isAlive(), myThread.isDaemon());
        myThread.setName("Thread2");
        myThread.setPriority(10);
        System.out.println(myThread.getState());
        System.out.printf("Name: %s%nPriority: %s%nisAlive: %s%nisDaemon: %s%n", myThread.getName(), myThread.getPriority(), myThread.isAlive(), myThread.isDaemon());

        try {
            myThread.join();
            System.out.println(myThread.getState());
        }
        catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        System.out.printf("Name: %s%nPriority: %s%nisAlive: %s%nisDaemon: %s%n", myThread.getName(), myThread.getPriority(), myThread.isAlive(), myThread.isDaemon());

        // Task 3
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable, "Runnable1");
        Thread thread2 = new Thread(runnable, "Runnable2");
        Thread thread3 = new Thread(runnable, "Runnable3");
        thread1.start();
        thread2.start();
        thread3.start();
        try{
            Thread.sleep(2000);
            thread1.interrupt();
            thread2.interrupt();
            thread3.interrupt();
        }
        catch (InterruptedException ex){
            System.out.println("Thread was interrupted.");
        }

        // Task 4
        ArithmeticRunnable1 arithmeticRunnable1 = new ArithmeticRunnable1();
        Thread t11 = new Thread(arithmeticRunnable1, "ArithmeticRunnable11");
        Thread t21 = new Thread(arithmeticRunnable1, "ArithmeticRunnable21");
        Thread t31 = new Thread(arithmeticRunnable1, "ArithmeticRunnable31");
        t11.start();
        t21.start();
        t31.start();
        try {
            t11.join();
            t21.join();
            t31.join();
        } catch (InterruptedException ignored) {
        }

        // Task 5
        System.out.println();
        ArithmeticRunnable2 arithmeticRunnable2 = new ArithmeticRunnable2();
        Thread t12 = new Thread(arithmeticRunnable2, "ArithmeticRunnable12");
        Thread t22 = new Thread(arithmeticRunnable2, "ArithmeticRunnable22");
        Thread t32 = new Thread(arithmeticRunnable2, "ArithmeticRunnable32");
        t12.start();
        t22.start();
        t32.start();
        try {
            t12.join();
            t22.join();
            t32.join();
        } catch (InterruptedException ignored) {
        }

        // Task 6
        Store store = new Store();
        Reader reader = new Reader(store);
        Writer printer= new Writer(store);
        new Thread(reader).start();
        new Thread(printer).start();

        // Task 7
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                Long start = System.currentTimeMillis();
                int[] arr = new int[1000000];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt();
                }
                int sum = 0;
                for (int value : arr) {
                    sum += value;
                }
                Long end = System.currentTimeMillis();
                System.out.println(end - start + " ms");
            }
        };
        new Thread(runnable2).start();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(runnable2);

    }
}

class Store{
    private String text = null;
    public synchronized void print() {
        if (text == null) {
            try {
                wait();
            }
            catch (InterruptedException ignored) {}
        }
        System.out.println("Output: " + text);
        text = null;
        notify();
    }
    public synchronized void read() {
        if (text != null) {
            try {
                wait();
            }
            catch (InterruptedException ignored) {}
        }
        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        notify();
    }
}
