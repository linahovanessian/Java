package lambda.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author linahovanessian on 6/19/18.
 */
public class Main {

    //1.Sort list by last name
    //2.Prints all the elements in the list
    //3.Print all the people who have lastName starting with C

    static List<Person> personList = Arrays.asList(

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


    public Operation sort() {
        return (personList -> {
            Collections.sort( personList, (p1, p2) -> (p2.getLastName().compareTo( p1.getLastName() )) );
            for (Person person : personList) {
                System.out.println( person.toString() );
            }
        });

    }

    public Operation printAll() {
        return (personList -> {
            for (Person person : personList) {
                System.out.println( person.toString() );
            }
        });
    }

    public Operation filterLastName() {

        return (personList -> {
            for (Person person : personList) {
                if (person.getLastName().toLowerCase().startsWith( "c" ))
                    System.out.println( person.toString() );
            }
        });

    }


}
