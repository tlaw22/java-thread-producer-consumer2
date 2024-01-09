package tlaw;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    int questionNO;
    BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {

            try {
                synchronized (this) {
                    int nextQuestionNO = questionNO++;
                    System.out.println("Got next question no: " + nextQuestionNO);
                    queue.put(nextQ());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized int nextQ() {
        int nextQuestionNO = questionNO++;
        System.out.println("Got next question no: " + nextQuestionNO);
        return nextQuestionNO;
    }

}
