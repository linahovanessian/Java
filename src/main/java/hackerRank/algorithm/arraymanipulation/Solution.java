package hackerRank.algorithm.arraymanipulation;

/**
 * @author linahovanessian on 10/31/18.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner( System.in );

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];

        int size = queries.length;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int k = queries[i][2];
            arr[start - 1] += k;
            if (end < n)
                arr[end] -= k;
        }

        long temp = 0;

        for (int i = 0; i < n; i++) {
            temp += arr[i];
            if (temp > max) max = temp;
        }

        System.out.println( max );

        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( new File( "result.txt" ) ) );

        String[] nm = scanner.nextLine().split( " " );

        int n = Integer.parseInt( nm[0] );

        int m = Integer.parseInt( nm[1] );

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split( " " );
            scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt( queriesRowItems[j] );
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation( n, queries );

        bufferedWriter.write( String.valueOf( result ) );
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

