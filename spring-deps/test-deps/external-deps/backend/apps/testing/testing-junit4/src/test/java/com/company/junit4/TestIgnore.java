package com.company.junit4;

import org.junit.Ignore;
import org.junit.Test;

public class TestIgnore {

	@Ignore
	@Test
	public void test2() {
		// This test will be skipped
	}

}
