package concurrency.cyclicbarrier;

/**
 * @author linahovanessian on 7/19/18.
 */
public class BarrierAction implements Runnable {
    @Override
    public void run() {
        System.out.println( "Hello I am the barrier action class ! If you see this text , it means the Cyclic barriers" +
                " are reached" );
    }
}
