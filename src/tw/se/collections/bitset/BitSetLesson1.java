package tw.se.collections.bitset;

import java.util.BitSet;

/**
 * Created by chiachen on 2017/4/4.
 */
public class BitSetLesson1 {
    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet(16);
        BitSet bitSet2 = new BitSet(16);

        // set some bits
        for(int i = 0; i < 16; i++) {
            if ((i % 2) == 0) {//0 2 4 6 8 10 12 14
                bitSet1.set(i);
            }
            if((i % 5) != 0){ //1234, 6789, 11 12 13 14
                bitSet2.set(i);
            }
        }

        System.out.println(bitSet1);
        System.out.println(bitSet2);
        //AND
        bitSet2.and(bitSet1);
        System.out.println("\n"+bitSet2);
        //OR
        bitSet2.or(bitSet1);
        System.out.println("\n"+bitSet2);
        //XOR
        bitSet2.andNot(bitSet1);
        System.out.println("\n"+bitSet2);


    }
}
