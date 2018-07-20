package concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author linahovanessian on 7/19/18.
 */
public class Main {

    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier( 4, new BarrierAction() );

        for (int i = 0; i < barrier.getParties(); i++) {
            new MyThread( barrier ).start();
        }

    }
}
