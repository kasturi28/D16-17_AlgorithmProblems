package practiseproblems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeUsingDequeue {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Taking one string from the user using a scanner function
		 * calling isPalindrome method to verify the string is palindrome or not
		 */
		System.out.println("enter a string to be checked");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("String " + s + " is palindrome : " + isPalindrome(s));
		
	}
	
public static boolean isPalindrome(String s) {
        /*
         * defining sequeue as a new dequeue 
         */
        Deque<Character> deque = new ArrayDeque<>();
        
        for(int i = 0; i < s.length(); i++){
		
        /*
         *  convert all characters to lowercase
         */    
            char character = Character.toLowerCase(s.charAt(i));
            
			/*
			 *  if the character is a letter or digit number, then we insert it to the deque
			 */
            if(Character.isLetterOrDigit(character)){
                
                deque.offerLast(character);
            }
        }
        
        boolean stillEqual = true;
        
        while(deque.size() > 1 && stillEqual == true){
            
            char first = deque.peekFirst();
            char last = deque.peekLast();
			
            /** compare the first char with the last char **/
            if(first == last){
                stillEqual = true;
            }else{
                return false;
            }
			
            /** remove first char and last char from the deque after comparision **/
            deque.pollFirst();
            deque.pollLast();
        }
        
        return stillEqual;
        
    }

}
