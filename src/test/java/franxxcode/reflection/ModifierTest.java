package franxxcode.reflection;

import franxxcode.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

public class ModifierTest {
    @Test
    void modifier() {

        Class<Person> personClass = Person.class;

        System.out.println(Modifier.isPublic(personClass.getModifiers()));
        System.out.println(Modifier.isPrivate(personClass.getModifiers()));
        // and so on
    }
}
