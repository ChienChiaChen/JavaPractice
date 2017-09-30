package tw.se.generic_pretice3;

import tw.se.generic_pretice2.GenericFoo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        ListGenericFoo<ArrayList> listListGenericFoo = new ListGenericFoo<>();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        listListGenericFoo.setT(arrayList);


        GenericFoo<? extends List> genericFoo;

        genericFoo = new GenericFoo<ArrayList>();
        genericFoo = new GenericFoo<LinkedList>();


        GenericFoo<String> foo = new GenericFoo<String>();
        foo.setT("caterpillar");

        GenericFoo<?> immutableFoo = foo;
        // 可以取得資訊
        System.out.println(immutableFoo.getT());

        // 可透過immutableFoo來移去foo所參考實例內的資訊
        immutableFoo.setT(null);

        // 不可透過immutableFoo來設定新的資訊給foo所參考的實例
        // 所以下面這行無法通過編譯
        //  immutableFoo.setFoo("良葛格");

        showFoo(new GenericFoo<>());
        String s = new String();


        String str1 = "fly";
        String str2 = "weight";
        String str3 = "flyweight";
        String str4;

        str4 = str1 + str2;
        System.out.println(str3 == str4);

        str4 = (str1 + str2).intern();
        System.out.println(str3 == str4);
    }

    public static void showFoo(GenericFoo<? extends String> foo){
        System.out.println(foo.getT());
    }

    public static void showFoo1(GenericFoo<? super StringBuilder> foo){
        System.out.println(foo.getT());
    }
}
