package practiseproblems;

public class PrimeNumbers {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Calling check method to print the required output
		 */
		check();
	}

	/*
	 * Defing int i , num & empty string primenumbers
	 */
	private static void check() {
		int i = 0;
		int num = 0;
		String primeNumbers = "";
		/*
		 * Taking counter variable checking number's factors if the count is equal to 2
		 * then the number will be appended to the string
		 */
		for (i = 1; i <= 1000; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 1000 are :");
		System.out.println(primeNumbers);
	}

}
