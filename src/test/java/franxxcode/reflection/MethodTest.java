package franxxcode.reflection;

import franxxcode.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodTest {
    @Test
    void getMethod() {
        Class<Person> personClass = Person.class;
        Method[] declaredMethods = personClass.getDeclaredMethods();

        for (Method method : declaredMethods) {

            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println(Arrays.toString(method.getExceptionTypes()));

            System.out.println("-------------------------");

        }
    }

    @Test
    void getMethodValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        Method getFirstName = personClass.getDeclaredMethod("getFirstName");

        var person = new Person("Hilmi", "AM");
        String firstName = (String) getFirstName.invoke(person);
        System.out.println(firstName);
    }
}
