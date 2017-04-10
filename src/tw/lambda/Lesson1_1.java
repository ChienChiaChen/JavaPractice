package tw.lambda;

/**
 * Created by chiachen on 2017/4/10.
 */
public class Lesson1_1 {
    public static void main(String[] args) {
        fib(2);

    }

    static void fib(int n) {
        if (0 == n || 1 == n) {
            System.out.println(n);
        }

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            int temp = a;//temp=0, 1
            a = b;//a=1, 1
            b = a + temp;//b=1+0
        }
        System.out.println(b);
    }
}
