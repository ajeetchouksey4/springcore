package com.springcore.stereotype;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println(234);
			//System.out.println(scanner.nextBigInteger().isProbablePrime(1000) ? "prime" : "not prime");
		}catch(Exception e) {
			System.out.println(e.getClass());
		}
	}
}