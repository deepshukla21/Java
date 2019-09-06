/******************************************************************************
 *  Purpose: Created Singly LinkedList and all it's method to perform required operations
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    05-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

class Node<T>{
	T element;
	Node<T> next, previous;
}
public class LinkedList<T>{
	Node<T> first, last;
	
	// **************Adding**************
	// Method to add node in the LinkedList
	public void add(T data) {
		Node<T> node = new Node<T>();
		node.element = data;
		if(first == null) {
			first = last = node;
		}
		else {
			last.next = node;
			last = node;
		}
	}
	// **************Reading**************
	// Method to read element from Linkedlist
	public void read() {
		Node<T> current = first;
		if(current == null)
		{ 
			System.out.println("No elements present in list");
			return;
		}
		//System.out.println(current.element);
		//current = current.next;
		while(current != null) {
			System.out.println(current.element);
			current = current.next;
		}
	}
	// **************Searching**************
	// Method to search element from Linkedlist by data
	public  boolean search(T data) {
		boolean element_exist = false;
		Node<T> current = first;
		while(current != null) {
			if(current.element.equals(data)) {
				element_exist = true;
				break;
			}
			current = current.next;
		}
		return element_exist;
	}
	// Method to check if element is present in list or not
	public boolean isEmpty() {
		boolean isEmpty = true;
		Node<T> current = first;
		while(current != null) {
			isEmpty = false;
			current = current.next;
			
		}
		return isEmpty;
	}
	// **************Deleting by key**************
	// Method to remove element from LinkedList 
	public boolean remove(T data) {
		 boolean isRemoved = false;
		// If element is at first position
		if(first.element.equals(data)) {
			 isRemoved = true;
		     first = first.next;
		     return isRemoved;		     
		}
		
		// If element is at last position
		if(last.element.equals(data)) {
			isRemoved = true;
			Node<T> current = first;
			while(current.next != last) {
				current = current.next;
			}
			last = current;
			current.next = null;
			 return isRemoved;
			
		}
		// If element is present in between first and last
		Node<T> current = first, previous = first;
		while(current != null) {
			if(current.element.equals(data)) {
				 isRemoved = true;
				previous.next = current.next;
				break;
			}
			previous = current;
			current = current.next;
		}
		 return isRemoved;
	}
	// Method to find size of LinkedList
	public int size() {
		int count = 0;
		Node<T> current = first;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	// Method to find the index of element inside LinkedList
	public int index(T data) {
		Node<T> current = first;
		int index = 0;
		while(current != null) {
			if(current.element == data) {
				return index;			
			}
			current = current.next;
			index ++;
		}
		return index;
	}
	// **************Inserting element at specific position**************
	// Method to insert element at specific position in LinkedList 
	public void insertNode(T data, int position) {
		Node<T> node = new Node<T>();
		node.element = data;
		node.next = null;
		if(first == null) {
			//if first is null and position is zero then exit.
			if(position != 0) {
				return;
			}
			else { // node is set to first
				first = node;
			}
		}
		// If first is not null and position is zero
		if(first != null && position == 0) {
			node.next = first;
			first = node;
			return;
		}
		// For position other than zero
		Node<T> current = first;
		Node<T> previous = null;
		int i = 0;
		while(i < position) {
			previous = current;
			current = current.next;
			if(current == null) {
				break;
			}
			i++;
		}
		node.next = current;
		previous.next = node;
	}
	// Overrided toString() of Object class to write the LinkedList element in file 
	@Override
	public String toString() {
		// If no element is present in list
		if (first == null) {
			return "";
			}
			String result = ""+ first.element;
			Node<T> current = first;
		// If only one element is present	
		if (current.next == null) {
		    return result = result + " " + current.element;
		}
		current = current.next;

		//1st element after `head`
		result = result + " " + current.element;

		while (current.next != null) {
		    current = current.next;
		    result += " " + current.element;
		}
		return result;
	}
	// **************Sorting of list**************
	// Method to sort the element of list in ascending order
	public void sort() {
		Node<T> index, current;
		current = first;
		index = null;
		if(current == null) {
			System.out.println("List is empty");
			return;
		}
		else {
		 while(current != null) {
			index = current.next;
		  while(index != null) {
		   if((Integer)current.element > (Integer)index.element){
			  T temp = current.element;
			  current.element = index.element;
			  index.element = temp;					  
		   }
		   index = index.next;
		  }
		  current = current.next;
		 }
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(40);
		list.add(30);
		list.add(70);
		list.add(90);
		list.add(100);
		list.read();
		list.sort();
		list.read();
		
	}



}
