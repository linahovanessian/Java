package lambda.javabrains.unit1;

/**
 * @author linahovanessian on 6/19/18.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {

        return firstName + " " + lastName + " " + age;
    }


}
