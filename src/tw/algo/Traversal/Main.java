package tw.algo.Traversal;

/**
 * Created by chiachen on 2017/5/21.
 */
public class Main {
    public static void main(String[] args) {
        Data rright= new Data.DataBuilder("G").build();
        Data rleft= new Data.DataBuilder("F").build();
        Data right= new Data.DataBuilder("C").setRight(rright).setLeft(rleft).build();
        Data lright= new Data.DataBuilder("E").build();
        Data lleft= new Data.DataBuilder("D").build();
        Data left= new Data.DataBuilder("B").setLeft(lleft).setRight(lright).build();
//        Data right = new Data.DataBuilder("C").build();
//        Data left = new Data.DataBuilder("B").build();
        Data root = new Data.DataBuilder("A").setLeft(left).setRight(right).build();

        System.out.println("\nprintPreorder");//
        Recursive.printPreorder(root);
        System.out.println("\nprintInorder");
        Recursive.printInorder(root);
        System.out.println("\nprintPostorder");
        Recursive.printPostorder(root);
        System.out.println("\nprintPostorderIte");
        NonRecursive.printPostorderIte(root);
    }




}
