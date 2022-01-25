package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

// Temat: błędy formatowania i konwencji pkt 3
// alt + <- przelacza miedzy kolejnymi otwartymi zakladkami w lewo
// alt + -> przelacza miedzy kolejnymi zakladkami w prawo
public interface RhymersFactory {

    public DefaultCountingOutRhymer getStandardRhymer();

    public DefaultCountingOutRhymer getFalseRhymer();

    public DefaultCountingOutRhymer getFifoRhymer();

    public DefaultCountingOutRhymer getHanoiRhymer();

}
