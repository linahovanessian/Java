package multithreading.producerConsumer;

/**
 * @author linahovanessian on 6/7/18.
 */
public class Main {


    public static void main(String[] args) {

        Q queue = new Q();

        Consumer consumer = new Consumer( queue );
        Producer producer = new Producer( queue );

        consumer.start();
        producer.start();


    }
}
