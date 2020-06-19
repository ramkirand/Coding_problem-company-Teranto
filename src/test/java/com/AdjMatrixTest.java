package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.solution.AdjMatrix;

public class AdjMatrixTest {
	private AdjMatrix adjMatrix;
	private int vertices;
	private int[][] graph;
	private int source;

	
	@BeforeEach
	public void init() {
		vertices = 8;
		adjMatrix = new AdjMatrix(vertices);
		graph = new int[vertices + 1][vertices + 1];
		source = 1;
		graph[1][2] = 1;
		graph[2][6] = 1;
		graph[1][3] = 1;
		graph[3][6] = 1;
		graph[1][4] = 1;
		graph[4][7] = 1;
		graph[1][5] = 1;
		graph[5][8] = 1;
		graph[4][8] = 1;
		graph[3][7] = 1;
	}

	@Test
	public void shouldGenerateAllPaths() {
		List<List<Integer>> paths = adjMatrix.allPathsSourceTarget(graph, source);
		adjMatrix.printAllPaths(paths);
		System.out.println();
		assertTrue(paths.size() != 0);
		
	}
}
