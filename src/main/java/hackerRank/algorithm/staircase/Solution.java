package hackerRank.algorithm.staircase;

/**
 * @author linahovanessian on 10/31/18.
 */

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner( System.in );

    // Complete the staircase function below.
    static void staircase(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print( " " );
            }
            for (int k = 1; k <= i; k++)
                System.out.print( "*" );

            System.out.println();
        }


    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        staircase( n );

        scanner.close();
    }
}

