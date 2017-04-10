package tw.lambda;

import static tw.lambda.Lesson2_2_AlgebraicType.*;

/**
 * Created by chiachen on 2017/4/10.
 */
public class Lesson2_1 {
    public interface List<T> {
        T head();
        List<T> tail();
    }

    public static void main(String[] args) {
        String ee = cons(new Integer(1), nil()).toString();
        System.out.println(ee);
        System.out.println();
        ee = cons(2, cons(1, nil())).toString(); // 2:1:[]
        System.out.println(ee);
        System.out.println();
        ee = cons(3, cons(2, cons(1, nil()))).toString(); // 3:2:1:[]
        System.out.println(ee);
        System.out.println();

        ee = list(1, 2, 3, 4).toString(); // 1:2:3:4:[]
        System.out.println(ee);
        System.out.println();

    }

}
