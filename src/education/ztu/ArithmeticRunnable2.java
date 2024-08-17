package education.ztu;

public class ArithmeticRunnable2 implements Runnable {
    public static Integer result = 1;


    @Override
    public void run() {
        synchronized (this) {
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
}
