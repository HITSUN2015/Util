package data;

import data.modal.BinaryTreeNode;

import javax.swing.tree.TreeNode;

/**
 * Created by Sunny on 17/8/25.
 */
public class TreeUtil {
    public BinaryTreeNode mergeTrees(BinaryTreeNode t1, BinaryTreeNode t2,boolean isOrg) {
        //先拿递归做了
        //TODO
        BinaryTreeNode result = null;
        if(null == t1 && null == t2){

        } else {
//            int curValue = (null == t1 ? 0 : t1.val) + (null == t2 ? 0 : t2.val);
//            TreeNode t1Left = null == t1 ? null : t1.left;
//            TreeNode t1Right = null == t1 ? null : t1.right;
//            TreeNode t2Left = null == t2 ? null : t2.left;
//            TreeNode t2Right = null == t2 ? null : t2.right;
//            result = new TreeNode(curValue);
//            result.left = mergeTrees(t1Left,t2Left);
//            result.right = mergeTrees(t1Right,t2Right);
        }
        return result;
    }
}
