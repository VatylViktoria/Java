package education.ztu;

public class MyRunnable implements Runnable {

    public void run() {
        for(int i = 0; i < 10000; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                break;
            }
            if(i % 10 == 0)
                System.out.println(i);
        }
        System.out.println("Розрахунок завершено!!!");
    }
}
