package tw.guava;


import java.util.Optional;

/**
 * Created by chiachen on 2017/3/23.
 */
public class Lesson1 {
    public static void main(String[] args) {
        Integer inValidInput = null;

        Optional<Integer> a = Optional.of(inValidInput);
        Optional<Integer> b = Optional.of(new Integer(5));
        System.out.println(sum(a, b));
    }

    private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        return a.get() + b.get();
    }
}
