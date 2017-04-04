package tw.se.collections.bitset;

import java.util.BitSet;

/**
 * Created by chiachen on 2017/4/4.
 */
public class BitSetLesson5 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(8);

        for (byte b : bitSet.toByteArray()) {
            System.out.println(b);
        }

        BitSet bitSet1 = new BitSet();
        bitSet1.set(1, 4);//00001110
        for (int i=0;i<8;i++) {
            System.out.println(i+" "+bitSet1.get(i));
        }
        System.out.println("\n");
        for (byte b : bitSet1.toByteArray()) {
            System.out.println(b);
        }
    }
}
