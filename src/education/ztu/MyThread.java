package education.ztu;

public class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Я люблю програмувати!!!");
        }
    }
}
