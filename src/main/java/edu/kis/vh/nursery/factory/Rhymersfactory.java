package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

// Temat: błędy formatowania i konwencji pkt 3
// alt + <- przelacza miedzy kolejnymi otwartymi zakladkami w lewo
// alt + -> przelacza miedzy kolejnymi zakladkami w prawo
public interface Rhymersfactory {

    public defaultCountingOutRhymer GetStandardRhymer();

    public defaultCountingOutRhymer GetFalseRhymer();

    public defaultCountingOutRhymer GetFIFORhymer();

    public defaultCountingOutRhymer GetHanoiRhymer();

}
