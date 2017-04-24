package ch11.exam13;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//Arrays.copyOf
		
		char[] arr2 = (Arrays.copyOf(arr1, arr1.length));
		
		System.out.println(Arrays.toString(arr2));;
		
		//Array.copyOfRange
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//System.arraycopy
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		
	}

}
