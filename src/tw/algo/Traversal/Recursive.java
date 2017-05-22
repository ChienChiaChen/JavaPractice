package tw.algo.Traversal;

/**
 * Created by chiachen on 2017/5/22.
 */
public class Recursive {
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
