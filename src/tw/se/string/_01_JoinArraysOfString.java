package tw.se.string;

/**
 * Created by chiachen on 2017/6/3.
 */
public class _01_JoinArraysOfString {
    public static void main(String[] args) {
        String text[] = new String[]{"hello", "my", "name", "is", "jason"};
        System.out.println(join(text," "));
    }

    private static String join(String[] strings, String glue) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
            if (i<strings.length){
                stringBuilder.append(glue);
            }
        }

        return stringBuilder.toString();
    }
}
