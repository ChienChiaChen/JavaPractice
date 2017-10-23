package tw.se.generic_pretice5;

//https://segmentfault.com/a/1190000002646193
//http://www.jianshu.com/p/95f349258afb

public class Main {
    public static void main(String[] args) {
//        FruitGenerator generator = new FruitGenerator();
//        System.out.println(generator.next());
//        System.out.println(generator.next());
//        System.out.println(generator.next());
//        System.out.println(generator.next());

//        out("findingsea");
//        out(123);
//        out(11.11);
//        out(true);

//        out("findingsea", 123, 11.11, true);

        System.out.println(get("test"));

    }

    private static <T> void out(T t) {
        System.out.println(t);
    }

    public static <T> void out(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

    public static <T> T get(T t) {
        return t;
    }
}
