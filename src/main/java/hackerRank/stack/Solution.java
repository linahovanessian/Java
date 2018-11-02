package hackerRank.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author linahovanessian on 10/30/18.
 */
class Solution {
    static boolean flag = false;
    static int B = 0;
    static int H = 0;
    static Scanner sc;
    static Stack stack = new Stack();

    static {

        sc = new Scanner( System.in );
        B = sc.nextInt();
        H = sc.nextInt();
        if (B > 0 && H > 0)
            flag = true;
        else
            try {
                throw new Exception( "Breadth and height must be positive" );
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static void main(String[] argh) {


        Scanner sc = new Scanner( System.in );

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            boolean b = isBalanced( input );
            System.out.println( input + "--> " + b );
        }

    }

    public static boolean isBalanced(String input) {
        stack.clear();
        boolean isBalanced = true;
        if (!input.isEmpty()) {
            char[] tokens = input.toCharArray();


            for (int i = 0; i < tokens.length; i++) {
                char token = tokens[i];
                if ('[' == (token) || '{' == (token) || '(' == (token)) {
                    stack.push( token );
                } else {
                    if (stack.empty()) {
                        isBalanced = false;
                        break;
                    } else {
                        char topChar = (char) stack.pop();
                        if (topChar == '{' && token == '}')
                            isBalanced = true;
                        else if (topChar == '[' && token == ']')
                            isBalanced = true;
                        else if (topChar == '(' && token == ')')
                            isBalanced = true;
                        else {
                            isBalanced = false;
                            break;
                        }
                    }

                }


            }
            if (!stack.empty())
                isBalanced = false;


            return isBalanced;
        } else return true;

    }
}

