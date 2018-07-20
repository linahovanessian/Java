package concurrency.semaphore;

/**
 * @author linahovanessian on 7/19/18.
 */
public class Consumer extends Thread {

    MyQueue myQueue;


    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }


    @Override
    public void run() {
        while (true) myQueue.getNum();


    }
}
