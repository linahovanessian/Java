package hackerRank.palindrome;

/**
 * @author linahovanessian on 6/21/18.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        if (isPalindrome( A ))
            System.out.println( "Yes" );
        else
            System.out.println( "No" );


    }

    private static boolean isPalindrome(String str) {

        if (str.length() <= 1)
            return true;
        else if (str.charAt( 0 ) == str.charAt( str.length() - 1 )) {
            return isPalindrome( str.substring( 1, str.length() - 1 ) );
        }

        return false;


    }
}
