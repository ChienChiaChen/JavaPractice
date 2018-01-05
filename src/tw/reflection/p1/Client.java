package tw.reflection.p1;

@SuppressWarnings("all")
public class Client {
    public static void main(String[] args) {
        String path = "tw.reflection.p1.User";


        try {
//            object 是表示或封裝一些資料。
//            一個類別加載後，
//             JVM會create 一個對應該類別的Class 物件，
//             類別 的整個結構資訊放到對應的Class 物件中
            Class<?> clazz = Class.forName(path);
            System.out.println(clazz.hashCode());

            Class<?> clazz1 = Class.forName(path);
            System.out.println(clazz1.hashCode());


            Class strClass = String.class;
            Class strClass1 = path.getClass();

            System.out.println(strClass == strClass1);

            int[][] a = new int[10][3];
            int[] b = new int[30];

            System.out.println(a.getClass().hashCode());
            System.out.println(b.getClass().hashCode());




        } catch (Exception e) {

        }


    }
}
