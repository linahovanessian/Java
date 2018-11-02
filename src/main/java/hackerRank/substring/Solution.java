package hackerRank.substring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author linahovanessian on 10/31/18.
 */
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> sub = new ArrayList<>();

        for (int i = 0; i < s.length() - k + 1; i++) {
            sub.add( s.substring( i, i + k ) );
        }
        Collections.sort( sub );
        smallest = sub.get( 0 );
        largest = sub.get( sub.size() - 1 );


        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println( getSmallestAndLargest( s, k ) );
    }
}
