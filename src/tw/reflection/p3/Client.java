package tw.reflection.p3;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
//https://www.youtube.com/watch?v=S_Adwt6BQ-8&index=5&list=PLC664nq_h8b9Jzh-qYJ_AeOpmSoBLC_tg
@SuppressWarnings("all")
public class Client {
    public static void main(String[] args) {
        String path = "tw.reflection.p3.User";


        try {

            Class<User> clazz =(Class<User>) Class.forName(path);
            User user1 = clazz.newInstance();
            System.out.println(user1);

            //==================================================================================
            Constructor<User> constructor = clazz.getDeclaredConstructor(String.class, String.class, int.class);

            User user2 = constructor.newInstance("1", "jason", 27);
            System.out.println(user2.getName());

            //==================================================================================
            User user3 = clazz.newInstance();

            Method method = clazz.getDeclaredMethod("setName", String.class);
            method.invoke(user3, "Jason Chien");

            System.out.println(user3.getName());
            //==================================================================================

            User user4 = clazz.newInstance();
            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);//Access private
            field.set(user4, "4dd44");

            System.out.println(user4.getName());
            System.out.println(field.get(user4));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
