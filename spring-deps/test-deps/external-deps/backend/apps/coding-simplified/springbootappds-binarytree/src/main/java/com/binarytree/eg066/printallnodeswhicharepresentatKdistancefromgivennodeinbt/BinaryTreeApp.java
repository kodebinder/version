package com.binarytree.eg066.printallnodeswhicharepresentatKdistancefromgivennodeinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int printElementsAtKDistance(Node node, Node targetNode, int k) {
		if (node == null || targetNode == null || k < 0) {
			return -1;
		}

		return printElementsAtKDistanceUtil(node, targetNode, k);
	}

	public int printElementsAtKDistanceUtil(Node node, Node targetNode, int k) {
		if (node == null) {
			return -1;
		}

		if (node == targetNode) {
			printNodesAtKDistanceFromParent(node, k);
			return 0;
		}

		int leftDist = printElementsAtKDistanceUtil(node.left, targetNode, k);

		if (leftDist != -1) {
			if (leftDist + 1 == k) {
				System.out.print(node.data + " ");
			} else {
				printNodesAtKDistanceFromParent(node.right, k - 2 - leftDist);
			}

			return leftDist + 1;
		}

		int rightDist = printElementsAtKDistanceUtil(node.right, targetNode, k);

		if (rightDist != -1) {
			if (rightDist + 1 == k) {
				System.out.print(node.data + " ");
			} else {
				printNodesAtKDistanceFromParent(node.left, k - 2 - rightDist);
			}

			return rightDist + 1;
		}

		return -1;
	}

	public void printNodesAtKDistanceFromParent(Node node, int k) {
		if (node == null) {
			return;
		}

		if (k == 0) {
			System.out.print(node.data + " ");
		}

		printNodesAtKDistanceFromParent(node.left, k - 1);
		printNodesAtKDistanceFromParent(node.right, k - 1);
	}

	public Node createNewNode(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
}

public class BinaryTreeApp {

	public static void main(String[] args) {

		BinaryTree a = new BinaryTree();

		Node root = a.createNewNode(2);
		root.left = a.createNewNode(7);
		root.right = a.createNewNode(9);
		root.right.right = a.createNewNode(3);
		root.left.left = a.createNewNode(10);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);

		int elements = a.printElementsAtKDistance(root, root.left, 2);

		if (elements == -1) {
			System.out.println("No elements found");
		}
	}
}