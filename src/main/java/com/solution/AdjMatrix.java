package com.solution;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

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

Author : D Rama Kiron
 
 */
@Slf4j
public class AdjMatrix {
	int vertices;
	int[][] matrix;

	public AdjMatrix(int vertices) {
		this.vertices = vertices;
		matrix = new int[vertices][vertices];
	}

	public void addEdge(int source, int destination) {
		matrix[source][destination] = 1;
	}

	public void printGraph() {
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				log.info(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public List<List<Integer>> allPathsSourceTarget(int[][] graph, int src) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> tmp = new ArrayList<>();
		tmp.add(src);
		helper(res, tmp, graph, 1);
		return res;
	}

	private void helper(List<List<Integer>> res, List<Integer> tmp, int[][] graph, int src) {
		int count = 0;
		for (int next = 0; next < graph[0].length; next++) {
			if (graph[src][next] != 1)
				continue;
			count++;
			tmp.add(next);
			helper(res, tmp, graph, next);
			tmp.remove(tmp.size() - 1);
		}
		if (count == 0) {
			res.add(new ArrayList<>(tmp));
		}
	}

	public void printAllPaths(List<List<Integer>> paths) {
		log.info("All paths in the graph from source to all leaf nodes");
		paths.forEach(path -> log.info(" " + path));

	}
}
