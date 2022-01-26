package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	public static final int EEE = 888;
	public static final int TWELVE = 12;
	public static final int FOUR = 4;

	@Test
private void testcountin() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	int testValue = FOUR;
	rhymer.countin(testValue);

	int result = rhymer.peekaboo();
	Assert.assertEquals(testValue, result);
}

@Test
private void testcallcheck() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	boolean result = rhymer.callcheck();
	Assert.assertEquals(true, result);

	rhymer.countin(EEE);

	result = rhymer.callcheck();
	Assert.assertEquals(false, result);
}

@Test
private void testisfull() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	final int STACK_CAPACITY = TWELVE;
	for (int i = 0; i < STACK_CAPACITY; i++) {
		boolean result = rhymer.isfull();
		Assert.assertEquals(false, result);
		rhymer.countin(EEE);
	}

	boolean result = rhymer.isfull();
	Assert.assertEquals(true, result);
}

@Test
private void testpeekaboo() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	final int EMPTY_STACK_VALUE = -1;

	int result = rhymer.peekaboo();
	Assert.assertEquals(EMPTY_STACK_VALUE, result);

	int testValue = FOUR;
	rhymer.countin(testValue);

	result = rhymer.peekaboo();
	Assert.assertEquals(testValue, result);
	result = rhymer.peekaboo();
	Assert.assertEquals(testValue, result);
}

@Test
private void testcountout() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	final int EMPTY_STACK_VALUE = -1;

	int result = rhymer.countout();
	Assert.assertEquals(EMPTY_STACK_VALUE, result);

	int testValue = FOUR;
	rhymer.countin(testValue);

	result = rhymer.countout();
	Assert.assertEquals(testValue, result);
	result = rhymer.countout();
	Assert.assertEquals(EMPTY_STACK_VALUE, result);
}

}
