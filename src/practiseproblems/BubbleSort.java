package practiseproblems;
/*
 * In bubble sort algorithm, array is traversed from first element to last element.
 *  Here, current element is compared with the next element. 
 *  If current element is greater than the next element, it is swapped.
 */

public class BubbleSort {
	/**
	 * 
	 * @param arr
	 */
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	/*
	 * Calling main method to define array
	 */
	public static void main(String[] args) {
		int arr[] = { 253, 257, 128, 85, 7, 28, 459, 96 };
		/*
		 * Printing original array
		 */
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);
		/*
		 * Printing the array after bubble sort
		 */
		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
