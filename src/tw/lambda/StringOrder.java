package tw.lambda;

/**
 * Created by chiachen on 2017/4/9.
 */

//https://openhome.cc/Gossip/CodeData/JavaLambdaTutorial/MethodReference.html
public class StringOrder {
    static int byLength(String s1, String s2) {

        return s1.length() - s2.length();
    }

    static int byLexicography(String s1, String s2) {
        return s1.compareTo(s2);
    }

    static int byLexicographyIgnoreCase(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}
