/******************************************************************************
 *  Purpose: Created Queue using LinkedList and all it's method to perform required operations
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    07-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

class NodeQ<T>{
	T data;
	NodeQ<T> next;
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
	   int size = 0;
	   if(first == null) {
		   return size;
	   }
	   while(first.next != null) {
		   size ++;
		   first = first.next;
	   }
	   return size;
   }
   // Method to display element present in queue
   public void display() {
	   if(first == null) {
		   System.out.println("Stack is empty");
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
 // Main method to test QueueUsingLinkedList class
   public static void main(String[] args) {
	QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();
	queue.enQueue(10);
	queue.enQueue(20);
	queue.enQueue(30);
	queue.enQueue(40);
	queue.display();
	System.out.println(queue.deQueue());
	System.out.println(queue.peek());
	queue.display();
}
   
}
