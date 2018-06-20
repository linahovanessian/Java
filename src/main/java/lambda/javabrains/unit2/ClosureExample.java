package lambda.javabrains.unit2;

/**
 * @author linahovanessian on 6/20/18.
 */
public class ClosureExample {

    public static void main(String[] args) {

        int b = 20;//effectively final ! can not be changed.

        doProcess( 2, (a) -> System.out.println( a + b ) );


    }

    public static void doProcess(int i, Process process) {
        process.process( i );
    }

}


interface Process {

    void process(int i);
}
