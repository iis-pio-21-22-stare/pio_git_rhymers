package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

 class RhymersDemo {

	 private static final int SIZE = 15;
	 private static final int POSITION = 3;
	 private static final int NEXT_INT = 20;

	 private static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();

		 testRhymers(factory);

	 }

	 private static void testRhymers(RhymersFactory factory) {
		 DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
				 factory.GetFIFORhymer(), factory.GetHanoiRhymer()};

		 for (int i = 1; i < SIZE; i++)
			 for (int j = 0; j < POSITION; j++)
				 rhymers[j].countIn(i);

		 java.util.Random rn = new java.util.Random();
		 for (int i = 1; i < SIZE; i++)
			 rhymers[POSITION].countIn(rn.nextInt(NEXT_INT));

		 for (DefaultCountingOutRhymer rhymer : rhymers) {
			  while (!rhymer.callCheck())
				  System.out.print(rhymer.countOut() + "  ");
			  System.out.println();
		 }

		 System.out.println("total rejected is "
				 + ((HanoiRhymer) rhymers[POSITION]).reportRejected());
	 }

 }