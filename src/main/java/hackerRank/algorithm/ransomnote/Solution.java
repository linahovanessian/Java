package hackerRank.algorithm.ransomnote;

/**
 * @author linahovanessian on 11/1/18.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner( System.in );
    static Map<String, Integer> frequencyMap = new HashMap<>();

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        for (String key : magazine) {
            frequencyMap.computeIfPresent( key, (k, v) -> v + 1 );
            frequencyMap.computeIfAbsent( key, (k) -> 1 );
        }
        boolean flag = true;
        for (String n : note) {
            if (!frequencyMap.containsKey( n )) {
                flag = false;
                break;
            } else {
                frequencyMap.computeIfPresent( n, (k, v) -> {
                    v = v - 1;
                    if (v == 0) {
                        frequencyMap.remove( n );
                    }
                    return v;
                } );


            }


        }
        System.out.println( flag ? "Yes" : "No" );

    }

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split( " " );

        int m = Integer.parseInt( mn[0] );

        int n = Integer.parseInt( mn[1] );

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split( " " );
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split( " " );
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine( magazine, note );

        scanner.close();
    }
}

