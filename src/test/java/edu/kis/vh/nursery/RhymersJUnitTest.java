package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals("Value should be " + testValue + ", but is " + result, testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertTrue("Value should be " + true + ", but is " + result, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertFalse("Value should be " + false + ", but is " + result, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertFalse("Value should be " + false + ", but is " + result, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertTrue("Value should be " + true + ", but is " + result, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals("Value should be " + EMPTY_STACK_VALUE + ", but is " + result, EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals("Value should be " + testValue + ", but is " + result, testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals("Value should be " + testValue + ", but is " + result, testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals("Value should be " + EMPTY_STACK_VALUE + ", but is " + result, EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals("Value should be " + testValue + ", but is " + result, testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals("Value should be " + EMPTY_STACK_VALUE + ", but is " + result, EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testFIFORhymerCountOut(){
        FIFORhymer rhymer = new FIFORhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();

        Assert.assertEquals("Value should be " + EMPTY_STACK_VALUE + ", but is " + result, EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testReportRejected(){
        HanoiRhymer rhymer = new HanoiRhymer();
        final int STACK_CAPACITY = 12;
        for(int i = 0; i < STACK_CAPACITY; ++i){
            rhymer.countIn(i);
        }

        int result = rhymer.reportRejected();

        Assert.assertEquals("Value should be " + 3 + ", but is " + result, STACK_CAPACITY - 1, result);
    }

}
