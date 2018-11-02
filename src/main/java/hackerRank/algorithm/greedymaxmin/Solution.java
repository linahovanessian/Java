package hackerRank.algorithm.greedymaxmin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author linahovanessian on 11/2/18.
 */
public class Solution {
    private static final Scanner scanner = new Scanner( System.in );

    static int maxMin(int k, int[] arr) {

        Arrays.sort( arr );
        int min = arr[arr.length - 1];
        int num = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            num = arr[i + k - 1] - arr[i];
            if (num <= min) {
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( new File( "result.txt" ) ) );

        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        int k = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );
            arr[i] = arrItem;
        }

        int result = maxMin( k, arr );
        System.out.println( result );
        bufferedWriter.write( String.valueOf( result ) );
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
