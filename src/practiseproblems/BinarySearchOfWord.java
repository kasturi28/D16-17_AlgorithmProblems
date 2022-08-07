package practiseproblems;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchOfWord {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * import scanner function to take inputs from the user for number of words i.e.
		 * n & words
		 */
		Scanner sc = new Scanner(System.in);
		int i;

		System.out.println("Enter number of words you wish to input: ");
		int n = sc.nextInt();
		/*
		 * Defining words as a array to store user input words
		 */
		String[] words = new String[n];

		System.out.println("Enter the words");
		for (i = 0; i < words.length; i++) {
			System.out.print("WORD " + (i + 1) + ": ");
			words[i] = sc.next();
		}
		/*
		 * Defining word as a user input to search the word by using scanner
		 */
		System.out.println("enter the word you want to search for");
		String word = sc.next();
		/*
		 * sorting the array 'words' Defining variable as index & search the word from
		 * the array
		 */
		Arrays.sort(words);

		int index = Arrays.binarySearch(words, word);

		if (index < words.length && index >= 0) {
			System.out.println(word + " is present at index  " + index);
		} else {
			System.out.println("The word is not present in the list!!!!");
		}

	}
}
