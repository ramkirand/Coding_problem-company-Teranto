package com;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.solution.GeneratePaths;

@SpringBootTest
public class GeneratePathsTest {
	private GeneratePaths generatePaths;
	int graph[][];

	@BeforeAll
	public void init() {
		generatePaths = new GeneratePaths();
		graph = new int[3][3];
	}

	@Test
	public void test1() {
		generatePaths.allPathsSourceTarget(graph);
	}
}
