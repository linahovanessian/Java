package lambda.javabrains.unit2;

import java.util.function.BiConsumer;

/**
 * @author linahovanessian on 6/19/18.
 */
public class ExceptionHandlerExample {


    public static void main(String[] args) {

        ExceptionHandlerExample main = new ExceptionHandlerExample();
        //no exception handling
        // BiConsumer<Integer, Integer> consumer = (a, b) -> System.out.println( a / b );

        //with exception hand.
        int v = 3;
        int k = 0;
        perform( v, k, wrapperLambda( (a, b) -> System.out.println( a / b ) ) );


    }

    private static void perform(int v, int k, BiConsumer<Integer, Integer> consumer) {
        consumer.accept( v, k );

    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (a, b) -> {
            try {
                consumer.accept( a, b );
            } catch (Exception e) {
                System.out.println( "Hello Exception" );
                e.printStackTrace();
            }
        };
    }
}
