package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

    DefaultCountingOutRhymer GetStandardRhymer();

    DefaultCountingOutRhymer GetFalseRhymer();

    DefaultCountingOutRhymer GetFIFORhymer();

    DefaultCountingOutRhymer GetHanoiRhymer();

}
// w IntelliJ alt + <- lub -> przemieszcza nas pomiędzy otwartymi obecnie plikami