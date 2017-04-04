package tw.se.collections.bitset;

import java.util.BitSet;

/**
 * Created by chiachen on 2017/4/4.
 */
public class BitSetLesson4 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(2,5);

        for (int i = 0; i < 6; i++) {

            System.out.println(i + "  :" + bitSet.get(i));
        }
    }
}
