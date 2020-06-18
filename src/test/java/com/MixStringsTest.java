package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.solution.MixStrings;

@SpringBootTest
public class MixStringsTest {
	private MixStrings mixStrings;

	@BeforeEach
	public void init() {
		mixStrings = new MixStrings();
	}

	@Test
	public void shouldReturnEmptyEmptyStrings() {
		String str1 = "";
		String str2 = "";
		String str3 = "";
		assertTrue(mixStrings.mixedString(str1, str2, str3).isEmpty());
	}

	@Test
	public void shouldReturnMixedStrings() {
		String str1 = "123";
		String str2 = "abc";
		String str3 = "#%&";
		assertTrue(mixStrings.mixedString(str1, str2, str3).equals("1a#2b%3c&"));
	}
}
