/******************************************************************************
 *  Purpose: Created Queue using LinkedList and all it's method to perform required operations
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    07-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

class NodeQ<T>{
	T data;
	NodeQ<T> next, previous;
}
public class QueueUsingLinkedList<T> {
    NodeQ<T> first, last;
   
   // Method to add element in queue
   public void enqueue(T data) {
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

   //Method to get element at particular index.
   public T readAt(int index) {
       NodeQ<T> node = first;
       for(int i=0;i<index;i++){
           if(node != null) {
               node = node.next;
           } else {
               return null;
           }
       }

       return node.data;
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
   public void displayDeque() {
	   if(first == null) {
		   System.out.println("Queue is empty");
		   return;
	   }
	   NodeQ<T> current = first;
	   System.out.print(first.data + " ");
	   current = first.previous;
	   while(current != null) {
		  System.out.print(current.data + " ");
		  current = current.previous;
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
  // Method to add element at front
   public void addFront(T data) {
	   NodeQ<T> node = new NodeQ<T>();
	   node.data = data;
	   if(first == null) {
        first  =   node;
	   }
	   else {
		   first.next = node;
		   node.previous = first;
		   first = node;
	   }
	  // first = node;	  
   }
   // Method to remove element from front
   public T removeFront() {
	   if(first == null) {
		   throw new NullPointerException("Dequeue is empty");
	   }
	   NodeQ<T> current = first;
	   first = first.previous;
	   return current.data;
   }
 // Main method to test QueueUsingLinkedList class
   public static void main(String[] args) {
	QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();
	QueueUsingLinkedList<Integer> queue1 = new QueueUsingLinkedList<Integer>();
	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(30);
	queue.enqueue(40);
	queue.display();
	System.out.println(queue.deQueue());
	System.out.println(queue.peek());
	System.out.println("===Dequeue Operations======");
	queue1.addFront(10);
	queue1.addFront(20);
	queue1.addFront(90);
	queue1.displayDeque();
}
   
}
