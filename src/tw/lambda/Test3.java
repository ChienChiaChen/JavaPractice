package tw.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chiachen on 2017/4/9.
 */
////https://openhome.cc/Gossip/CodeData/JavaLambdaTutorial/MethodReference.html
public class Test3 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Justin", "Monica", "Irene", "caterpillar");
        Collections.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return StringOrder.byLength(s1, s2);
            }
        });

        Collections.sort(names, (s1, s2) -> StringOrder.byLength(s1, s2));
        Collections.sort(names, StringOrder::byLength);
        Collections.sort(names, StringOrder::byLexicography);
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        Collections.sort(names, String::compareTo);
        Collections.sort(names, String::compareToIgnoreCase);


    }
}
