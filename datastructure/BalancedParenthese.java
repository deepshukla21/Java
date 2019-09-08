package com.bridgelabz.datastructure;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BalancedParenthese {
	public static boolean isMatching(String brackets) {
		Stack<Character> stack = new Stack<Character>(); 
        for (int i = 0; i < brackets.length(); i++){
            char bracket = brackets.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[' || bracket == '<' ) {
                stack.push(bracket);
            }
            else if(bracket == ')' || bracket == '}' || bracket == ']' || bracket == '>') 
            { 
                if(!stack.isEmpty())
            	  stack.pop();
            	else
            	  return false;

            }	
        }
        return stack.isEmpty();
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression you want to check which has parentheses");
		String expression = sc.nextLine();
		if(!(Pattern.matches(".*[\\[\\]\\(\\)\\{\\}\\<\\>].*", expression))){
			System.out.println("Atleast one instance of (, <, {, [ is required in expression");
			return;
		}
		boolean balanced = isMatching(expression);
		if(balanced) {
			System.out.println("Expression is balanced");
		}
		else {
			System.out.println("Expression is not balanced");
		}
		// Closing resource
		try {
			 if(sc != null) {
				sc.close();
				sc = null;
			 }
			}catch(Exception ex) {
			  ex.printStackTrace();
			}
		
	}
	
}
               
