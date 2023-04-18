package leetcode;

/**
 * 1026. 节点与其祖先之间的最大差值
 * <p>
 * https://leetcode.cn/problems/maximum-difference-between-node-and-ancestor/
 * <p>
 * 利用最小值和最大值计算差值
 * 深度优先遍历
 */
public class MaxAncestorDiff {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode node, int min, int max) {
        int diff = 0;
        if (node == null) {
            return diff;
        }

        diff = Math.max(Math.abs(node.val - min), Math.abs(node.val - max));

        min = Math.min(min, node.val);
        max = Math.max(max, node.val);

        diff = Math.max(diff, dfs(node.left, min, max));
        diff = Math.max(diff, dfs(node.right, min, max));

        return diff;
    }


    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}


