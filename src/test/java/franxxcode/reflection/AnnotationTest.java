package franxxcode.reflection;

import franxxcode.reflection.data.Person;
import franxxcode.reflection.validation.Validator;
import org.junit.jupiter.api.Test;

public class AnnotationTest {
    @Test
    void validateUsingAnnotation() throws IllegalAccessException {

        var person = new Person("MM", "AM");
        Validator.validateNotBlank(person);
    }
}
