package tw.se.generic_pretice5;

public class Main {
    public static void main(String[] args) {
//        FruitGenerator generator = new FruitGenerator();
//        System.out.println(generator.next());
//        System.out.println(generator.next());
//        System.out.println(generator.next());
//        System.out.println(generator.next());

        out("findingsea");
        out(123);
        out(11.11);
        out(true);
    }

    private static <T> void out(T t) {
        System.out.println(t);
    }
}
