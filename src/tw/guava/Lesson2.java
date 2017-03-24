package tw.guava;

import java.util.Optional;

/**
 * Created by chiachen on 2017/3/24.
 */
public class Lesson2 {
    public static void main(String[] args) {
        Integer a = null;

        Optional<Integer> aa = Optional.ofNullable(a);
        Optional<Integer> bb = Optional.of(new Integer(5));
        System.out.println(sum(aa, bb));
    }

    private static Integer sum(Optional<Integer> a,Optional<Integer> b){
        System.out.println("first parameter is present " + a.isPresent());

        System.out.println("first parameter is present " + b.isPresent());

        Integer aa = a.orElse(new Integer(0));
        Integer bb = b.get();

        return aa + bb;

    }

}
