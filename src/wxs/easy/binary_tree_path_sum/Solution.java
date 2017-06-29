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
		if (node != null) {
			path.add(node.getVal());
			currentSum += node.getVal();
			if (node.getLeft() == null && node.getRight() == null) {
				if (currentSum == target) {
					pathList.add(path);
					isRightPath = true;
				} else {
					isRightPath = false;
				}
			} else {
				List<Integer> copiedPath = new ArrayList<Integer>(path);
				if (node.getLeft() != null) {
					currentSum(node.getLeft(), pathList, path, currentSum, target);
				}
				if (node.getRight() != null) {
					currentSum(node.getRight(), pathList, copiedPath, currentSum, target);
				}
			}
		}
		return isRightPath;
	}
	
	public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		Integer currentSum = 0;
		this.currentSum(root, result, path, currentSum, target);
		return result;
	}
}
