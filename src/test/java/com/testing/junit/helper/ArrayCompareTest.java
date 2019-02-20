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

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

	// depends on the server where this is running
	@Test(timeout = 100)
	public void testSort_Performance() {
		int array[] = { 12, 23, 4 };
		for (int i = 1; i <= 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
