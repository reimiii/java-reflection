package franxxcode.reflection.validation;


import franxxcode.reflection.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {
    public static void validateNotBlank(Object object) throws IllegalAccessException {

        // get class
        Class<?> objectClass = object.getClass();

        // get all field
        Field[] fields = objectClass.getDeclaredFields();

        // iterate each
        for (Field field : fields) {
            // get not blank
            field.setAccessible(true);
            NotBlank annotation = field.getAnnotation(NotBlank.class);

            // if exist
            if (annotation != null) {
                String value = (String) field.get(object);

                if (annotation.allowEmptyString()) {
                    // true
                    // ignore
                } else {
                    value = value.trim();
                }

                if ("".equals(value)) {
                    throw new RuntimeException(field.getName() + " must not blank");
                }

            }
        }


    }
}
