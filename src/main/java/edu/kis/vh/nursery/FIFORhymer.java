package edu.kis.vh.nursery;

/**
 *  counting out class
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    public final  DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();


    /**
     * @return empty stack value
     */
    @Override
    public int countOut() {
        while (!callCheck())

            rhymer.countIn(super.countOut());

        int ret = rhymer.countOut();

        while (!rhymer.callCheck())

            countIn(rhymer.countOut());

        return ret;
    }
}
