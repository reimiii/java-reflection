package franxxcode.reflection;

import franxxcode.reflection.data.Data;
import org.junit.jupiter.api.Test;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class TypeVariableTest {
    @Test
    void getTypeVar() {
        Class<Data> dataClass = Data.class;
        TypeVariable<Class<Data>>[] typeParameters = dataClass.getTypeParameters();

        for (TypeVariable<Class<Data>> typeParameter : typeParameters) {
            System.out.println(typeParameter.getName());
            System.out.println(Arrays.toString(typeParameter.getBounds()));
            System.out.println(typeParameter.getGenericDeclaration());
        }
    }
}
