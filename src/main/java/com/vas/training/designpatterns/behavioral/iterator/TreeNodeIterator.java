package com.vas.training.designpatterns.behavioral.iterator;

import java.util.LinkedList;

public class TreeNodeIterator implements Iterator<TreeNode> {

	LinkedList<TreeNode> stack = new LinkedList<>();

	public TreeNodeIterator(TreeNode root) {
		super();
		stack.add(root);
	}

	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	@Override
	public TreeNode next() {
		LinkedList<TreeNode> aux = new LinkedList<>();
		if (stack.isEmpty())
			throw new RuntimeException("There is no next element");
		for (TreeNode treeNode : stack) {
			if (treeNode.hasLeft() && !stack.contains(treeNode.getLeftChild()))
				aux.add(treeNode.getLeftChild());
		}
		for (TreeNode treeNode : stack) {
			if (treeNode.hasRight() && !stack.contains(treeNode.getRightChild()))
				aux.add(treeNode.getRightChild());
		}
		stack.addAll(aux);
		return stack.pop();
	}

}
