package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LC133_Clone_Graph_2 {
	public static class UndirectedGraphNode {
		int label;
		List<UndirectedGraphNode> neighbors;

		UndirectedGraphNode(int x) {
			label = x;
			neighbors = new ArrayList<UndirectedGraphNode>();
		}
	}

	;

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if (node == null) {
			return null;
		}
		Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();

		UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
		map.put(node, clone);

		Queue<UndirectedGraphNode> q = new LinkedList<>();
		q.offer(node);
		while (!q.isEmpty()){
			UndirectedGraphNode s = q.poll();
			UndirectedGraphNode d = map.get(s);
			for (UndirectedGraphNode child : s.neighbors){
				if(! map.containsKey(child)){
					UndirectedGraphNode cloned = new UndirectedGraphNode(child.label);
					map.put(child, cloned);
					q.offer(child);
				}
				d.neighbors.add(map.get(child));
			}
		}
		return map.get(node);
	}
}
