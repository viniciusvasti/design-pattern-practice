package com.vas.training.designpatterns.behavioral.iterator;

public class TreeNode {

	private final int value;
	private int childsNumber = 0;
	private TreeNode parent;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(int value) {
		super();
		this.value = value;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		childsNumber++;
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		childsNumber++;
		this.rightChild = rightChild;
	}

	public int getValue() {
		return value;
	}

	public boolean hasLeft() {
		return leftChild != null;
	}

	public boolean hasRight() {
		return rightChild != null;
	}

	public boolean hasParent() {
		return parent != null;
	}

	public int getChildsNumber() {
		int accumulator = childsNumber;
		if (hasLeft())
			accumulator += leftChild.getChildsNumber();
		if (hasRight())
			accumulator += rightChild.getChildsNumber();
		return accumulator;
	}

	@Override
	public String toString() {
		return "TreeNode [value=" + value + "]";
	}

}
