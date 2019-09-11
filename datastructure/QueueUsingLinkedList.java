package com.bridgelabz.datastructure;


class NodeQ<T>{
	T data;
	NodeQ<T> next, previous;
}
public class QueueUsingLinkedList<T> {
    NodeQ<T> first, last;
   
   // Method to add element in queue
   public void enQueue(T data) {
	   NodeQ<T> node = new NodeQ<T>();
	   node.data = data;
	   if(first == null) {
		   first = last = node;
	   }
	   else {
		   last.next = node;
		   last = node;
	   }
   }
   // Method to check if queue is empty or not
   public boolean isEmpty(){
	   return (first == null);
   }
   // Method to remove element in queue
   public T deQueue(){
	   if(first == null) {
		   throw new NullPointerException("Queue is empty");
	   }
	   NodeQ<T> current = first;
	   first = first.next;
	   return current.data; 
   }
   // Method to check number of elements in queue
   public int size() {
	   int count = 0;
		NodeQ<T> current = first;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
   }
   // Method to display element present in queue
   public void display() {
	   if(first == null) {
		   System.out.println("Queue is empty");
		   return;
	   }
	   NodeQ<T> current = first;
	   System.out.print(first.data + " ");
	   current = first.next;
	   while(current != null) {
		  System.out.print(current.data + " ");
		  current = current.next;
	   }
	   System.out.println();
   }
   // Method to get first element in queue
   public T peek() {
	   if(first == null) {
		  throw new NullPointerException("Queue is empty"); 
	   }
	   return first.data;
   }
   
   public void addFront(T data) {
	   NodeQ<T> node = new NodeQ<T>();
	   NodeQ<T> current;
	   node.data = data;
	   if(first == null) {
        first  = last =   node;
	   }
	   else {
		   current = first;
		   current.previous = node;
		   first = node;
		   first.next = current;
	   }
	 	  
   }
   public T removeLast() {
	   if(first == null) {
		   throw new NullPointerException("Queue is empty");
	   }
	   NodeQ<T> current = first; 
	   NodeQ<T>  previous =  null;
		while(current.next != null) {
			previous = current;
			current = current.next;
	 }
		T data = current.data;
		current = previous;
		current.next = null;
		 return data;
		
  }
 // Main method to test QueueUsingLinkedList class
   public static void main(String[] args) {
	QueueUsingLinkedList<Integer> queue1 = new QueueUsingLinkedList<Integer>();
	queue1.addFront(10);
	queue1.addFront(20);
	queue1.enQueue(30);
	//queue1.enQueue(20);
	queue1.addFront(10);
	queue1.display();
	queue1.removeLast();
	queue1.display();
	
	
	}
}