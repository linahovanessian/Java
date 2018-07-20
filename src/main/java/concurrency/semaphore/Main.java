package concurrency.semaphore;

/**
 * @author linahovanessian on 7/19/18.
 */
public class Main {


    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        Consumer consumer = new Consumer( queue );
        Producer producer = new Producer( queue );

        producer.start();
        consumer.start();

    }
}
