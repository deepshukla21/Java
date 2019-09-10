package com.bridgelabz.datastructure;
//class Node<T>{
//	T data;
//	Node<T> next, previous;
//}


public class LinkedList<T>{
		Node<T> first, last;
		
		// **************Adding**************
		// Method to add node in the LinkedList
		public void add(T data) {
			Node<T> node = new Node<T>();
			node.data = data;
			if(first == null) {
				first = last = node;
			}
			else {
				last.next = node;
				node.previous = last;
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
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		// Method to read element last element from Linkedlist
		public T rev_read_element() {
		    return last.data;
		}	

		// **************Searching**************
		// Method to search element from Linkedlist by data
		public  boolean search(T data) {
			boolean element_exist = false;
			Node<T> current = first;
			while(current != null) {
				if(current.data.equals(data)) {
					element_exist = true;
					break;
				}
				current = current.next;
			}
			return element_exist;
		}
		// Method to check if list is empty or not
		public boolean isEmpty() {
			boolean isEmpty = false;
			Node<T> current = first;
			if(current == null) {
				isEmpty = true;
				return isEmpty;
			}
			return isEmpty;
		}
		
   public T readAt(int index) {
       Node<T> node = first;
       for(int i=0;i<index;i++){
           if(node != null) {
               node = node.next;
           } else {
               return null;
           }
       }

       return node.data;
   }		
		
		// **************Deleting by key**************
		// Method to remove element from LinkedList 
		public boolean remove(T data) {
			 boolean isRemoved = false;
			 
			// If element is at first position
			if(first.data.equals(data)) {
				 isRemoved = true;
				 
				 if(this.size() == 1) {
				   first = null;
				   last  = null;
			     } else { 
			       first = first.next;
			     }
		
			     return isRemoved;		     
			}
			
			// If element is at last position
			if(last.data.equals(data)) {
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
				if(current.data.equals(data)) {
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
				if(current.data == data) {
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
			node.data = data;
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
		// Override toString() of Object class to write the LinkedList element in file 
		@Override
		public String toString() {
			// If no element is present in list
			if (first == null) {
				return "";
				}
				String result = ""+ first.data;
				Node<T> current = first;
			// If only one element is present	
			if (current.next == null) {
			    return result = result + " " + current.data;
			}
			current = current.next;

			//1st element after `head`
			result = result + " " + current.data;

			while (current.next != null) {
			    current = current.next;
			    result += " " + current.data;
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
			   if((Integer)current.data > (Integer)index.data){
				  T temp = current.data;
				  current.data = index.data;
				  index.data = temp;					  
			   }
			   index = index.next;
			  }
			  current = current.next;
			 }
			}
		}
		// Method to read element in reverse order
		public void readReverse() {
			if(first == null) {
				System.out.println("List is empty");
				return;
			}
			Node<T> current = last;
			while(current!= null) {
				System.out.print(current.data + " ");
				current = current.previous;
			}
		}

     // Main method to test function of LinkedList class
		public static void main(String[] args) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(40);
			list.add(30);
			list.add(70);
			list.add(90);
			list.add(100);
			list.readReverse();
			
			
		}


	}


