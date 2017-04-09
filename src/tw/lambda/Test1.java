package tw.lambda;

import java.util.List;

/**
 * Created by chiachen on 2017/4/9.
 */
public class Test1 {

    @FunctionalInterface
    public interface Func<P, R>{
        R apply(P p);
    }


    public static <A, B, C> Func<A, C> compose(Func<A, B> f, Func<B, C> g) {
        return x -> g.apply(f.apply(x));
    }

    public static void main(String[] args) {
        new Func<Integer, Integer>() {
            @Override
            public Integer apply(Integer o) {
                return o * 2;
            }

        };

        compose((Integer x) -> x + 2, (Integer y) -> y * 3);
//        (int a, int b) -> (a + b);
        Func<Integer, Integer> func = x -> x * 2;//x==> P, x*2==> R

    }

    static void printtt(List<Integer> tt) {
        for (int t : tt) {
            System.out.println(t);
        }
        System.out.println();
    }
}
