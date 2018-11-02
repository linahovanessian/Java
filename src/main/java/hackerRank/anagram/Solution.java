package hackerRank.anagram;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author linahovanessian on 10/31/18.
 */
public class Solution {


    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int size = aChars.length;
        Arrays.sort( aChars );
        Arrays.sort( bChars );

        for (int i = 0; i < size; i++) {
            if (aChars[i] != bChars[i]) {
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        String a = scanner.next();
        String b = scanner.next();

        System.out.println( isAnagram( a, b ) ? "Anagrams" : "Not Anagrams" );

    }
}
