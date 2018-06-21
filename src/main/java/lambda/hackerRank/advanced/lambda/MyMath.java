package lambda.hackerRank.advanced.lambda;

/**
 * @author linahovanessian on 6/18/18.
 */
public class MyMath {
    public static boolean checker(PerformOperation f, int a) {
        return f.checker( a );
    }


    public PerformOperation isOdd() {
        return (num) -> num % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (num) -> {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (num) -> Integer.toString( num ).equals( new StringBuilder( Integer.toString( num ) ).reverse().toString() );
    }
}
