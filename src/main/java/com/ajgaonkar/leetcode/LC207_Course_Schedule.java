package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//ToDo: Redo
public class LC207_Course_Schedule {
	List<Integer>[] convertToAdjecencyList(int numCourses, int[][] prerequisites){
		List<Integer>[] graph = new ArrayList[numCourses];
		for(int i =0; i< prerequisites.length; ++i){
			int vertex = prerequisites[i][0];
			int edgeVertex = prerequisites[i][1];
			if(graph[vertex] == null){
				graph[vertex] = new ArrayList<>();
			}
			graph[vertex].add(edgeVertex);
			Collections.sort(graph[vertex]);
		}
		return graph;
	}

	private boolean tryToComplete(List<Integer>[] graph, Set<Integer> completed, Set<Integer> inProgress, int current){
		if(completed.contains(current)){
			return true;
		}
		inProgress.add(current);
		if(graph[current] != null){
			List<Integer> dependency =graph[current];
			for(Integer currentDependency : dependency){
				if(completed.contains(currentDependency)){
					continue;
				}
				if(inProgress.contains(currentDependency)){
					return false;
				}
				if(!tryToComplete(graph, completed, inProgress, currentDependency)){
					return false;
				}
			}
		}
		completed.add(current);
		return true;
	}

	private boolean tryToCompleteSerial(int numCourses, List<Integer>[] graph, Set<Integer> completed, Set<Integer> inProgress){
		for(int  i=0; i< numCourses; ++i){
			if(!tryToComplete(graph, completed, inProgress, i)){
				return false;
			}
		}
		return true;
	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		List<Integer>[] graph = convertToAdjecencyList(numCourses, prerequisites);
		Set<Integer> completed = new HashSet<>();
		Set<Integer> inProgress = new HashSet<>();
		return tryToCompleteSerial(numCourses, graph, completed, inProgress);
	}
}
