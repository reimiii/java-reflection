package franxxcode.reflection;

import franxxcode.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConstructorTest {
    @Test
    void getConstructor() {
        Class<Person> personClass = Person.class;

        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();

        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor.getName());
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
            System.out.println("===========================");
        }
    }

    @Test
    void createObjectUsingConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor();
        Constructor<Person> constructorParam = personClass.getConstructor(String.class, String.class);

        Person person = constructor.newInstance();
        Person person1 = constructorParam.newInstance("HILMI", "AM");

        System.out.println(person1);
        System.out.println(person);


    }
}
