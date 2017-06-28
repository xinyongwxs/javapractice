package wxs.easy.binary_tree_path_sum;

public class TreeNode {
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	private int val;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int val) {
		this.setVal(val);
		this.setLeft(null);
		this.setRight(null);
	}
}
