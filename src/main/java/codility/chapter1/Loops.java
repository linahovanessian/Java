package codility.chapter1;

/**
 * @author linahovanessian on 7/13/18.
 */
public class Loops {


    public static void main(String[] args) {
        printTriangle1( 4 );

    }

//            *
//            * *
//            * * *
//            * * * *

    private static void printTriangle1(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( "*" );
            }
            System.out.println( "" );
        }
    }


    private static void printTriangle2(int row) {

    }
}
