package multithreading.producerConsumer;

/**
 * @author linahovanessian on 6/7/18.
 */
public class Producer implements Runnable {
    private Thread thread;
    private Q queue;

    public Producer(Q queue) {
        this.queue = queue;
        thread = new Thread( this, "Producer Thread" );
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            queue.put( i++ );
        }

    }

    public void start() {
        thread.start();
    }
}
