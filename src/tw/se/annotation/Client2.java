package tw.se.annotation;


public class Client2 {

    @Annotation01(studentName = "qqq",age = 555,schools = {"1","2"})
    public static void test01() {

    }


    @Annotation02("aaa")
    public static void test02() {

    }
}
