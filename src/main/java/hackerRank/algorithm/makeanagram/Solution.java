package hackerRank.algorithm.makeanagram;

/**
 * @author linahovanessian on 11/1/18.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner( System.in );

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int[] frequency = new int[26];// number of lower cases
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        for (int i = 0; i < aChars.length; i++) {
            ++frequency[((int) aChars[i] - (int) 'a')];
        }
        for (int i = 0; i < bChars.length; i++) {
            --frequency[((int) bChars[i] - (int) 'a')];
        }

        int count = 0;
        for (int i = 0; i < frequency.length; i++) {
            count += Math.abs( frequency[i] );
        }

        System.out.println( count );
        return count;
    }


    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( new File( "result.txt" ) ) );

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram( a, b );

        bufferedWriter.write( String.valueOf( res ) );
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

