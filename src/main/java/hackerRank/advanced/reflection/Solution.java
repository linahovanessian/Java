package hackerRank.advanced.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author linahovanessian on 6/21/18.
 */
public class Solution {

    public static void main(String[] args) {
        Class student = Student.class;
        Arrays.asList( student.getDeclaredMethods() ).stream()
                .map( Method::getName )
                .sorted()
                .forEach( System.out::println );
    }

}
