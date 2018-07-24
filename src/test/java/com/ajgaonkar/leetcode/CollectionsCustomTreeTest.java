package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.*;

public class CollectionsCustomTreeTest {
	private static void printCollection(List<Integer> list){
		final StringJoiner sj = new StringJoiner(",");
		list.forEach(i -> sj.add(i.toString()));
		System.out.println(sj.toString());
	}
	private static CollectionsCustomTree createTree(){
		CollectionsCustomTree tree = new CollectionsCustomTree();
		tree.add(6);
		tree.add(4);
		tree.add(2);
		tree.add(1);
		tree.add(3);
		tree.add(5);
		tree.add(8);
		tree.add(10);
		tree.add(7);
		tree.add(9);
		tree.add(11);
		return tree;
	}

	private static CollectionsCustomTree createTree2(){
		CollectionsCustomTree tree = new CollectionsCustomTree();
		tree.add(10);
		tree.add(5);
		tree.add(15);
		tree.add(3);
		tree.add(8);
		tree.add(12);
		tree.add(18);
		return tree;
	}

	@Test
	public void testCreate(){
		CollectionsCustomTree tree = createTree();
		List<Integer> res = tree.inOrder();
		printCollection(res);

		tree.printFunny();
		tree.clearTree();

		List<Integer> res2 = tree.inOrder();
		printCollection(res2);
	}

	@Test
	public void testFind(){
		CollectionsCustomTree tree = createTree();

		assertEquals(null, tree.find(-1));
		assertEquals(null, tree.find(0));
		assertEquals(null, tree.find(12));
		assertEquals(null, tree.find(13));

		assertEquals(1, tree.find(1).getData().intValue());
		assertEquals(2, tree.find(2).getData().intValue());
		assertEquals(5, tree.find(5).getData().intValue());
		assertEquals(9, tree.find(9).getData().intValue());
		assertEquals(10, tree.find(10).getData().intValue());
		assertEquals(11, tree.find(11).getData().intValue());
	}

	@Test
	public void testMirror(){
		CollectionsCustomTree tree = createTree();
		List<Integer> original = tree.inOrder();
		tree.mirror();
		List<Integer> mirror = tree.inOrder();
		assertEquals(original.size(), mirror.size());
		int start = 0;
		int end = original.size()-1;
		while (start < end){
			assertEquals(original.get(start), mirror.get(end));
			start++;
			end--;
		}
	}

	@Test
	public void testOrdering() {
		CollectionsCustomTree tree = createTree();
		assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11), tree.inOrder());
		assertEquals(Arrays.asList(6,4,2,1,3,5,8,7,10,9,11), tree.preOrder());
		assertEquals(Arrays.asList(1,3,2,5,4,7,9,11,10,8,6), tree.postOrder());
	}

	@Test
	public void testHeight() {
		CollectionsCustomTree tree = createTree();
		assertEquals(4, tree.height());
	}

	@Test
	public void testBFS(){
		CollectionsCustomTree tree = createTree();
		assertEquals(Arrays.asList(6,4,8,2,5,7,10,1,3,9,11), tree.printBFS());
	}

	@Test
	public void testCountNodes(){
		CollectionsCustomTree tree = createTree();
		assertEquals(11, tree.countNodes());
	}

	@Test
	public void testLeastCommonAncestor(){
		CollectionsCustomTree tree = createTree();
		assertEquals(tree.find(2), tree.leastCommonAncestor(tree.find(1), tree.find(3)));
		assertEquals(tree.find(4), tree.leastCommonAncestor(tree.find(3), tree.find(5)));
		assertEquals(tree.find(4), tree.leastCommonAncestor(tree.find(2), tree.find(5)));
		assertEquals(tree.find(6), tree.leastCommonAncestor(tree.find(1), tree.find(8)));
		assertEquals(tree.find(6), tree.leastCommonAncestor(tree.find(1), tree.find(11)));
		assertEquals(tree.find(6), tree.leastCommonAncestor(tree.find(4), tree.find(8)));
		assertEquals(tree.find(8), tree.leastCommonAncestor(tree.find(7), tree.find(11)));
		assertEquals(tree.find(8), tree.leastCommonAncestor(tree.find(7), tree.find(10)));
		assertEquals(tree.find(6), tree.leastCommonAncestor(tree.find(4), tree.find(8)));
		assertEquals(tree.find(6), tree.leastCommonAncestor(tree.find(5), tree.find(7)));
		assertEquals(tree.find(6), tree.leastCommonAncestor(tree.find(3), tree.find(9)));
	}

	@Test
	public void testIsBST(){
		CollectionsCustomTree tree1 = createTree();
		assertEquals(true, tree1.isBST());
		tree1.mirror();
		assertEquals(false, tree1.isBST());

		CollectionsCustomTree tree2 = createTree2();
		CollectionsCustomTree.TreeElement t8 = tree2.find(8);
		t8.setRight(new CollectionsCustomTree.TreeElement(11));
		CollectionsCustomTree.TreeElement t12 = tree2.find(12);
		t12.setLeft(new CollectionsCustomTree.TreeElement(9));
		assertEquals(false, tree2.isBST());
	}

	@Test
	public void testCountDupes(){
		CollectionsCustomTree tree = createTree();
		tree.add(1);
		tree.add(5);
		tree.add(7);
		tree.add(9);
		assertEquals(4, tree.countDupes());
	}

	@Test
	public void testCreateBST(){
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11};
		CollectionsCustomTree tree = new CollectionsCustomTree();
		tree.createBST(arr);
		assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11), tree.inOrder());
	}

	@Test
	public void testPrintBoundary() {
		CollectionsCustomTree tree = createTree();
		List<Integer> list = tree.printBoundary();
		//Correct
//		assertEquals(Arrays.asList(6,4,2,1,3,5,7,9,11,10,8), list);
		//InCorrect
		assertEquals(Arrays.asList(6,4,2,1,3,5,7,9,11,8, 10), list);
	}

	@Test
	public void testPrintBoundaryEx() {
		CollectionsCustomTree tree = createTree();
		List<Integer> list = tree.printBoundaryEx();
		assertEquals(Arrays.asList(6,4,2,1,3,5,7,9,11,10,8), list);
	}

	@Test
	public void testPrintPaths() {
		CollectionsCustomTree tree = createTree();
		assertEquals(Arrays.asList(Arrays.asList(6,4,2,1), Arrays.asList(6,4,2,3), Arrays.asList(6,8,10,9), Arrays.asList(6,8,10,11)), tree.printLongestPath());
		assertEquals(Arrays.asList(Arrays.asList(6,4,2,1), Arrays.asList(6,4,2,3), Arrays.asList(6,4,5), Arrays.asList(6,8,7), Arrays.asList(6,8,10,9), Arrays.asList(6,8,10,11)), tree.printAllPaths());
	}
}