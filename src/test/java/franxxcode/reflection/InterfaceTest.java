package franxxcode.reflection;

import franxxcode.reflection.data.NameAble;
import franxxcode.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InterfaceTest {
    @Test
    void interfaceClass() {
        Class<NameAble> nameAbleClass = NameAble.class;

        System.out.println(nameAbleClass.isInterface());
        System.out.println(nameAbleClass.getSuperclass());
        System.out.println(nameAbleClass.getName());
        System.out.println(Arrays.toString(nameAbleClass.getInterfaces()));
        System.out.println(Arrays.toString(nameAbleClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(nameAbleClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(nameAbleClass.getFields()));
        System.out.println(nameAbleClass.getModifiers());
        System.out.println(nameAbleClass.getPackage());
        System.out.println(nameAbleClass.getSimpleName());

    }

    @Test
    void superInterface() {
        Class<Person> personClass = Person.class;
        System.out.println(Arrays.toString(personClass.getInterfaces()));
    }
}
