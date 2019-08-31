/******************************************************************************
 *  Purpose:  takes two integer command-line arguments x and y and calculate
 *            the Euclidean distance from the point (x, y) to the origin (0, 0).
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

public class CalculateDistance {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double distance = 0;
		// Formula to calculate distance from the point (x, y) to the origin (0, 0)
		distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println(distance);
	}

}
