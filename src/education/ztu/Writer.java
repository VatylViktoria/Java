package education.ztu;

class Writer implements Runnable{

    Store store;
    Writer(Store store){
        this.store=store;
    }
    public void run(){
        while (true){
            store.print();
        }
    }
}