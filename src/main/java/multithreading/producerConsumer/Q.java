package multithreading.producerConsumer;

/**
 * @author linahovanessian on 6/7/18.
 */
public class Q {

    private int n;
    private boolean isValueSet = false;


    synchronized void put(int n) {
        while (isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isValueSet = true;
        this.n = n;
        System.out.println( String.format( "-------------\nPUT %d", n ) );
        notify();
    }

    synchronized int get() {
        while (!isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        isValueSet = false;
        System.out.println( String.format( "GOT %d \n-------------", n ) );
        notify();
        return n;
    }
}
