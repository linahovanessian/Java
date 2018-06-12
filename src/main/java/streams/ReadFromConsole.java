package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author linahovanessian on 6/12/18.
 */
public class ReadFromConsole {

    public static void main(String[] args) {

        readChar();
        readStr();
    }

    private static void readStr() {


    }

    private static void readChar() {
        BufferedReader bis = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( System.out ) );

        char c;

        System.out.println( "Enter \'q\' to quit. " );
        try {
            do {
                int input = bis.read();
                c = (char) input;
                bufferedWriter.write( c );
                bufferedWriter.flush();

            } while (c != 'q');

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
