package com.testing.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	// Testing Arrays.sort
	@Test
	public void testArraySort_Random() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);

		// assetEquals in Arrays compare if are the same arrays, not the content
	}

}
