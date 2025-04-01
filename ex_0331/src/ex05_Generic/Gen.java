package ex05_Generic;

public class Gen <T>{
	public <T>void printArr(T[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.printf(" "+arr[i]);
		}
		System.out.println();
	}
}
