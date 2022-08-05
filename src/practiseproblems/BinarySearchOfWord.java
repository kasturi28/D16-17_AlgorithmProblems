package practiseproblems;

import java.util.Scanner;

public class BinarySearchOfWord {

	/*
	 * Returns index of x if it is present in arr[], else return -1 to show element
	 * is not present in array
	 */
	static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m]);

			/*
			 * Check if x is present at mid
			 */
			if (res == 0)
				return m;

			/*
			 * If x greater, ignore left half
			 */
			if (res > 0)
				l = m + 1;

			/*
			 * If x is smaller, ignore right half
			 */
			else
				r = m - 1;
		}

		return -1;
	}

	/*
	 * Calling main function to search the word in the array
	 */
	public static void main(String[] args) {
		String[] arr = { "abc", "def", "ghi", "jkl" };
		/*
		 * Taking input from the user using scanner function Defining string x as user
		 * input
		 */
		System.out.println("Please enter a string to be checked");
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();
		int result = binarySearch(arr, x);

		if (result == -1)
			System.out.println("Element is not present in the given array");
		else
			System.out.println("Element found at " + "index " + result);
	}

}
