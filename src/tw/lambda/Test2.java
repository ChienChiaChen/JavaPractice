package tw.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chiachen on 2017/4/9.
 */
//https://openhome.cc/Gossip/CodeData/JavaLambdaTutorial/MethodReference.html

public class Test2 {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Justin", "Monica", "Irene", "caterpillar");
        printtt(names);
        Collections.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();// 1=> s1,s2. -1=> s2,s1
            }
        });
        printtt(names);

    }

    static void printtt(List<String> tt) {
        for (String t : tt) {
            System.out.println(t);
        }
        System.out.println();
    }
}
