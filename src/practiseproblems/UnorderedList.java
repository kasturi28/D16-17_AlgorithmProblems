package practiseproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UnorderedList {

	public static void main(String[] args) {

		String str = "TODAY IS MONDAY";

		String[] words = str.split(" ");

		List<String> list = Arrays.asList(words);

		Collections.sort(list);

		System.out.println(list);

		System.out.println("Enter a word to be searched in the list");

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		if (list.contains(input)) {

			int index = Collections.binarySearch(list, input);

			System.out.println("The element is present at index  " + index);
			
			List modifiableList = new ArrayList(Arrays.asList(words));
			
			System.out.println(modifiableList.remove(input) + "  remove flag");
			
			System.out.println(" collcetion "+ modifiableList); 
			
			System.out.println("Element removed from the list as instructed in the program...");
			
		}else {
			
			System.out.println("The element is not present in the list...");
			
			List<String> arraylist = new ArrayList<>(list);

	        arraylist.add(input);

	        System.out.println(arraylist);
	        
	        System.out.println("Element added in the list as instructed in the program...");
		}

	}
}
