package wxs.easy.binary_tree_path_sum;

import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		Solution so1 = new Solution();
		TreeNode tnRoot = new TreeNode(1);
		TreeNode rootLeft = new TreeNode(2);
		TreeNode rootRight = new TreeNode(4);
		TreeNode left1 = new TreeNode(2);
		TreeNode right1 = new TreeNode(3);
		tnRoot.setLeft(rootLeft);
		tnRoot.setRight(rootRight);
		rootLeft.setLeft(left1);
		rootLeft.setRight(right1);
		
		List<List<Integer>> result = so1.binaryTreePathSum(tnRoot, 5);
		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result.get(i).size(); j++) {
				if (j == result.get(i).size() - 1) {
					System.out.print(result.get(i).get(j) + "\n");
				} else {
					System.out.print(result.get(i).get(j) + " ");
				}
				
			}
		}
	}

}
