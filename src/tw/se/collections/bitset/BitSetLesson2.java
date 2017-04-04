package tw.se.collections.bitset;

import java.util.BitSet;

/**
 * Created by chiachen on 2017/4/4.
 * https://www.dotnetperls.com/bitset-java
 */
public class BitSetLesson2 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();

        bitSet.set(10);
        bitSet.set(100);

        boolean a = bitSet.get(5);
        boolean b = bitSet.get(10);
        boolean c = bitSet.get(100);

        System.out.println("index 5: " + a);
        System.out.println("index 10: " + b);
        System.out.println("index 100: " + c);

    }
}
