package lambda.javabrains.unit1;

import java.util.List;

/**
 * @author linahovanessian on 6/19/18.
 */
@FunctionalInterface
public interface Operation {

    void perform(List<Person> person);

}
