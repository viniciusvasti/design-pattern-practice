package com.vas.training.designpatterns.behavioral.iterator;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree(new TreeNode(0));
		tree.add(new TreeNode(1));
		tree.add(new TreeNode(2));
		tree.add(new TreeNode(3));
		tree.add(new TreeNode(4));
		tree.add(new TreeNode(5));
		tree.add(new TreeNode(6));
		tree.add(new TreeNode(7));
		tree.add(new TreeNode(8));
		tree.add(new TreeNode(9));
		tree.add(new TreeNode(10));
		tree.add(new TreeNode(11));
		tree.add(new TreeNode(12));
		tree.add(new TreeNode(13));
		tree.add(new TreeNode(14));
		tree.add(new TreeNode(15));
		tree.add(new TreeNode(16));
		Iterator<TreeNode> it = tree.getIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
