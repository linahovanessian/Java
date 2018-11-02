package hackerRank.algorithm.minmaxSum;

/**
 * @author linahovanessian on 10/30/18.
 */

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner( System.in );

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Integer[] ar = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ar[i] = new Integer( arr[i] );
        }
        BigInteger maxSum = BigInteger.valueOf( 0 );
        BigInteger minSum = BigInteger.valueOf( 0 );

        Arrays.sort( ar, Collections.reverseOrder() );//descending 5,4,3,2,1,0
        for (int i = 0; i < 4; i++) {
            maxSum = maxSum.add( BigInteger.valueOf( ar[i] ) );
        }

        for (int i = 4; i > 0; i--) {
            minSum = minSum.add( BigInteger.valueOf( ar[i] ) );
        }
        System.out.println( minSum + " " + maxSum );


    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split( " " );
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt( arrItems[i] );
            arr[i] = arrItem;
        }

        miniMaxSum( arr );

        scanner.close();
    }
}

