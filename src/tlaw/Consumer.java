package tlaw;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("ANSWERED QUESTION NO: " + queue.take());
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}
