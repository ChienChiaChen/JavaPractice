package tw.reflection.p2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings("all")
public class Client {
    public static void main(String[] args) {
        String path = "tw.reflection.p2.User";


        try {

            Class<?> clazz = Class.forName(path);
            System.out.println(clazz.getName());

//            Field[] fields = clazz.getFields(); Get public
//            System.out.println(fields.length);

//            get private public protect
            Field[] fields1 = clazz.getDeclaredFields();
            System.out.println(fields1.length);

//            Field field = clazz.getDeclaredField("age");
//            System.out.println(field);

            for (Field temp : fields1) {
                System.out.println("Attribute: "+temp);
            }




//            =============

            Method[] methods = clazz.getDeclaredMethods();
            System.out.println(methods.length);

            Method method = clazz.getDeclaredMethod("getName", null);
            Method method1 = clazz.getDeclaredMethod("setName", String.class);

            for (Method m : methods) {
                System.out.println("MMMethod: "+ m);
            }


            Constructor[] constructors = clazz.getDeclaredConstructors();
            System.out.println(constructors.length);

            for (Constructor c : constructors) {
                System.out.println("CCContructor: "+c);
            }

            System.out.println();
            Constructor constructor1 = clazz.getConstructor(null);
            System.out.println(constructor1);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }


    }
}
