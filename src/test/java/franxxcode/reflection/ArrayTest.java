package franxxcode.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    @Test
    void array() {
        Class<String[]> aClass = String[].class;
        Class<int[][]> aClass1 = int[][].class;

        System.out.println(aClass.isArray());
        System.out.println(aClass1.isArray());
    }

    @Test
    void arrayMember() {
        Class<String[]> aClass = String[].class;

        System.out.println(Arrays.toString(aClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(aClass.getDeclaredFields()));
        System.out.println(Arrays.toString(aClass.getDeclaredConstructors()));
        System.out.println(aClass.getComponentType());
    }

    @Test
    void arrayManipulation() {
        Class<String[]> StringArrayClass = String[].class;

        String[] array = (String[]) Array.newInstance(StringArrayClass.getComponentType(), 10);

        System.out.println(Arrays.toString(array));
        Array.set(array, 0, "Hilmi");
        Array.set(array, 1, "Akbar");
        Array.set(array, 2, "Muharrom");

        System.out.println(Arrays.toString(array));

        System.out.println(Array.get(array, 0));
        System.out.println(Array.get(array, 1));
        System.out.println(Array.get(array, 2));
    }
}
