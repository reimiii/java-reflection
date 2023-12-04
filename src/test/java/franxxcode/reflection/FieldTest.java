package franxxcode.reflection;

import franxxcode.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {
    @Test
    void getFields() {
        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }

    @Test
    void getFieldValue() throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person hilmi = new Person("Hilmi", "AM");
        var person1 = firstName.get(hilmi);
        System.out.println(person1);

        Person ilmi = new Person("ilmi", "AM");
        var person2 = firstName.get(ilmi);
        System.out.println(person2);

    }

    @Test
    void setFieldValue() throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person hilmi = new Person("Hilmi", "AM");
        firstName.set(hilmi, "AMI");
        System.out.println(hilmi.getFirstName());

        Person ilmi = new Person("ilmi", "AM");
        firstName.set(ilmi, "MIII");
        System.out.println(ilmi.getFirstName());

    }
}
