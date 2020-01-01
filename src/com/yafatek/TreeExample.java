package com.yafatek;public class TreeExample {	Node root;	public static TreeExample creatingBinaryTree() {		TreeExample treeExample = new TreeExample();		treeExample.addElement(10);		treeExample.addElement(5);		treeExample.addElement(8);		treeExample.addElement(3);		treeExample.addElement(9);		treeExample.addElement(7);		return treeExample;	}	public static void main(String[] args) {		System.out.println(creatingBinaryTree());	}	private Node insertNodeRecursive(Node current, int value) {		if (current == null) return new Node(value);		if (value < current.value) current.left = insertNodeRecursive(current.left, value);		else if (value > current.value) current.right = insertNodeRecursive(current.right, value);		return current;	}	public void addElement(int value) {		root = insertNodeRecursive(root, value);	}	class Node {		int value;		Node left;		Node right;		public Node(int value) {			this.value = value;		}		public String toString() {			return "value : " + value;		}	}}