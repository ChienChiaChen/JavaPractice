package tw.se.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Client3 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("tw.se.annotation.Student");
            Annotation[] annotations = clazz.getAnnotations();
            // Type
            printAllAnnotations(annotations);
            printTableValue(clazz);

            // Field
            printAllFields(clazz.getDeclaredFields());
            printDeclaredFidle(clazz, "name");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printAllAnnotations(Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

    }

    private static void printAllFields(Field[] fields) {
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    private static void printTableValue(Class clazz) {
        Table table = (Table) clazz.getAnnotation(Table.class);
        System.out.println(table.value());
    }

    private static void printDeclaredFidle(Class clazz, String fieldName) throws Exception {

        Field field = clazz.getDeclaredField(fieldName);
        tw.se.annotation.Field f= field.getAnnotation(tw.se.annotation.Field.class);
        System.out.println(f);
    }
}
