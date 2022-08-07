package practiseproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author kastu
 *
 */
public class AnagramDetection {
	/*
	 * Defining isAnagram method to check twonstrings are anagrams or not
	 */
	static void isAnagram(String s1, String s2) {

		boolean status = true;
		/*
		 * if the length of two strings are not equal then return false
		 */
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			/*
			 * sorting string into characters & compare if equal then string are anagrams
			 */
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	/*
	 * calling main function to get the output Taking strings as input from the user
	 * using scanner function
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		isAnagram(s1, s2);
	}

}
