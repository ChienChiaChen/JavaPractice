package tw.se.collections.bitset;

import java.util.BitSet;

/**
 * Created by chiachen on 2017/4/4.
 */
public class BitSetLesson3 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();

        bitSet.set(3);
        System.out.println(bitSet.get(3));

        bitSet.flip(3);
        System.out.println(bitSet.get(3));
    }
}
