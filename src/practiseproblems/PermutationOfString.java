package practiseproblems;

public class PermutationOfString {

	/*
	 * Function to print all the permutations of string str
	 */
	static void printPermutn(String str, String ans) {

		/*
		 * If string is empty
		 */
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		/*
		 * If string is not empty
		 */
		for (int i = 0; i < str.length(); i++) {

			/*
			 * ith character of str
			 */
			char ch = str.charAt(i);

			/*
			 *  Rest of the string after excluding
			 *  the ith character
			 */
			String ros = str.substring(0, i) + str.substring(i + 1);

			/*
			 *  Recursive call
			 */
			printPermutn(ros, ans + ch);
		}
	}

	/*
	 * Calling main function for output
	 */
	public static void main(String[] args) {
		String s = "kasturi";
		printPermutn(s, "");
	}

}
