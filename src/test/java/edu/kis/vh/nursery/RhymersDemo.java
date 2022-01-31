package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	private static final int FIVETEEN = 15;
	private static final int THREE = 3;
	private static final int TWENTY = 20;

	private static void main(String[] args) {
	Rhymersfactory factory = new DefaultRhymersFactory();

		testRhymers(factory);

	}

	private static void testRhymers(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
				factory.GetFIFORhymer(), factory.GetHanoiRhymer()};

		for (int i = 1; i < getFIVETEEN(); i++)
			for (int j = 0; j < getTHREE(); j++)
				rhymers[j].countin(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < getFIVETEEN(); i++)
			rhymers[3].countin(rn.nextInt(getTWENTY()));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callcheck())
				System.out.print(rhymers[i].countout() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportrejected());
	}

	public static int getFIVETEEN() {
		return FIVETEEN;
	}

	public static int getTHREE() {
		return THREE;
	}

	public static int getTWENTY() {
		return TWENTY;
	}
}