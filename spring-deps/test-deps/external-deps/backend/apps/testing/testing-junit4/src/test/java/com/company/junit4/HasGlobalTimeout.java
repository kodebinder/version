package com.company.junit4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HasGlobalTimeout {
	public static String log;
	private final CountDownLatch latch = new CountDownLatch(1);

	@Rule
	public Timeout globalTimeout = Timeout.seconds(10); // 10 seconds max per
														// method tested

	@Test
	@Ignore
	public void testSleepForTooLong() throws Exception {
		log += "ran1";
		TimeUnit.SECONDS.sleep(100); // sleep for 100 seconds
	}

	@Test
	@Ignore
	public void testBlockForever() throws Exception {
		log += "ran2";
		latch.await(); // will block
	}
}
