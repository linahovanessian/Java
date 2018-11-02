package hackerRank.algorithm.minimumloss;

/**
 * @author linahovanessian on 10/29/18.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner( System.in );

    // Complete the minimumLoss function below.
    static int minimumLossMap(long[] price) {
        Map<Long, Integer> indexMap = new HashMap();
        for (int i = 0; i < price.length; i++) {
            indexMap.put( price[i], i );
        }
        long min = Long.MAX_VALUE;
        Arrays.sort( price );

        for (int i = 0; i < price.length - 1; i++) {

            if (price[i + 1] - price[i] < min) {
                if (indexMap.get( price[i + 1] ) < indexMap.get( price[i] )) {
                    min = price[i + 1] - price[i];
                }
            }
        }
        return (int) min;
    }


    static int minimumLoss(long[] price) {
        long min = Long.MAX_VALUE;

        Map<Long, Integer> indexMap = new HashMap();
        for (int i = 0; i < price.length; i++) {
            indexMap.put( price[i], i );
        }

        Arrays.sort( price );
        for (int i = 0; i < price.length - 1; i++) {

            long diff = (price[i + 1] - price[i]);

            if (diff > 0) {

                if (min != 0 && diff < min && indexMap.get( price[i + 1] ) < indexMap.get( price[i] )) {//
                    min = diff;
                }

            }
        }
        if (min == Long.MAX_VALUE)
            return 0;
        else
            return (int) min;
    }


    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( new File( "result.txt" ) ) );

        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        long[] price = new long[n];

        String[] priceItems = scanner.nextLine().split( " " );
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        for (int i = 0; i < n; i++) {
            long priceItem = Long.parseLong( priceItems[i] );
            price[i] = priceItem;
        }

        int result = minimumLoss( price );
        System.out.println( result );

        bufferedWriter.write( String.valueOf( result ) );
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
