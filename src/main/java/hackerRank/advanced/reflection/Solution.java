package hackerRank.advanced.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author linahovanessian on 6/21/18.
 */
public class Solution {

    public static void main(String[] args) {
        Class student = null;
        try {
            student = Class.forName( Student.class.getName() );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Arrays.asList( student.getMethods() ).stream()
                .map( Method::getName )
                .sorted()
                .forEach( System.out::println );
    }

}
