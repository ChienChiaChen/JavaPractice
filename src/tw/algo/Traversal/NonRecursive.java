package tw.algo.Traversal;

import java.util.Stack;

/**
 * Created by chiachen on 2017/5/22.
 */
public class NonRecursive {
    public static void printPostorderIte(Data root) {
        if (root == null) {
            return;
        }

        Stack<Data> stack = new Stack<>();
        Data node = root;

        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        while (stack.size() > 0) {

            node = stack.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                node = node.right;

                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
    }

}
