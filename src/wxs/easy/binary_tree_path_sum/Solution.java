package wxs.easy.binary_tree_path_sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	protected boolean currentSum(TreeNode node,
			List<List<Integer>> pathList,
			List<Integer> path, 
			int currentSum, 
			int target) {
		boolean isRightPath = false;
		path.add(node.getVal());
		currentSum += node.getVal();
		if (currentSum == target) {
			if (node.getLeft() == null && node.getRight() == null) {
				pathList.add(path);
				isRightPath = true;
			} else {
				isRightPath = false;
			}
		} else if (currentSum < target) {
			if (node.getLeft() != null) {
				currentSum(node.getLeft(), pathList, path, currentSum, target);
			} else if (node.getRight() != null) {
				currentSum(node.getRight(), pathList, path, currentSum, target);
			}
		} else {
			return false;
		}
		
		return isRightPath;
	}
	
	public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		path.add(root.getVal());
		Integer currentSum = root.getVal();
		this.currentSum(root, result, path, currentSum, target);
		return null;
	}
}
