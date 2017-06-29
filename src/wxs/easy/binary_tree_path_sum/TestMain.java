package wxs.easy.binary_tree_path_sum;

import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		Solution so1 = new Solution();
		TreeNode tnRoot = new TreeNode(37);
		TreeNode n1 = new TreeNode(-34);
		TreeNode n2 = new TreeNode(-48);
		TreeNode n3 = new TreeNode(-100);
		TreeNode n4 = new TreeNode(-100);
		TreeNode n5 = new TreeNode(48);
		TreeNode n6 = new TreeNode(-54);
		TreeNode n7 = new TreeNode(-71);
		TreeNode n8 = new TreeNode(-22);
		TreeNode n9 = new TreeNode(8);
		
		tnRoot.setLeft(n1);
		tnRoot.setRight(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n5.setLeft(n6);
		n6.setLeft(n7);
		n6.setRight(n8);
		n8.setRight(n9);

		
		List<List<Integer>> result = so1.binaryTreePathSum(tnRoot, -31);
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
