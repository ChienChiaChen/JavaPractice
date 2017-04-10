package tw.lambda;

import java.util.Arrays;

/**
 * Created by chiachen on 2017/4/10.
 */
//https://openhome.cc/Gossip/CodeData/JavaLambdaTutorial/AlgebraicDataType.html
//https://openhome.cc/Gossip/CodeData/JavaLambdaTutorial/ListPatterns.html
public class Lesson2_2_AlgebraicType {

    public interface List<T> {
        T head();
        List<T> tail();
    }

    private static List<? extends Object> Nil = new List<Object>() {
        @Override
        public Object head() {
            return null;
        }

        @Override
        public List<Object> tail() {
            return null;
        }

        @Override
        public String toString() {
            return "[]";
        }
    };


    @SuppressWarnings("unchecked")
    public static <T> List<T> nil() {
        return (List<T>) Nil;
    }

    public static <T> List<T> cons(final T x, final List<T> xs) {
        return new List<T>() {
            private T head;
            private List<T> tail;
            {
                this.head = x;
                this.tail = xs;
            }

            public T head(){
                return this.head;
            }

            public List<T> tail() {
                return this.tail;
            }
            public String toString() {
                return head() + ":" + tail();
            }
        };
    }

    @SafeVarargs
    public static <T> List<T> list(T... elems) {
        if (elems.length == 0) {
            return nil();
        }

        T[] remain = Arrays.copyOfRange(elems, 1, elems.length);
        return cons(elems[0], list(remain));
    }
}
