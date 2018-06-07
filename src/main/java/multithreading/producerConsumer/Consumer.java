package multithreading.producerConsumer;

/**
 * @author linahovanessian on 6/7/18.
 */
public class Consumer implements Runnable {
    private Q queue;
    private Thread thread;


    public Consumer(Q queue) {
        this.queue = queue;
        thread = new Thread( this, "Consumer Thread" );
    }

    @Override
    public void run() {
        while (true) {
            queue.get();
        }

    }

    public void start() {
        thread.start();
    }
}
