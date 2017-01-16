package com.incture.primefactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Snippet wrote as part of topic double entry booking keeping for Java
 * developers training. Inspired by Uncle Bob.
 * 
 * @author VINU
 * @since December, 2016
 */
public class PrimeFactors {
	/**
	 * This function should return a list factors (prime numbers) for a given
	 * integer
	 */
	public static List<Integer> compute(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int divisor = 2; n > 1; divisor++)
			for (; n % divisor == 0; n /= divisor)
				factors.add(divisor);
		return factors;
	}
}
