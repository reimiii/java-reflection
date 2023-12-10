package franxxcode.reflection;

import franxxcode.reflection.data.Products;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;

public class RecordTest {
    @Test
    void classRecord() {
        Class<Products> productsClass = Products.class;

        System.out.println(productsClass.isRecord());
        System.out.println(Arrays.toString(productsClass.getDeclaredFields()));
        System.out.println(Arrays.toString(productsClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(productsClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(productsClass.getRecordComponents()));
    }

    @Test
    void getRecordValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Products> productsClass = Products.class;

        Method id = productsClass.getDeclaredMethod("id");
        Products products = new Products("1", "AKAME", 2000L);

        System.out.println(id.invoke(products));
    }

    @Test
    void byComponent() throws InvocationTargetException, IllegalAccessException {
        Class<Products> productsClass = Products.class;
        RecordComponent[] recordComponents = productsClass.getRecordComponents();
        Products products = new Products("1", "AKAME", 2000L);

        for (RecordComponent recordComponent : recordComponents) {
            Method accessor = recordComponent.getAccessor();
            System.out.println(accessor.getName());
            System.out.println(accessor.invoke(products));
        }
    }
}
