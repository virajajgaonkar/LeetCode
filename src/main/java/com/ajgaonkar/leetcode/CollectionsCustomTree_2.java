package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionsCustomTree_2 {
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

	public CollectionsCustomTree_2(){
	}

	private void add(TreeElement node, int d){
		if(d < node.data){
			if(node.left == null){
				node.left = new TreeElement(d);
			} else {
				add(node.left, d);
			}
		} else {
			if(node.right == null){
				node.right = new TreeElement(d);
			} else {
				add(node.right, d);
			}
		}
	}
	public void add(int d){
		if(root == null){
			root = new TreeElement(d);
		} else {
			add(root, d);
		}
	}

	public void clear(TreeElement node){
		if(node == null){
			return;
		}
		clear(node.left);
		clear(node.right);
	}
	public void clearTree(){
		clear(root);
		root = null;
	}

	private void inOrder(TreeElement node, List<Integer> res){
		if(node== null){
			return;
		}
		inOrder(node.left, res);
		res.add(node.data);
		inOrder(node.right, res);
	}

	public List<Integer> inOrder(){
		List<Integer> res = new ArrayList<>();
		inOrder(root, res);
		return res;
	}

	private void preOrder(TreeElement node, List<Integer> res){
		if(node== null){
			return;
		}
		res.add(node.data);
		preOrder(node.left, res);
		preOrder(node.right, res);
	}

	public List<Integer> preOrder(){
		List<Integer> res = new ArrayList<>();
		preOrder(root, res);
		return res;
	}

	private void postOrder(TreeElement node, List<Integer> res){
		if(node== null){
			return;
		}
		postOrder(node.left, res);
		postOrder(node.right, res);
		res.add(node.data);
	}

	public List<Integer> postOrder(){
		List<Integer> res = new ArrayList<>();
		postOrder(root, res);
		return res;
	}

	private TreeElement find(TreeElement node, int x){
		if(node == null){
			return null;
		}
		if(x == node.data){
			return node;
		} else if (x < node.data){
			return find(node.left, x);
		} else {
			return find(node.right, x);
		}
	}

	public TreeElement find(int x){
		return find(root, x);
	}

	private void mirror(TreeElement node){
		if(node == null){
			return;
		}
		mirror(node.left);
		mirror(node.right);
		TreeElement temp = node.left;
		node.left = node.right;
		node.right = temp;
	}

	public void mirror(){
		mirror(root);
	}

	private int height(TreeElement node){
		if(node == null){
			return 0;
		}
		return Math.max(height(node.left), height(node.right)) +1;

	}
	public int height(){
		return height(root);
	}


	public List<Integer> printBFS(){
		if(root == null){
			return Collections.emptyList();
		}
		List<Integer> res = new ArrayList<>();
		Queue<TreeElement> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()){
			TreeElement node = q.poll();
			res.add(node.data);
			if(node.left != null){
				q.offer(node.left);
			}
			if(node.right != null){
				q.offer(node.right);
			}
		}
		return res;
	}

	private TreeElement leastCommonAncestor(TreeElement node, TreeElement n1, TreeElement n2){
		if((n1.data < node.data) && (n2.data< node.data)){
			return leastCommonAncestor(node.left, n1, n2);
		} else if((n1.data > node.data) && (n2.data > node.data)){
			return leastCommonAncestor(node.right, n1, n2);
		} else {
			return node;
		}
	}

	public TreeElement leastCommonAncestor(TreeElement n1, TreeElement n2){
		return leastCommonAncestor(root, n1, n2);
	}

	private boolean isBST(TreeElement n, Integer min, Integer max){
		if(n == null){
			return true;
		}
		boolean c1 = (min == null) ? true : min < n.data;
		boolean c2 = (max == null) ? true : max > n.data;
		return c1 && c2 && isBST(n.left, min, n.data) && isBST(n.right, n.data, max);
	}

	public boolean isBST(){
		return isBST(root, null, null);
	}

	private int countNodes(TreeElement n){
		if(n == null){
			return 0;
		}
		return countNodes(n.left) + 1 + countNodes(n.right);

	}
	public int countNodes(){
		return countNodes(root);
	}

	private int countDupes(TreeElement n, Integer prevVal){
		if(n == null){
			return 0;
		}
		return countDupes(n.left, n.data) + ((prevVal == null) ? 0 : (n.data == prevVal)? 1:0)
				+ countDupes(n.right, n.data);
	}

	public int countDupes(){
		return countDupes(root, null);
	}

	private TreeElement createBST(int[] arr, int lo, int hi){
		if(lo > hi){
			return null;
		}
		int mid = (lo + hi)/2;
		TreeElement node = new TreeElement(arr[mid]);
		node.left = createBST(arr, lo, mid-1);
		node.right = createBST(arr, mid +1, hi);
		return node;
	}

	public void createBST(int[] arr){
		root = createBST(arr, 0, arr.length-1);
	}

	private void printBoundaryEx(TreeElement n, List<Integer> r, boolean leftB, boolean rightB){
		if(n == null){
			return;
		}
		boolean visited = false;
		if(leftB){
			if(!visited) {
				r.add(n.data);
				visited = true;
			}
		}
		boolean leftCIsLeftB = false;
		boolean rightCIsLeftB = false;
		if(leftB){
			if(n.left != null){
				leftCIsLeftB = true;
			} else {
				rightCIsLeftB = true;
			}
		}

		boolean leftCIsRightB = false;
		boolean rightCIsRightB = false;
		if(rightB){
			if(n.right != null){
				rightCIsRightB = true;
			} else {
				leftCIsRightB = true;
			}
		}

		printBoundaryEx(n.left, r, leftCIsLeftB, leftCIsRightB);

		if((n.left == null) && (n.right == null)){
			if(!visited) {
				r.add(n.data);
				visited = true;
			}
		}

		printBoundaryEx(n.right, r, rightCIsLeftB, rightCIsRightB);

		if(rightB){
			if(!visited) {
				r.add(n.data);
				visited = true;
			}
		}
	}

	public List<Integer> printBoundaryEx(){
		List<Integer> res = new ArrayList<>();
		printBoundaryEx(root, res, true, true);
		return res;
	}

	private List<Integer> arrayToList(int[]arr, int length){
		List<Integer> r = new ArrayList<>();
		for(int i=0; i < length; i++){
			r.add(arr[i]);
		}
		return r;
	}

	private void printAllPaths(List<List<Integer>> r, int[] temp, int level, TreeElement n){
		if(n == null){
			return;
		}
		temp[level] = n.data;
		level++;
		if((n.left == null) && (n.right == null)){
			r.add(arrayToList(temp, level));
			return;
		}
		printAllPaths(r, temp, level, n.left);
		printAllPaths(r, temp, level, n.right);
	}
	public List<List<Integer>> printAllPaths(){
		List<List<Integer>> res = new ArrayList<>();
		int height = height();
		int[] temp = new int[height];
		printAllPaths(res, temp, 0, root);
		return res;
	}

	private void printLongestPath(List<List<Integer>> r, int[] temp, int level, TreeElement n){
		if(n == null){
			return;
		}
		temp[level] = n.data;
		level++;
		if(level == temp.length){
			r.add(arrayToList(temp, level));
			return;
		}
		printLongestPath(r, temp, level, n.left);
		printLongestPath(r, temp, level, n.right);
	}
	public List<List<Integer>> printLongestPath(){
		List<List<Integer>> res = new ArrayList<>();
		int height = height();
		int[] temp = new int[height];
		printLongestPath(res, temp, 0, root);
		return res;
	}

	public int min(TreeElement n){
		while (n.left != null){
			n = n.left;
		}
		return n.data;
	}

	public TreeElement remove(TreeElement n, int del){
		if(n == null){
			return null;
		}
		if(del < n.data){
			n.left = remove(n.left, del);
		} else if (del > n.data){
			n.right = remove(n.right, del);
		} else {
			if(n.left == null){
				return n.right;
			}else if(n.right == null){
				return n.left;
			}
			int min = min(n.right);
			n.data = min;
			n.right = remove(n.right, min);

		}
		return n;
	}

	public TreeElement remove(int del){
		return remove(root, del);
	}










}
