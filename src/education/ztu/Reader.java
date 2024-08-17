package education.ztu;

import java.util.Scanner;

class Reader implements Runnable{

    Store store;
    Reader(Store store){
        this.store=store;
    }
    public void run(){
        while (true) {
            store.read();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {  }
        }
    }
}
