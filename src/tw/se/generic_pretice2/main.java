package tw.se.generic_pretice2;

/**
 *https://caterpillar.gitbooks.io/javase6tutorial/content/c12_1.html
 */
public class main {


    public static void main(String[] args) {


        GenericFoo<String> genericFooString = new GenericFoo<>();
        genericFooString.setT("Hello world");

        GenericFoo2<Integer, Boolean> genericFoo2 = new GenericFoo2<>();

        genericFoo2.setT1(1);
        genericFoo2.setT2(1 == 1);


        Boolean[] booleans = {true, false, true, true, false};

        GenericFoo3<Boolean> genericFoo3 = new GenericFoo3<>();
        genericFoo3.setTs(booleans);

        String[] strings = {"1", "2", "3"};
        GenericFoo3<String> genericFoo3_1 = new GenericFoo3<>();
        genericFoo3_1.setTs(strings);

        WrapperFoo<String> wrapperFoo = new WrapperFoo<>();

        wrapperFoo.setFoo(genericFooString);

        System.out.println(wrapperFoo.getFoo().getT());


    }
}
