/******************************************************************************
 *  Purpose:  To check if arithmetic expression is balanced or not using stack
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    6-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

import java.util.Scanner;

public class BalancedParenthese {
	public static boolean isMatching(String brackets) {
		Stack<Character> stack = new Stack<Character>(); 
        for (int i = 0; i < brackets.length(); i++){
            char bracket = brackets.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            }
            else if(bracket == ')' || bracket == '}' || bracket == ']') 
            { 
            	stack.pop();
            }	
        }
        return stack.isEmpty();
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression you want to check which has parentheses");
		String expression = sc.nextLine();
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
               