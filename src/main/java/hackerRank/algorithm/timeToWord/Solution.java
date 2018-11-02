package hackerRank.algorithm.timeToWord;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner( System.in );
    static Map<Integer, String> timeToString = new HashMap<>();
    static Map<Integer, String> decimalToString = new HashMap<>();

    static {
        timeToString.put( 1, "one" );
        timeToString.put( 2, "two" );
        timeToString.put( 3, "three" );
        timeToString.put( 4, "four" );
        timeToString.put( 5, "five" );
        timeToString.put( 6, "six" );
        timeToString.put( 7, "seven" );
        timeToString.put( 8, "eight" );
        timeToString.put( 9, "nine" );
        timeToString.put( 10, "ten" );
        timeToString.put( 11, "eleven" );
        timeToString.put( 12, "twelve" );
        timeToString.put( 13, "thirteen" );
        timeToString.put( 14, "fourteen" );
        timeToString.put( 15, "fifteen" );
        timeToString.put( 16, "sixteen" );
        timeToString.put( 17, "seventeen" );
        timeToString.put( 18, "eighteen" );
        timeToString.put( 19, "nineteen" );

        decimalToString.put( 2, "twenty" );
        decimalToString.put( 3, "thirty" );
        decimalToString.put( 4, "forty" );
        decimalToString.put( 5, "fifty" );
        decimalToString.put( 6, "sixty" );

    }


    private static String convertToWord(int num) {
        if (num < 20)
            return timeToString.get( num );
        else {
            return decimalToString.get( num / 10 ) + " " + timeToString.get( num % 10 );
        }
    }

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {

        if (m == 0)
            return convertToWord( h ) + " o' clock";
        else if (m <= 30) {
            if (m == 30)
                return "half past " + convertToWord( h );
            else if (m == 15)
                return "quarter past " + convertToWord( h );

            else {
                String plural = m < 2 ? "" : "s";
                return convertToWord( m ) + " minute" + plural + " past " + convertToWord( h );
            }
        } else {
            int hour = h+1 > 12 ? ((h+1) / 12) : h+1;
            if (m == 45) {
                return "quarter to " + convertToWord( hour );
            } else {
                String plural = (m == 59) ? "" : "s";

                return convertToWord( (60 - m) ) + " minute" + plural + " to " + convertToWord( hour );
            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( new File( "result.txt" ) ) );

        int h = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        int m = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        String result = timeInWords( h, m );

        System.out.println( result );

        bufferedWriter.write( result );
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
