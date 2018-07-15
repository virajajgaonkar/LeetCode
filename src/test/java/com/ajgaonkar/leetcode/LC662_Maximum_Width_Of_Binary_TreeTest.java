package com.ajgaonkar.leetcode;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class LC662_Maximum_Width_Of_Binary_TreeTest {
	LC662_Maximum_Width_Of_Binary_Tree test = new LC662_Maximum_Width_Of_Binary_Tree();
	@Test
	public void test(){
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n1 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(1);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n2 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(3);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n3 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(2);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n4 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(5);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n5 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(3);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n6 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(9);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		assertEquals(4, test.widthOfBinaryTree(n1));
	}

	@Test
	public void test2(){
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n1 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(1);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n2 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(3);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n3 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(5);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n4 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(3);
		n1.left = n2;
		n2.left = n3;
		n2.right = n4;
		assertEquals(2, test.widthOfBinaryTree(n1));
	}

	@Test
	public void test3(){
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n1 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(1);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n2 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(3);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n3 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(2);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n4 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(5);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		assertEquals(2, test.widthOfBinaryTree(n1));
	}

	@Test
	public void test4(){
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n1 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(1);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n2 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(3);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n3 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(2);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n4 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(5);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n5 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(9);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n6 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(6);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n7 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n3.right = n5;
		n4.left = n6;
		n5.right = n7;
		assertEquals(8, test.widthOfBinaryTree(n1));
	}

	@Test
	public void test5(){
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n1 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(1);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n2 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(3);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n3 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(2);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n4 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(5);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n5 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(9);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n6 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(6);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n7 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(7);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n8 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(7);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n9 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(7);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n10 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(7);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n11 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(1);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n12 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(3);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n13 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(2);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n14 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(5);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n15 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(9);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n16 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(6);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n17 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(7);
		LC662_Maximum_Width_Of_Binary_Tree.TreeNode n18 = new LC662_Maximum_Width_Of_Binary_Tree.TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right= n5;
		n3.left = n6;
		n3.right = n7;

		n5.right = n8;

		n8.left = n9;
		n8.right = n10;

		n9.left = n11;
		n9.right = n12;

		n10.left = n13;
		n10.right = n14;

		n11.left = n15;
		n12.left = n16;

		n13.right = n17;
		n14.right = n18;


		assertEquals(8, test.widthOfBinaryTree(n1));
	}
}