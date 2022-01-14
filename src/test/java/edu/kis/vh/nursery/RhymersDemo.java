package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

 class RhymersDemo {

	 private static final int FIFTEEN = 15;
	 private static final int THREE = 3;
	 private static final int TWENTY = 20;

	 private static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		
		DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
				factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
		
		for (int i = 1; i < FIFTEEN; i++)
			for (int j = 0; j < THREE; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < FIFTEEN; i++)
			rhymers[THREE].countIn(rn.nextInt(TWENTY));
		
		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[THREE]).reportRejected());
		
	}
	
}