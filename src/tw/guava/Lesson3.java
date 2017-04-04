package tw.guava;


import com.google.common.base.Preconditions;

/**
 * Created by chiachen on 2017/3/26.
 */
public class Lesson3 {
    public static void main(String[] args) {
        try {
            sqrt(-3.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            sum(null, 3);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            getValue(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static double sqrt(double input) throws IllegalArgumentException {
        Preconditions.checkArgument(input > 0.0, "Illegal Argument passed: Negative value %s.", input);
        return Math.sqrt(input);
    }

    public static Integer sum(Integer a,Integer b){
        Preconditions.checkNotNull(a, "oh no~ a");
        Preconditions.checkNotNull(b, "oh no~ b");
        return a + b;
    }

    public static int getValue(int input){
        int data[] = {1, 2, 3, 4, 5};
        Preconditions.checkElementIndex(input, data.length, "nonono");
        return data[input];
    }


}
