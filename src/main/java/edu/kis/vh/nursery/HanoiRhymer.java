package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * counting out class
     */

    int totalRejected = 0;

    public int reportRejected() {
        /**
         * return total rejected int
         */
        return totalRejected;
    }

    public void countIn(int in) {

        /**
         * counting total rejected
         * @param in input number to count in
         */

        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
// alt + <- / -> przełacza miedzy plikami otwartymi w podglądzie