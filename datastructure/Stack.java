/******************************************************************************
 *  Purpose: Created Stack and all it's method to perform required operations
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    6-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class Stack<T>{
  private Node<T> first, last;
  int count = 0 ;
  public void push(T data) {
	  Node<T> node = new Node<T>();
	  node.element = data;
	  if(first == null) {
		  first = last = node;
		  count++;
	  }
	  else {
		  last.next = node;
		  last = node;
		  count++;
	  }	  
  }
  public T pop() {
	  // If stack is empty
	  if(first == null) {
		 count = Integer.MIN_VALUE;
		  return null;
		 
	  }
	  // if stack has only one element
	  else 
	  {
		Node<T> current = first;
		if(current.next == null)
		{
			first = null;
			count --; 
			
			return current.element;
		}
		//// if stack has more than one element
		else 
		{			
			  if(current.next != last) {
				  current = current.next;
			  }
			  T data = last.element;
			  current.next = null;
			  last = current;
			  count--;
			  return data;
		}
	  }
		  
	  	  
  }
  // Method to read last element
  public T peek() {
	  if(last == null) {
		  System.out.println("No element in stack");
		  return null;
	  }
	  return last.element;
  }
  // Method to find the size of stack
  public int size() {
	  Node<T> current = first;
	  int size = 0;
	  while(current != null) {
		  current = current.next;
		  size ++;
	  }
	  return size;
  }
  // Method to check stack is empty or not
  public boolean isEmpty() {
	  boolean isEmpty = false;
	  if(first == null) {
		  isEmpty = true;
	  }
	  return isEmpty ;
  }
 // Main method to test Stack class
  public static void main(String[] args) {
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(20);
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.size());
	System.out.println(stack.peek());
 }
}
	