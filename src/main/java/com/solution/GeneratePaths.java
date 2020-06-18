package com.solution;

import java.util.ArrayList;
import java.util.List;

/*
 Question 1
 
You are given a DAG (Directed Acyclic Graph) which may be disjointed (this
represents courses in a university that must be taken in a particular order, but
may represent different streams). For each such graph, generate all possible
paths that originate from a particular node. For example, in the following graph
assume that all edges point downward
You should generate following path from “1”
● 1 -> 2 -> 6
● 1 -> 3 -> 7
● 1 -> 3 -> 6
● 1 -> 4 -> 7
● 1 -> 4 -> 8
● 1 -> 5 -> 8
For extra credit
● Add procedure to create the nodes & its linkage in a configurable way.

 */
public class GeneratePaths {

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> tmp = new ArrayList<>();
		tmp.add(0);
		helper(res, tmp, graph, 0);
		return res;
	}

	private void helper(List<List<Integer>> res, List<Integer> tmp, int[][] graph, int src) {

		if (src == graph.length - 1) {
			res.add(new ArrayList<>(tmp));
		}

		for (int next : graph[src]) {
			tmp.add(next);
			helper(res, tmp, graph, next);
			tmp.remove(tmp.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[][] graph = { { 1, 2 }, { 3 }, { 3 }, {} };
		GeneratePaths g = new GeneratePaths();
		System.out.println("All paths of the DAG:");
		g.allPathsSourceTarget(graph).forEach(a -> System.out.println(a));

	}

}
