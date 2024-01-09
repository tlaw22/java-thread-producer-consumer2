package tlaw;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {
    public static void main(String[] args) throws Exception {
        
        BlockingQueue queue = new ArrayBlockingQueue(5);
        Thread t1 = new Thread(new Producer(queue));
        Thread t2 = new Thread(new Consumer(queue));
        t1.start();
        t2.start();



    }
}
