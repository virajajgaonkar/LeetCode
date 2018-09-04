package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC138_Copy_List_With_Random_Pointer {
	class RandomListNode {
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	}

	;

	public RandomListNode copyRandomList(RandomListNode head) {
		if(head == null){
			return null;
		}
		Map<RandomListNode, RandomListNode> map = new HashMap<>();

		RandomListNode c = head;
		RandomListNode prev = null;

		while (c != null){
			RandomListNode dest = new RandomListNode(c.label);
			if(prev != null) {
				prev.next = dest;
			}
			map.put(c, dest);
			prev = dest;
			c = c.next;
		}

		c = head;
		while (c != null){
			if(c.random != null){
				map.get(c).random = map.get(c);
			}
			c = c.next;
		}
		return map.get(head);
	}
}
