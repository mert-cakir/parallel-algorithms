package bubblesortingmethod;

class BubbleSort {

	public static void main(String []args) {

		int[] array = {10,8,6,4,2,9,7,5,3,1};
		sort(array);

	}

	private static void sort(int [] array){

		long startTime = System.nanoTime();
		log("Before sort :", array);
		System.out.println("||------------------------------||");
		int remaining = array.length - 1;

		for(int x = 0; x < (array.length-1); x++) {
			for(int y = 0; y < (remaining); y++) {
				int tmp;
				if ( array[y] > array[y+1] ) {
					tmp =  array[y+1]; 
					array[y+1] = array[y];
					array[y] = tmp;
				}
			}
			remaining--;
			log((x+1)+"-th order  :", array);
		}

		System.out.println("||------------------------------||");
		log("After sort  :", array);

		long totalTime = System.nanoTime() - startTime;
		System.out.println("Total Runtime in nanoseconds : " + totalTime);

	}

	private static void log (String result, int [] array){
		System.out.print(result);
		for(int x = 0; x < array.length; x++) {
			System.out.print( " " + array[x]);     
		}
		System.out.println();
	}
}