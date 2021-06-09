package com.springcore.stereotype;

import java.math.BigInteger;

public class Test1 {
	public static void main(String[] args) {
		boolean ispr= isPrime(BigInteger.valueOf(17));
		System.out.println(ispr);
	}

	private static boolean isPrime(BigInteger eval_number) {
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(eval_number) < 0; i = i.add(BigInteger.ONE)) {
			if (eval_number.mod(i).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		return true;
	}
}
