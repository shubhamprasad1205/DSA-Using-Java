package com.demo.array;

import java.util.Arrays;
import java.util.Iterator;

public class Array1D {

	private int[] arr;
	private int count;

	// Default Array
	public Array1D() {
		arr = new int[10];
		count = 0;
	}

	// Parameterized Array
	public Array1D(int[] arr1, int count) {
		arr = arr1;
		this.count = count;
	}

	public Array1D(int size) {
		this.arr = new int[size];

	}

	// Services or Task

	// add into array
	public boolean addInArray(int num) {

		if (count < arr.length) {
			arr[count] = num;
			count++;
			return true;
		}

		return false;
	}

	// add number at given position

	public boolean add(int n, int pos) {
		// check whether position is within limit
		if ((count < arr.length) && (pos < count)) {
			// shift values one location to right from count to position
			// add the number at the position
			for (int i = count; i > pos; i--) {
				arr[i] = arr[i - 1];
			}
			// add x at the position
			arr[pos] = n;
			count++;
			return true;
		} else {
			return false;
		}

	}

	// Reverse Array

	public boolean reverseArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return true;
	}

	// delete from given position
	public boolean deleteByPosition(int pos) {
		// if position is the last element in the array
		if (pos == arr.length - 1) {
			arr[pos] = 0;
			count--;
			return true;
		} else {
			// check whether given position is in limit
			if (pos < count) {
				for (int i = pos; i < count; i++) {
					arr[i] = arr[i + 1];
				}
				count--;
				return true;

			}
			// given position is out of bounds
			return false;
		}

	}

	// search by value
	public int searchByValue(int num) {
		for (int i = 0; i < count; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

	// delete by value

	public boolean deleteByValue(int num) {

		int positonOfThatElement = searchByValue(num);

		if (positonOfThatElement != -1) {
			deleteByPosition(positonOfThatElement);
			return true;
		}

		return false;
	}

	// Rotate the Array by k times using for loop

//	public boolean rotateByFlag(boolean flag, int k) {
//
//		if (flag) {
//			for (int j = 1; j <= k; j++) {
//				// right Rotate
//				int temp = arr[arr.length - 1];
//				for (int i = arr.length - 1; i > 0; i--) {
//					arr[i] = arr[i - 1];
//				}
//				arr[0] = temp;
//			}
//		} else {
//			for (int i = 1; i <= k; i++) {
//				// left rotate
//				int temp = arr[0];
//				for (int j = 0; j < arr.length - 1; j++) {
//					arr[j] = arr[j + 1];
//				}
//				arr[arr.length - 1] = temp;
//			}
//		}
//
//		return true;
//	}

//	Rotate the Array by k times using while loop 

	public boolean rotateByFlag(boolean flag, int k) {
		// {2,3,4,5,6}
		k = k % arr.length;

		if (flag) {
			while (k != 0) {
				// Right Rotation
				int temp = arr[arr.length - 1];

				for (int i = arr.length - 1; i > 0; i--) {
					arr[i] = arr[i - 1];
				}

				arr[0] = temp;
				k--;
			}
			return true;
		} else {
			while (k != 0) {
				// Left Rotation
				int temp = arr[0];

				for (int i = 0; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[arr.length - 1] = temp;
				k--;
			}
			return true;
		}
	}

	// find max element

	public int findMax() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

		}
		return max;
	}

	// Exchange index with value

	public int[] exchangeValueWithIndex() {
		int maxValue = findMax();

		int[] newArr = new int[maxValue + 1];

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			int index = i;

			newArr[value] = index;

		}

		return newArr;
	}

	@Override
	public String toString() {
		return "Array1D [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}

}
