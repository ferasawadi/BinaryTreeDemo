package com.yafatek;public class CatalanNumbersBST {	public static void main(String[] args) {		// Call The Method.		System.out.println(howManyTrees(0));	}	private static int howManyTrees(int data) {		if (data <= 1) return 1;		int result = 0;		for (int i = 0; i < data; i++) {			for (int j = 0; j <= i; j++) {				result += howManyTrees(i) * howManyTrees(data - j - 1);			}		}		return result;	}}