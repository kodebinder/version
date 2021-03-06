package com.company.junit4;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class TestRuleErrorCollector {

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	@Ignore
	public void test() {
		collector.checkThat("a", equalTo("b"));
		collector.checkThat(1, equalTo(2));
		collector.checkThat("c", equalTo("c"));
	}
}
