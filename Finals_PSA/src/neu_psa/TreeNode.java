package neu_psa;

import com.sun.source.tree.Tree;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data){
        this.data  = data;
        this.left = null;
        this.right = null;
    }
}
