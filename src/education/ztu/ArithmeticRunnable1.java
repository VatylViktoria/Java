package education.ztu;

public class ArithmeticRunnable1 implements Runnable {
    public static Integer result = 1;


    @Override
    public synchronized void run() {
        for(int i = 1; i <= 100; i++){
            System.out.printf("%s(%s) ", result, Thread.currentThread().getName());
            result++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
