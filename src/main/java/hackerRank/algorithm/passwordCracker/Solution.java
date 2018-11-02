package hackerRank.algorithm.passwordCracker;

/**
 * @author linahovanessian on 10/29/18.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    static LinkedList<String> tokens = new LinkedList();
    static String result = "";
    static boolean[] visited = null;


    static String passwordCracker(String[] pass, String attempt) {
        visited = new boolean[pass.length];
        if (attempt.isEmpty()) {
            result = "";
            for (String token : tokens) {
                result += token;
            }
            tokens.clear();
            return result;
        } else {
            boolean found = false;
            for (int i = 0; i < pass.length; i++) {
                visited[i] = true;
                if (attempt.startsWith( pass[i] )) {
                    found = true;
                    attempt = attempt.substring( pass[i].length(), attempt.length() );
                    tokens.add( pass[i] );
                }
            }

            boolean allvisited = true;
            for (int i = 0; i < visited.length; i++) {
                allvisited = visited[i];
            }
            if (allvisited && !found) {
                tokens.clear();
                return "WRONG PASSWORD";
            } else
                return passwordCracker( pass, attempt );

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int t = in.nextInt();
        System.out.println();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            String[] pass = new String[n];
            for (int pass_i = 0; pass_i < n; pass_i++) {
                pass[pass_i] = in.next();
            }
            String attempt = in.next();
            System.out.println( passwordCracker( pass, attempt ) );

        }
        in.close();
    }
}


