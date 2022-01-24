package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	private static final int TEST_VALUE = 4;
	private static final int COUNT_IT = 888;
	private static final int STACK_CAPACITY = 12;
	private static final int EMPTY_STACK_VALUE = -1;

	@Test
	private void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = TEST_VALUE;
		rhymer.countIn(testValue);

		final int result = rhymer.lastElement();

		Assert.assertEquals(testValue, result);
	}

	@Test
	private void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(COUNT_IT);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	private void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = RhymersJUnitTest.STACK_CAPACITY;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(COUNT_IT);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	private void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.lastElement();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int testValue = TEST_VALUE;
		rhymer.countIn(testValue);

		result = rhymer.lastElement();
		Assert.assertEquals(testValue, result);
		result = rhymer.lastElement();
		Assert.assertEquals(testValue, result);
	}

	@Test
	private void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = RhymersJUnitTest.EMPTY_STACK_VALUE;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int testValue = RhymersJUnitTest.TEST_VALUE;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
