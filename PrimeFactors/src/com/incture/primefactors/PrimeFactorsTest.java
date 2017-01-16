package com.incture.primefactors;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static com.incture.primefactors.PrimeFactors.compute;

import org.junit.Test;

/**
 * This test class is to validate its features in PrimeFactors class works!
 */
public class PrimeFactorsTest {
	/**
	 * Important point here is 1. Write the one test first, 2. Execute that test
	 * and fail, 3. Then write minimal implement code to pass that test, 4.
	 * Re-factor. Keep repeating all 4.
	 */
	@Test
	public void testCompute() {
		assertEquals(asList(), compute(1));
		assertEquals(asList(2), compute(2));
		assertEquals(asList(3), compute(3));
		assertEquals(asList(2, 2), compute(4));
		assertEquals(asList(5), compute(5));
		assertEquals(asList(2, 3), compute(6));
		assertEquals(asList(7), compute(7));
		assertEquals(asList(2, 2, 2), compute(8));
		assertEquals(asList(3, 3), compute(9));
		assertEquals(asList(2, 5), compute(10));
		assertEquals(asList(11), compute(11));
		assertEquals(asList(2, 2, 3), compute(12));
		assertEquals(asList(2, 2, 3, 5, 11, 19), compute(2 * 2 * 3 * 5 * 11 * 19));
	}
}