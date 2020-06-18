package com.solution;

import java.util.ArrayList;
import java.util.List;

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
