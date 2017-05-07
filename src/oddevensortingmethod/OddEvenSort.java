package oddevensortingmethod;

import java.io.IOException;

public class OddEvenSort {

	private static int[] oddEvenSort(int[] array) {

		log("Before sort: ", array);

		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i += 2) {
				if (array[i] > array[i + 1]) {
					swap(array, i);
					sorted = false;
				}
				log("Even phase :", array);
			}
			for (int i = 1; i < array.length - 1; i += 2) {
				if (array[i] > array[i + 1]) {
					swap(array, i);
					sorted = false;
				}
				log("Odd phase :", array);
			}
		}
		return array;
	}

	public static void main(String[] args) throws IOException {
		int[] array = {10,8,6,4,2,9,7,5,3,1};
		long startTime = System.nanoTime();
		array = oddEvenSort(array);
		log("After sort: ", array);
		long totalTime = System.nanoTime() - startTime;
		System.out.println("Total Runtime in nanoseconds : " + totalTime);
	}

	private static void swap(int [] array, int i){
		int temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}

	private static void log (String result, int [] array){
		System.out.print(result);
		for(int x = 0; x < array.length; x++) {
			System.out.print( " " + array[x]);     
		}
		System.out.println();
	}
}