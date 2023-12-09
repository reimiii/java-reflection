package franxxcode.reflection;

import franxxcode.reflection.data.Gender;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EnumTest {
    @Test
    void enumTest() {
        Class<Gender> genderClass = Gender.class;

        System.out.println(genderClass.getName());
        System.out.println(Arrays.toString(genderClass.getEnumConstants()));
        System.out.println(genderClass.isEnum());
        System.out.println(genderClass.getSuperclass());
    }
}
