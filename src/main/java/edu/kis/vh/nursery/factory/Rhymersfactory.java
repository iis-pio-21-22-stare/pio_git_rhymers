package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

    defaultCountingOutRhymer GetStandardRhymer();

    defaultCountingOutRhymer GetFalseRhymer();

    defaultCountingOutRhymer GetFIFORhymer();

    defaultCountingOutRhymer GetHanoiRhymer();

}

// połączenie klawiszy alt + (strzałka) służy szybkim przełączaniu się
//pomiędzy otwartmi kartami programów w środowisku