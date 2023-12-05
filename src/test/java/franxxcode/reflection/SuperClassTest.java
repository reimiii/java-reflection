package franxxcode.reflection;

import franxxcode.reflection.data.Person;
import org.junit.jupiter.api.Test;

public class SuperClassTest {
    @Test
    void superClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        Class<? super Person> superclass = personClass.getSuperclass();
        System.out.println(superclass);

        Class<? super Person> superclass1 = superclass.getSuperclass();
        System.out.println(superclass1);
    }
}
