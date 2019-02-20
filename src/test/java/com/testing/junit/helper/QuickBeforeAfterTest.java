package com.testing.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}

	@Before
	public void setup() {
		System.out.println("Before each one of the test");
	}

	@Test
	public void test1() {
		System.out.println("test1 exeuted");
	}

	@Test
	public void test2() {
		System.out.println("test2 exeuted");
	}

	@After
	public void after() {
		System.out.println("After each one of the test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
