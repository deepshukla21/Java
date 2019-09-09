package com.bridgelabz.datastructure;

public class Stack<T> {
	  int count = 0 ;
	  LinkedList<T> LL = new LinkedList<T>();
	  
	  //Method to push into the stack
	  public boolean push(T data) {
	      this.LL.add(data);
	      return true;
	  }
	  
	  //Method to peek into the stack
	  public T peek() {
	      T element;
	      element = this.LL.rev_read_element();
	      return element;
	   }
	   
	  //Method to pop from the stack
	  public T pop() {
	      T element;
	      element = this.LL.rev_read_element();
	      if(this.LL.remove(element) == true)
	        return element;
	      else
	        return null;
	      
	  }  
	 
	  // Method to find the size of stack
	  public int size() {
	     return LL.size();
	  }

	  // Method to check stack is empty or not
	  public boolean isEmpty() {
	     return LL.isEmpty();
	  }
	}

