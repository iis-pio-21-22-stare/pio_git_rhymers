package edu.kis.vh.nursery;
// alt + strzałka -> sprawne przemieszczanie się pomiędzy plikami w  projekcie
public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countout() {
        while (!callcheck())

            temp.countin(super.countout());

        int ret = temp.countout();

        while (!temp.callcheck())

            countin(temp.countout());

        return ret;
    }
}
