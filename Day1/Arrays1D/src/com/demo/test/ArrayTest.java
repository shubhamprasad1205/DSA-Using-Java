package com.demo.test;

import java.util.Arrays;

import com.demo.array.Array1D;

public class ArrayTest {

	public static void main(String[] args) {

		Array1D obj1 = new Array1D();

		obj1.addInArray(12);
		obj1.addInArray(22);
		obj1.addInArray(78);
		obj1.addInArray(64);
		obj1.addInArray(86);

		System.out.println("Size 10 Array with 5 values");
		System.out.println(obj1 + "\n\n");

		int[] arr = { 10, 3, 6, 8, 11 };

		Array1D obj2 = new Array1D(arr, 6);
		System.out.println(obj2);

		System.out.println("\"Reverse Array = \"");
		obj2.reverseArray(arr);
		System.out.println(obj2 + "\n");

		obj2.rotateByFlag(true, 1);
		System.out.println(obj2 + "\n");

		System.out.println("Right Rotation");
		obj2.rotateByFlag(true, 1);
		System.out.println(obj2 + "\n");

		System.out.println("Left Rotation");
		obj2.rotateByFlag(false, 1);
		System.out.println(obj2 + "\n");

		int max = obj2.findMax();
		System.out.println("Maximun no is = " + max + "\n");

		boolean ans = obj2.deleteByPosition(3);
		System.out.println(ans ? "Delete Success " : " Element Not found ");
		System.out.println(obj2 + "\n");

		boolean deleted = obj2.deleteByValue(8);
		System.out.println(deleted ? "Delete Success " : " Element Not found ");
		System.out.println(obj2 + "\n");

		int[] exchangeValueIndexArr = obj2.exchangeValueWithIndex();
		System.out.println(Arrays.toString(exchangeValueIndexArr) + "\n");

	}

}
