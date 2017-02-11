package tw.algo.incremental;


public class Main {
    public static void main(String[] args) {
        doSelectionSort();
        printTriangle(3);
        swapNumber(10, 5);

    }

    private static void doSelectionSort() {
        System.out.println("selection_sort");

        int[] strArray = {3, 6, 9, -8, 1};// length ==5
        int min;
        for (int index = 0; index < strArray.length; index++) {
             min= strArray[index];
            for (int j = strArray.length - 1; j >= index; j--) {
                if (min>strArray[j]) {
                    min = strArray[j];
                    strArray[j]=strArray[index];
                    strArray[index] = min;

                }
            }
        }

        for (int strIndex : strArray) {
            System.out.print(strIndex + "\t");
        }

    }

    private   static void printLine(int ij){
            for (int j =0; j<ij; j++) {
                System.out.print("@");
            }
    }

    private static void printTriangle(int n){
        for (int i=n;i>0; i--) {
            printLine(i);
            System.out.println();
        }
    }

    private static void swapNumber(int a, int b){
        //a=10, b=5
        a = a + b;//a=15
        b = a - b;//b=10
        a = a - b;//a=5
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }

}
