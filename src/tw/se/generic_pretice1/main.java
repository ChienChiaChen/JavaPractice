package tw.se.generic_pretice1;

/*
    http://www.runoob.com/java/java-generics.html
*/

public class main {


    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print("" + element + "\t");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Int:");
        printArray(intArray);

        System.out.println("\ndouble:");
        printArray(doubleArray);

        System.out.println("\nchar:");
        printArray(charArray);
    }
}



