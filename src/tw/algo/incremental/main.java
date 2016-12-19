package tw.algo.incremental;

/**
 * Created by chiachen on 2016/12/17.
 */
public class main {
    public static void main(String[] args) {
//        selection_sort();
//        printTriangle(3);
        swapNumber(10, 5);

    }

    public static void doSelectionSort() {
        System.out.println("selection_sort");

        int[] aa = {3, 6, 9, -8, 1};// length ==5
        int min;
        for (int i = 0; i < aa.length; i++) {
             min= aa[i];
            for (int j = aa.length - 1; j >= i; j--) {
                if (min>aa[j]) {
                    min = aa[j];
                    aa[j]=aa[i];
                    aa[i] = min;

                }
            }
        }

        for (int i : aa) {
            System.out.print(i+"\t");
        }

    }
    public  static void printLine(int ij){
            for (int j =0; j<ij; j++) {
                System.out.print("@");
            }
    }
    public static void printTriangle(int n){
        for (int i=n;i>0; i--) {
            printLine(i);
            System.out.println();
        }
    }

    public static void swapNumber(int a, int b){
        //a=10, b=5
        a = a + b;//a=15
        b = a - b;//b=10
        a = a - b;//a=5
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }

}
