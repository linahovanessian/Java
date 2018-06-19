package lambda;

/**
 * @author linahovanessian on 6/19/18.
 */

//Runnable Using Lambdas
public class RunnableLambda {

    public static void main(String[] args) {
        Thread myThread = new Thread( () -> System.out.println( "my lambda runnable" ) );

        myThread.start();
    }
}
