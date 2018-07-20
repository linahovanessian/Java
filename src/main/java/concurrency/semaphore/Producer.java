package concurrency.semaphore;

/**
 * @author linahovanessian on 7/19/18.
 */
public class Producer extends Thread {


    private MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }


    @Override
    public void run() {
        int c = 0;
        while (c < 100) {
            int num = ((int) (Math.random() * 10));
            myQueue.setNum( num );
        }


    }
}
