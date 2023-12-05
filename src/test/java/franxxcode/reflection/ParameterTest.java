package franxxcode.reflection;

import franxxcode.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {
    @Test
    void getParam() {
        Class<Person> personClass = Person.class;
        Method[] declaredMethods = personClass.getDeclaredMethods();

        for (Method method : declaredMethods) {
            System.out.println(method.getName());

            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Param name: " + parameter.getName());
                System.out.println("Param type: " + parameter.getType());
            }
            System.out.println("========================================");
        }
    }

    @Test
    void invokeMethodWithParam() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

        Person person = new Person("HILMI", "AM");
        setFirstName.invoke(person, "AMI");

        System.out.println(person.getFirstName());
    }
}
