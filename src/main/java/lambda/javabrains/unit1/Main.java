package lambda.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author linahovanessian on 6/19/18.
 */
public class Main {

    //1.Sort list by last name
    //2.Prints all the elements in the list
    //3.Print all the people who have lastName starting with C

    private static List<Person> personList = Arrays.asList(

            new Person( "zina", "Hovanessian", 31 ),
            new Person( "Abi", "msksk", 14 ),
            new Person( "hfuhuf", "gfhk", 88 ),
            new Person( "bhcbhc", "cc", 45 )
    );

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println( "----------Step 1---------" );
        Operation op = main.sort();
        op.perform( personList );

        System.out.println( "-----------------------------" );

        System.out.println( "----------Step 2---------" );
        op = main.printAll();
        op.perform( personList );
        System.out.println( "-----------------------------" );

        System.out.println( "----------Step 3---------" );
        op = main.filterLastName();
        op.perform( personList );
        System.out.println( "-----------------------------" );

    }


    private Operation sort() {
        return (personList -> {
            Collections.sort( personList, (p1, p2) -> (p2.getLastName().compareTo( p1.getLastName() )) );
            printConditionally( personList, p -> true );
        });

    }

    private Operation printAll() {
        return personList -> printConditionally( personList, p -> true );

    }

    private Operation filterLastName() {
        return personList -> printConditionally( personList, person -> person.getLastName().toLowerCase().startsWith( "c" ) );
    }

    private void printConditionally(List<Person> personList, Predicate<Person> predicate) {
        personList.forEach( person -> {
            if (predicate.test( person ))
                System.out.println( person.toString() );
        } );
    }


}
