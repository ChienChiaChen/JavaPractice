package tw.se.string;

/**
 * Created by chiachen on 2017/6/3.
 */
public class _02_SplittingStringIntoTokens {
    public static void main(String[] args) {
        String text = "Hi my name is jason";
        String tokens[] = text.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
