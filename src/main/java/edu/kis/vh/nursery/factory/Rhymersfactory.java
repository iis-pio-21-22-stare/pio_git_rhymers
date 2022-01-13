package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

    DefaultCountingOutRhymer GetStandardRhymer();

    DefaultCountingOutRhymer GetFalseRhymer();

    DefaultCountingOutRhymer GetFIFORhymer();

    DefaultCountingOutRhymer GetHanoiRhymer();

}

// połączenie klawiszy alt + (strzałka) służy szybkim przełączaniu się
//pomiędzy otwartmi kartami programów w środowisku