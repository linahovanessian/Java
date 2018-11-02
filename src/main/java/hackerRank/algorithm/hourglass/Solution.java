package hackerRank.algorithm.hourglass;

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
            /*
            1 1 1 0 0 0
            0 1 0 0 0 0
            1 1 1 0 0 0
            0 0 0 0 0 0
            0 0 0 0 0 0
            0 0 0 0 0 0
            */

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {

                int top = arr[i][x] + arr[i][x + 1] + arr[i][x + 2];
                int middle = arr[i + 1][x + 1];
                int bottom = arr[i + 2][x] + arr[i + 2][x + 1] + arr[i + 2][x + 2];
                if (top + middle + bottom > sum) {
                    sum = top + middle + bottom;
                }
            }
        }
        System.out.println( sum );

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( new File( "result.txt" ) ) );

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split( " " );
            scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt( arrRowItems[j] );
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum( arr );

        bufferedWriter.write( String.valueOf( result ) );
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

