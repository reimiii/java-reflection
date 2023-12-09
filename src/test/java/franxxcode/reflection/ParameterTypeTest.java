package franxxcode.reflection;

import franxxcode.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class ParameterTypeTest {
    @Test
    void fieldGeneric() throws NoSuchMethodException, NoSuchFieldException {

        Class<Person> personClass = Person.class;

        Field hobbies = personClass.getDeclaredField("hobbies");
        hobbies.setAccessible(true);

        Type genericReturnType = hobbies.getGenericType();

        System.out.println(genericReturnType.getClass());

        if (genericReturnType instanceof ParameterizedType) {
            ParameterizedType returnType = (ParameterizedType) genericReturnType;

            System.out.println(returnType.getOwnerType());
            System.out.println(returnType.getRawType());
            System.out.println(Arrays.toString(returnType.getActualTypeArguments()));
        }

    }

    @Test
    void getMethodGeneric() throws NoSuchMethodException {
        Class<Person> personClass = Person.class;

        Method getHobbies = personClass.getDeclaredMethod("getHobbies");

        Type genericReturnType = getHobbies.getGenericReturnType();

        System.out.println(genericReturnType.getClass());

        if (genericReturnType instanceof ParameterizedType) {
            ParameterizedType returnType = (ParameterizedType) genericReturnType;

            System.out.println(returnType.getOwnerType());
            System.out.println(returnType.getRawType());
            System.out.println(Arrays.toString(returnType.getActualTypeArguments()));
        }
    }

    @Test
    void getMethodParameterGeneric() throws NoSuchMethodException {
        Class<Person> personClass = Person.class;

        Method getHobbies = personClass.getDeclaredMethod("setHobbies", List.class);

        Type[] genericReturnType = getHobbies.getGenericParameterTypes();

        for (Type type : genericReturnType) {

            System.out.println(type.getClass());

            if (type instanceof ParameterizedType) {
                ParameterizedType returnType = (ParameterizedType) type;

                System.out.println(returnType.getOwnerType());
                System.out.println(returnType.getRawType());
                System.out.println(Arrays.toString(returnType.getActualTypeArguments()));
            }
        }

    }
}
