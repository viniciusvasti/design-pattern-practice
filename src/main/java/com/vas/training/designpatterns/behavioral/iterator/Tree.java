package com.vas.training.designpatterns.behavioral.iterator;

public class Tree {

	private TreeNode root;

	public Tree(TreeNode root) {
		super();
		this.root = root;
	}

	public void add(TreeNode node) {
		add(root, node);
	}

	private void add(TreeNode parent, TreeNode child) {
		if (!parent.hasLeft()) {
			parent.setLeftChild(child);
			child.setParent(parent);
			System.out.println("added left " + child.getValue() + " | parent " + parent.getValue());
			return;
		}
		if (!parent.hasRight()) {
			parent.setRightChild(child);
			child.setParent(parent);
			System.out
					.println("added right " + child.getValue() + " | parent " + parent.getValue());
			return;
		}

		if (parent.getRightChild().getChildsNumber() < parent.getLeftChild().getChildsNumber()) {
			System.out.println("entering right");
			add(parent.getRightChild(), child);
		} else {
			System.out.println("entering left");
			add(parent.getLeftChild(), child);
		}
	}

	public TreeNode getRoot() {
		return root;
	}

	public Iterator<TreeNode> getIterator() {
		return new TreeNodeIterator(root);
	}

}
