package concurrency.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author linahovanessian on 7/19/18.
 */
public class Main {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool( 2 );
        Future sumResult = executor.submit( new Sum( 2, 3, 4, 5 ) );
        Future subResult = executor.submit( new Sub( 2, 3, 4, 5 ) );
        Future multResult = executor.submit( new Mult( 2, 3, 4, 5 ) );

        System.out.println( "starting" );


        try {

            System.out.println( "sum result = " + sumResult.get() );
            System.out.println( "sub result = " + subResult.get() );
            System.out.println( "mult result = " + multResult.get() );


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
        System.out.println( "done !" );
    }


}

class Sum implements Callable {

    int[] nums;

    public Sum(int... nums) {
        this.nums = nums;
    }

    @Override
    public Object call() throws Exception {
        int result = 0;
        for (int i : nums)
            result += i;
        return result;
    }
}

class Sub implements Callable {

    int[] nums;

    public Sub(int... nums) {
        this.nums = nums;
    }

    @Override
    public Object call() throws Exception {
        int result = 0;
        for (int i : nums)
            result -= i;
        return result;
    }
}

class Mult implements Callable {

    int[] nums;

    public Mult(int... nums) {
        this.nums = nums;
    }

    @Override
    public Object call() throws Exception {
        int result = 1;
        for (int i : nums)
            result *= i;
        return result;
    }
}

