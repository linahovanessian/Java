package concurrency.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author linahovanessian on 7/19/18.
 */
public class MyQueue {

    private int num;
    private Semaphore producerSemaphore = new Semaphore( 1 );
    private Semaphore consumerSemaphore = new Semaphore( 0 );


    public void getNum() {
        try {
            consumerSemaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( "Got " + num + "\n" );
        producerSemaphore.release();
    }

    public void setNum(int num) {
        try {
            producerSemaphore.acquire();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.num = num;
        System.out.println( "Put " + num );
        consumerSemaphore.release();


    }

}
