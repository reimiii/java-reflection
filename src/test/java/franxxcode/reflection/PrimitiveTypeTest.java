package franxxcode.reflection;

import franxxcode.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitiveTypeTest {
    @Test
    void primitive() {
        Class<Integer> integerClass = int.class;
        Class<Long> longClass = long.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;

        System.out.println(integerClass.isPrimitive());
        System.out.println(longClass.isPrimitive());
        System.out.println(characterClass.isPrimitive());
        System.out.println(booleanClass.isPrimitive());
    }

    @Test
    void getFields() throws NoSuchFieldException {
        Class<Person> personClass = Person.class;

        Field age = personClass.getDeclaredField("age");

        System.out.println(age.getType().isPrimitive());
    }

    @Test
    void getFieldsValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        Field age = personClass.getDeclaredField("age");

        System.out.println(age.getType().isPrimitive());


        age.setAccessible(true);

        var person = new Person("MM", "MIAAAA");

        person.setAge(20);
        System.out.println(age.getInt(person));
    }


    @Test
    void invokeMethod() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Person> personClass = Person.class;

        Method setAge = personClass.getDeclaredMethod("setAge", int.class);

        var person = new Person();
        setAge.invoke(person, 20);

        System.out.println(person);
    }
}
