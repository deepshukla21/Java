/******************************************************************************
 *  Purpose: Printing Calendar of month by storing weekday object in Queue using LinkedList
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    8-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

import java.util.Scanner;

public class CalenderUsingQueue {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter month :");
	int month=sc.nextInt();
	System.out.println("enter year :");
	int year=sc.nextInt();
	CalenderUsingQueue.calenderQueue(month,year);
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
 //calendar using queue
 public static void calenderQueue(int month, int year)
 {
	String months[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
			"November", "December" };
	
	QueueUsingLinkedList<String> q1 = new QueueUsingLinkedList<>();
	
  // get d0 value hence upto d0 we will add null values
	
  int d = 1, y = year, m = month;
	
  int y0 = y - (14 - m) / 12;
	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	int m0 = m + 12 * ((14 - m) / 12) - 2;
	int d0 = (d + x + 31 * m0 / 12) % 7;
	System.out.println("d0 is :"+d0);
	int start = d0;
	int totalDaysOfMonth = 0, count = 1;//days starts from 1,2,3
	
	if (month == 2) 
   {
	    if (CalenderUsingQueue.isLeapYear(year)) // if leap year days = 29
			totalDaysOfMonth = 29;
		else
			totalDaysOfMonth = 28; // if not leap year days= 28
	 } 
  else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		totalDaysOfMonth = 31;
	else
		totalDaysOfMonth = 30;

	while (start != 0) 
	{
		q1.enqueue("   ");//insert into queue and prints"_ "
		start--;
	}

	while (count <= totalDaysOfMonth) 
	{
			q1.enqueue(String.valueOf(count) + "  "); // add data to the queue
			count++;
	}

	System.out.println(months[month - 1] + " " + year);
	System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
	count = 1;
	while (!q1.isEmpty()) // traverse till queue is not empty
	{
		String result = q1.deQueue();
		System.out.print(result+"\t");
		
		if (count % 7 == 0) 
		{
			System.out.println();
		}
		count++;
	}
}
	private static boolean isLeapYear(int year) 
	{
		 if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		   if  (year % 400 == 0) return true;
		   return true;
		
	}
}