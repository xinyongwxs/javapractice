package wxs.easy.binary_tree_path_sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	protected boolean currentSum(TreeNode node, 
			List<Integer> path, 
			int currentSum, 
			int target) {
		boolean isRightPath = false;
		path.add(node.getVal());
		currentSum += node.getVal();
		if (currentSum == target) {
			if (node.getLeft() == null && node.getRight() == null) {
				isRightPath = true;
			} else {
				isRightPath = false;
			}
		} else if (currentSum < target) {
			if (node.getLeft() != null) {
				currentSum(node.getLeft(), path, currentSum, target);
			} else if (node.getRight() != null) {
				currentSum(node.getRight(), path, currentSum, target);
			}
		} else {
			return false;
		}
		
		return isRightPath;
	}
	
	public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		
		return null;
	}
}
