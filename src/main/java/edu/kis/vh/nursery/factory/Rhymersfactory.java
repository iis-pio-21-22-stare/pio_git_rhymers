package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

    defaultCountingOutRhymer GetStandardRhymer();

    defaultCountingOutRhymer GetFalseRhymer();

    defaultCountingOutRhymer GetFIFORhymer();

    defaultCountingOutRhymer GetHanoiRhymer();

}
// w IntelliJ alt + <- lub -> przemieszcza nas pomiędzy otwartymi obecnie plikami