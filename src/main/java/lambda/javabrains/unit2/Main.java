package lambda.javabrains.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author linahovanessian on 6/19/18.
 */
public class Main {

    //1.Sort and Print list by last name
    //2.Print all the people who have lastName starting with C
    //3.Prints all the elements in the list

    private static List<Person> personList = Arrays.asList(

            new Person( "zina", "Hovanessian", 31 ),
            new Person( "Abi", "msksk", 14 ),
            new Person( "hfuhuf", "gfhk", 88 ),
            new Person( "bhcbhc", "cc", 45 )
    );

    public static void main(String[] args) {

        System.out.println( "----------Step 1---------" );
        Collections.sort( personList, (p1, p2) -> (p2.getLastName().compareTo( p1.getLastName() )) );
        printConditionally( personList, p -> true, p -> System.out.println( p.toString() ) );


        System.out.println( "----------Step 2---------" );
        printConditionally( personList, person -> person.getLastName().toLowerCase().startsWith( "c" ), p -> System
                .out.println( p.toString() ) );

        System.out.println( "----------Step 3---------" );
        printConditionally( personList, p -> true, p -> System.out.println( p.getLastName() ) );

    }


    private static void printConditionally(List<Person> personList, Predicate<Person> predicate, Consumer<Person>
            consumer) {
        personList.forEach( person -> {
            if (predicate.test( person ))
                consumer.accept( person );
        } );
    }


}
