package tw.se.generic_pretice1;

public class MixmunTest {

    public static <T extends Comparable<T>> T maxmum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max)>0) {//>0 y bigger than max
            max = y;
        }

        if (z.compareTo(max)>0) {//>0 z bigger than max
            max = z;
        }


        return max;
    }

    public static void main(String[] args) {

        System.out.println("1 ,2, 3 which number is bigger" + maxmum(1, 2, 3));
    }
}
