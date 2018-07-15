package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

//ToDo: Redo
public class LC133_Clone_Graph {
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
		Set<Integer> seen = new HashSet<>();
		Map<Integer, UndirectedGraphNode> nodes = new HashMap<>();
		Stack<UndirectedGraphNode> stack = new Stack<>();
		stack.push(node);
		while (!stack.isEmpty()) {
			UndirectedGraphNode current = stack.pop();
			seen.add(current.label);

			UndirectedGraphNode clone = null;
			if (nodes.containsKey(current.label)) {
				clone = nodes.get(current.label);
			} else {
				clone = new UndirectedGraphNode(current.label);
				nodes.put(current.label, clone);
			}
			for (UndirectedGraphNode currentNeighbor : current.neighbors) {
				UndirectedGraphNode cloneNeighbor = null;
				if (!nodes.containsKey(currentNeighbor.label)) {
					cloneNeighbor = new UndirectedGraphNode(currentNeighbor.label);
					nodes.put(currentNeighbor.label, cloneNeighbor);
				} else {
					cloneNeighbor = nodes.get(currentNeighbor.label);
				}
				if (!seen.contains(currentNeighbor.label)) {
					stack.push(currentNeighbor);
					seen.add(currentNeighbor.label);
				}
				clone.neighbors.add(cloneNeighbor);
			}
		}
		return nodes.get(node.label);
	}
}
