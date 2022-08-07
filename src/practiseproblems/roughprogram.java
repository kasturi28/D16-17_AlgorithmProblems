package practiseproblems;

import java.util.Arrays;
import java.util.Scanner;

public class roughprogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;

		System.out.println("Enter number of words you wish to input: ");
		int n = sc.nextInt();

		String[] words = new String[n];

		System.out.println("Enter the words");
		for (i = 0; i < words.length; i++) {
			System.out.print("WORD " + (i + 1) + ": ");
			words[i] = sc.next();
		}

		System.out.println("enter the word you want to search for");
		String word = sc.next();

		Arrays.sort(words);

		int index = Arrays.binarySearch(words, word);

		if (index <= i - 1 && index > 0 ) {
			System.out.println(word + " is present at index  " + index);
		} else {
			System.out.println("The word is not present in the list!!!!");
		}

	}

}
