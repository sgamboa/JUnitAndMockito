package com.testing.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;

	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_First2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_FirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_NonPosition() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}

	@Test
	public void testTruncateAInFirst2Positions_ThirdPosition() {
		assertEquals("CDAF", helper.truncateAInFirst2Positions("CDAF"));
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicNegative() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicPositive() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
