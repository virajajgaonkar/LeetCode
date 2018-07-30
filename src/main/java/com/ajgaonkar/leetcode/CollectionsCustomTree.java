package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CollectionsCustomTree {
	public static class TreeElement{
		private Integer data;
		private TreeElement left;
		private TreeElement right;

		public Integer getData() {
			return data;
		}

		public void setLeft(TreeElement left) {
			this.left = left;
		}

		public void setRight(TreeElement right) {
			this.right = right;
		}

		public TreeElement(int dataValue){
			this.data = dataValue;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	private TreeElement root = null;

	//region DeConstructor
	private boolean removeTree(TreeElement node){
		if(node != null){
			removeTree(node.left);
			removeTree(node.right);
		}
		return true;
	}
	public boolean clearTree(){
		removeTree(root);
		root = null;
		return true;
	}
	//endregion

	//region Add
	private boolean add(int dataValue, TreeElement node){
		boolean success = true;
		if(dataValue< node.data) {
			if(node.left!=null) {
				success = add(dataValue, node.left);
			} else {
				node.left = new TreeElement(dataValue);
			}
		} else if(dataValue>=node.data) {
			if(node.right!=null) {
				success = add(dataValue, node.right);
			} else {
				node.right = new TreeElement(dataValue);
			}
		}
		return success;
	}
	public boolean add(int dataValue){
		boolean success = true;
		if(root!= null){
			success = add(dataValue, root);
		} else{
			root = new TreeElement(dataValue);
		}
		return success;
	}
	//endregion

	//region remove

	/* A recursive function to insert a new key in BST */
	private TreeElement deleteNode(TreeElement node, int key) {
		/* Base Case: If the tree is empty */
		if (node == null) {
			return node;
		}
		/* Otherwise, recur down the tree */
		if (key < node.data) {
			node.left = deleteNode(node.left, key);
		} else if (key > node.data) {
			node.right = deleteNode(node.right, key);
			// if key is same as root's key, then This is the node
			// to be deleted
		}else {
			// node with only one child or no child
			if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			}
			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			node.data = minValue(node.right);
			// Delete the inorder successor
			node.right = deleteNode(node.right, node.data);
		}
		return node;
	}

	private int minValue(TreeElement node) {
		int minv = node.data;
		while (node.left != null) {
			minv = node.left.data;
			node = node.left;
		}
		return minv;
	}

	public boolean remove(int dataValue){
		TreeElement delete = deleteNode(root, dataValue);
		return true;
	}
	private boolean remove(TreeElement deleteMe){
		boolean success = true;
		return success;
	}
	//endregion

	//region find
	private TreeElement find(int dataValue, TreeElement node){
		if(node == null) {return null;}
		if(node.data == dataValue){return node;}
		if(node.data < dataValue){
			return find(dataValue, node.right);
		} else{
			return find(dataValue, node.left);
		}
	}
	public TreeElement find(int dataValue){
		return find(dataValue, root);
	}
	//endregion

	//region mirror
	private void mirror(TreeElement node) {
		if (node==null) {
			return;
		}
		else {
			TreeElement temp;
			// do the subtrees
			mirror(node.left);
			mirror(node.right);

			// swap the pointers in this node
			temp = node.left;
			node.left = node.right;
			node.right = temp;
		}
	}
	public void mirror(){
		mirror(root);
	}
	//endregion

	//region LeastCommonAncestor
/* Starting from root node, if the current node is less than data of both the given nodes, go to right.
if it greater than both the node, go to left.
If is greater than one but less than another, this is the Lowest common Ancestor of both the given node. */
	private TreeElement leastCommonAncestor(TreeElement node, TreeElement node1, TreeElement node2) {
		if ( node == null ) {return null; }
		if ( node1 == null ) {return null; }
		if ( node2 == null ) {return null; }
		if ( (node.data > node1.data) && (node.data > node2.data)){
			return leastCommonAncestor(node.left, node1, node2);
		} else if ( (node.data < node1.data) && (node.data < node2.data)){
			return leastCommonAncestor(node.right, node1, node2);
		} else {
			return node;
		}
	}

	public TreeElement leastCommonAncestor(TreeElement node1, TreeElement node2) {
		return leastCommonAncestor(root, node1, node2);
	}
	//endregion

	//region InOrder
	private void inOrder(TreeElement node, List<Integer> list){
		if(node == null) { return; }
		inOrder(node.left, list);
		list.add(node.data);
		inOrder(node.right, list);
	}
	public List<Integer> inOrder(){
		List<Integer> list = new ArrayList<>();
		inOrder(root, list);
		return list;
	}
	//endregion

	//region PreOrder
	private void preOrder(TreeElement node, List<Integer> list){
		if(node == null) { return; }
		list.add(node.data);
		preOrder(node.left, list);
		preOrder(node.right, list);
	}
	public List<Integer> preOrder() {
		List<Integer> list = new ArrayList<>();
		preOrder(root, list);
		return list;
	}
	//endregion

	//region PostOrder
	private void postOrder(TreeElement node, List<Integer> list) {
		if(node == null) { return; }
		postOrder(node.left, list);
		postOrder(node.right, list);
		list.add(node.data);
	}
	public List<Integer> postOrder() {
		List<Integer> list = new ArrayList<>();
		postOrder(root, list);
		return list;
	}
	//endregion

	//region IsBST
	private boolean isBST(TreeElement node, int currentMin, int currentMax){
		if(node == null) {return true;}
		if( (node.data > currentMin)  && (node.data < currentMax) && (isBST(node.left, currentMin, node.data)) && (isBST(node.right, node.data, currentMax)) ){
			return true;
		} else {
			return false;
		}
	}
	public boolean isBST(){
		int currentMin = 0;
		int currentMax = Integer.MAX_VALUE;
		return isBST(root, 0, currentMax);
	}
	//endregion

	//region Height
	private int height(TreeElement node){
		if(node == null) {
			return 0;
		} else {
			return Math.max(height(node.left), height(node.right)) + 1;
		}
	}

	public int height(){
		return height(root);
	}
	//endregion

	//region PrintAllPaths
	private List<Integer> printArray(int[] path, int len) {
		List<Integer> oneResult = new ArrayList<>();
		for ( int i = 0; i < len; i++ ){
			System.out.print(path[i] + ",");
			oneResult.add(path[i]);
		}
		System.out.println("");
		return oneResult;
	}

	//1) Initialize an array with size as maximum depth of the tree.
	//2) Fill the node details in this array as we traverse the tree.
	//3) If leaf node is reached a path is traversed and print the path.
	//4) Recursively scan the left and right sub tree.
	private void printAllPaths(TreeElement node, int[] path, int len, List<List<Integer>> result){
		if ( node == null ){ return; }
		path[len] = node.data;
		len++;
		if ( node.left == null && node.right == null ) {
			// leaf node is reached
			List<Integer> oneResult = printArray(path, len);
			result.add(oneResult);
			return;
		}

		printAllPaths(node.left, path, len, result);
		printAllPaths(node.right, path, len, result);
	}
	public List<List<Integer>> printAllPaths(){
		int height = height(root);
		List<List<Integer>> result = new ArrayList<>();
		int[] path = new int[height];
		int length=0;
		printAllPaths(root, path, length, result);
		return result;
	}
	//endregion

	//region PrintLongestPath
	//1) Initialize an array with size as maximum depth of the tree.
	//2) Fill the node details in this array as we traverse the tree.
	//3) If a path is reached with maximum depth print the path and return.
	//4) Recursively scan the left and right sub tree.
	private void printLongestPath(TreeElement node, int[] path, int len, int height, List<List<Integer>> result){
		if ( node == null ){ return; }

		path[len] = node.data;
		len++;

		if (len ==height) {
			// leaf node is reached
			List<Integer> oneResult = printArray(path, len);
			result.add(oneResult);
			return;
		}

		printLongestPath(node.left, path, len, height, result);
		printLongestPath(node.right, path, len, height, result);
	}
	public List<List<Integer>> printLongestPath(){
		int height = height(root);
		List<List<Integer>> result = new ArrayList<>();
		int[] path = new int[height];
		int length=0;
		printLongestPath(root, path, length, height, result);
		return result;
	}
	//endregion

	//region PrintBFS
	private void printBFS(TreeElement node, List<Integer> res){
		int childrenInNextLevel=0;
		int childrenInCurrentLevel=0;

		Queue<TreeElement> q = new LinkedList<>();
		q.offer(node);
		childrenInCurrentLevel++;

		while(!q.isEmpty()){
			TreeElement temp = (TreeElement)q.peek();
			q.poll();
			childrenInCurrentLevel--;
			res.add(temp.data);
			System.out.print(temp.data + " ");

			if(temp.left!=null){
				q.offer(temp.left);
				childrenInNextLevel++;
			}

			if(temp.right!=null){
				q.offer(temp.right);
				childrenInNextLevel++;
			}
			if(childrenInCurrentLevel==0){
				System.out.println("\r\n");
				childrenInCurrentLevel= childrenInNextLevel;
				childrenInNextLevel=0;
			}
		}
	}
	public List<Integer> printBFS(){
		List<Integer> res = new ArrayList<>();
		printBFS(root, res);
		return res;
	}
	//endregion

	//region CountNodes
	private int countNodes(TreeElement node){
		if(node == null) {return 0;}
		return countNodes(node.left) + 1 + countNodes(node.right);
	}
	public int countNodes(){
		return countNodes(root);
	}
	//endregion

	//region CountDupes
	private void countDupes(TreeElement node, int[] prevValue, int[] dupes){
		if(node == null){return;}
		countDupes(node.left, prevValue, dupes);
		if(node.data == prevValue[0]){dupes[0]++;}
		prevValue[0] = node.data;
		countDupes(node.right, prevValue, dupes);
		return;
	}

	public int countDupes(){
		int[] prevValue = new int[1];
		prevValue[0] = Integer.MAX_VALUE;
		int[] dupes = new int[1];
		dupes[0] = 0;
		countDupes(root, prevValue, dupes);
		return dupes[0];
	}
	//endregion

	//region PrintBoundary
	private void printLeftBoundary(TreeElement node, Set<Integer> set){
		if(node == null){return;}
		System.out.println(node.data + " ");
		set.add(node.data);
		if(node.left != null){
			printLeftBoundary(node.left, set);
		} else {
			printLeftBoundary(node.right, set);
		}
	}
	private void printLowerBoundary(TreeElement node, Set<Integer> set){
		if(node == null){return;}
		printLowerBoundary(node.left, set);
		if((node.left==null)&& (node.right==null)){
			System.out.println(node.data + " ");
			set.add(node.data);
		}
		printLowerBoundary(node.right, set);
	}
	private void printRightBoundary(TreeElement node, Set<Integer> set){
		if(node == null){return;}
		System.out.println(node.data + " ");
		set.add(node.data);
		if(node.right != null){
			printLeftBoundary(node.right, set);
		} else {
			printLeftBoundary(node.left, set);
		}
	}
	private void printBoundary(TreeElement node, Set<Integer> set){
		if(node == null){return;}
		System.out.println(node.data + " ");
		set.add(node.data);
		printLeftBoundary(node.left, set);
		printLowerBoundary(node, set);
		printRightBoundary(node.right, set);
	}

	//Print outside frame of a binary tree anti-clockwise.
	//1) Print all left most nodes.
	//2) Print all leaf nodes.
	//3) Print all right most nodes.
	//Please note:
	//If a node is a left-most node, then its left child must be a left-most node as well.
	//If its left child does not exist, then its right child will be a left-most node.
	public List<Integer> printBoundary(){
		Set<Integer> set = new LinkedHashSet<>();
		printBoundary(root, set);
		System.out.println("\r\n");
		List<Integer> list = new ArrayList<>(set);
		return list;
	}
	//endregion

	//region PrintBoundaryEx
	private void printBoundaryEx(TreeElement node, boolean leftMost, boolean rightMost, List<Integer> list){
		if(node == null){return;}
		boolean isLeftLeftB= false;
		boolean isLeftRightB= false;
		boolean isRightLeftB= false;
		boolean isRightRightB= false;
		boolean isLeafNode = false;
		boolean thisNodeVisited = false;

		if(leftMost){
			if(node.left != null){
				isLeftLeftB=true;
			} else {
				isRightLeftB=true;
			}
		}
		if(rightMost){
			if(node.right != null){
				isRightRightB=true;
			} else {
				isLeftRightB=true;
			}
		}
		if((node.left == null)&&(node.right == null)){
			isLeafNode=true;
		}

		if((leftMost) && (!thisNodeVisited)){
			System.out.println(node.data + " ");
			list.add(node.data);
			thisNodeVisited=true;
		}
		printBoundaryEx(node.left, isLeftLeftB, isLeftRightB, list);
		if((isLeafNode) && (!thisNodeVisited) ){
			System.out.println(node.data + " ");
			list.add(node.data);
			thisNodeVisited=true;
		}
		printBoundaryEx(node.right, isRightLeftB, isRightRightB, list);
		if((rightMost) && (!thisNodeVisited)){
			System.out.println(node.data + " ");
			list.add(node.data);
			thisNodeVisited=true;
		}
	}

	public List<Integer> printBoundaryEx(){
		List<Integer> list = new ArrayList<>();
		printBoundaryEx(root, true, true, list);
		System.out.println("\r\n");
		return list;
	}
	//endregion

	//region CreateBST
	private TreeElement createBST(int[]  arr, int start, int end){
		TreeElement top = null;
		// Check
		if (start <= end) {
			// Partition the array and set the mid as root
			int mid = (start + end) / 2;
			top = new TreeElement(arr[mid]);

			// Generate and assign the left and right sub trees recursively
			if (start < end) {
				top.left = createBST(arr, start, mid - 1);
				top.right = createBST(arr, mid + 1, end);
			}
		}

		return top;
	}

	public void createBST(int[]  arr) {
		root = createBST(arr, 0, arr.length-1);
	}
	//endregion

	//region CheckEqualNodesMayBeSwitched
	private boolean checkEqualNodesMayBeSwitched(TreeElement first, TreeElement second){
		if((first == null) && (second == null)){return true;}
		if((first == null) || (second == null)){return false;}
		if (first.data != second.data) {return false;}
		boolean check = checkEqualNodesMayBeSwitched(first.left, second.left) && checkEqualNodesMayBeSwitched(first.right, second.right);
		if(check) {return true;}
		return checkEqualNodesMayBeSwitched(first.left, second.right) && checkEqualNodesMayBeSwitched(first.right, second.left);
	}

	private TreeElement getRoot(){
		return root;
	}

	public boolean CheckEqualNodesMayBeSwitched(CollectionsCustomTree second){
		return checkEqualNodesMayBeSwitched(root, second.getRoot());
	}
	//endregion

	//region PrintFunny
	private void printFunny(TreeElement node){
		if(node == null){
			System.out.println("null");
		} else {
			System.out.println(node.data);
			System.out.println("( ");
			System.out.println(node.left);
			System.out.println(" , ");
			System.out.println(node.right);
			System.out.println(" )");
		}
	}
	public void printFunny(){
		System.out.println("( ");
		printFunny(root);
		System.out.println(" )");
		System.out.println("\r\n");
	}
	//endregion
}
