package tw.algo.memoization;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        String str = "HrgsgsdfsdfsdfgergeellorgergWorld";
        int len = str.length();
        int size = Math.min(len, 26);
        Map<Character, Integer> numChars = new HashMap<>(size);

        for (int i = 0; i < len; ++i)
        {
            char charAt = str.charAt(i);

            if (!numChars.containsKey(charAt))
            {
                numChars.put(charAt, 1);
            }
            else
            {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }

        System.out.println(numChars);

    }

    private static int getArraySize(int ...a){
        int[] array=new int[10];
        int n = 0;      // 使用一個變數，記錄資料數量。
        array[n++] = 3; // 以便迅速地增加資料。
        array[n++] = 6;
        array[n++] = 9;
        return n;
    }

}
