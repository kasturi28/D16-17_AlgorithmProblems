package practiseproblems;

import java.util.Stack;

/**
 * 
 * @author kastu
 *
 */
public class BalancedParanthesis {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Taking string to display the expression Calling isBalance method to verify
		 * the expression is balanced or not
		 */
		String exp1 = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		System.out.println("Expression " + exp1 + " isBalance : " + isBalance(exp1));
	}

	public static boolean isBalance(String exprssion) {
		/*
		 * Defining stk as a stack and checking opening & closing bracket codition if
		 * the opening bracket is taken then it will be added to stack & then after
		 * closing bracket is taken then the opening bracket will be removed from the
		 * stack
		 */
		Stack<Character> stk = new Stack<Character>();
		if (exprssion == null || exprssion.length() == 0) {
			return false;
		} else {
			for (int i = 0; i < exprssion.length(); i++) {

				if (exprssion.charAt(i) == '(' || exprssion.charAt(i) == '{' || exprssion.charAt(i) == '[') {
					stk.push(exprssion.charAt(i));
				} else if (exprssion.charAt(i) == ')') {
					if (!stk.isEmpty() && stk.peek() == '(') {
						stk.pop();
					} else {
						return false;
					}
				} else if (exprssion.charAt(i) == ']') {
					if (!stk.isEmpty() && stk.peek() == '[') {
						stk.pop();
					} else {
						return false;
					}
				} else if (exprssion.charAt(i) == '}') {
					if (!stk.isEmpty() && stk.peek() == '{') {
						stk.pop();
					} else {
						return false;
					}
				}
			}

			/*
			 * if stack is empty finally , it means symbol is balance in expression
			 */
			if (stk.isEmpty()) {
				return true;
			} else {
				return false;
			}
		}
	}
}
