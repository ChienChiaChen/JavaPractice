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
        Data root = new Data.DataBuilder("A").setLeft(left).setRight(right).build();
        printPreorder(root);
        System.out.println();
        printInorder(root);
        System.out.println();
        printPostorder(root);
    }

    public static void printPreorder(Data root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+"  ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
    public static void printInorder(Data root) {
        if (root == null) {
            return;
        }

        printPreorder(root.left);
        System.out.print(root.data+"  ");
        printPreorder(root.right);
    }
    public static void printPostorder(Data root) {
        if (root == null) {
            return;
        }
        printPreorder(root.left);
        printPreorder(root.right);
        System.out.print(root.data+"  ");
    }
}
