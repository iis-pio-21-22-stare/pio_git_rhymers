package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

@Test
public void testcountin() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	int testValue = 4;
	rhymer.countin(testValue);

	int result = rhymer.peekaboo();
	Assert.assertEquals(testValue, result);
}

@Test
public void testcallcheck() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	boolean result = rhymer.callcheck();
	Assert.assertEquals(true, result);

	rhymer.countin(888);

	result = rhymer.callcheck();
	Assert.assertEquals(false, result);
}

@Test
public void testisfull() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	final int STACK_CAPACITY = 12;
	for (int i = 0; i < STACK_CAPACITY; i++) {
		boolean result = rhymer.isfull();
		Assert.assertEquals(false, result);
		rhymer.countin(888);
	}

	boolean result = rhymer.isfull();
	Assert.assertEquals(true, result);
}

@Test
public void testpeekaboo() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	final int EMPTY_STACK_VALUE = -1;

	int result = rhymer.peekaboo();
	Assert.assertEquals(EMPTY_STACK_VALUE, result);

	int testValue = 4;
	rhymer.countin(testValue);

	result = rhymer.peekaboo();
	Assert.assertEquals(testValue, result);
	result = rhymer.peekaboo();
	Assert.assertEquals(testValue, result);
}

@Test
public void testcountout() {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	final int EMPTY_STACK_VALUE = -1;

	int result = rhymer.countout();
	Assert.assertEquals(EMPTY_STACK_VALUE, result);

	int testValue = 4;
	rhymer.countin(testValue);

	result = rhymer.countout();
	Assert.assertEquals(testValue, result);
	result = rhymer.countout();
	Assert.assertEquals(EMPTY_STACK_VALUE, result);
}

}
