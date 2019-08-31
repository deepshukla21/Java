/******************************************************************************
 *  Purpose: Finding the roots of quadratic equation
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class QuadraticRoots {
	public static void main(String[] args) {
		//Taking inputs for a, b, c
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a");
	    double a = sc.nextDouble();
		System.out.println("Enter value for b");
		double b = sc.nextDouble();
		System.out.println("Enter value for c");
		double c = sc.nextDouble();
		//Calculate the discriminant
		double discriminant = b*b - 4 * a * c;
		System.out.println("discriminant : " + discriminant);		
		double root1 = 0.0;
		double root2 = 0.0;
		double imaginary = 0.0;
		double imaginary1 = 0.0;
		// Calculating roots
		if (discriminant > 0) {
            root1 = -b + (Math.sqrt(b*b - 4 * a * c)) / 2 * a ;
            root1 = -b - (Math.sqrt(b*b - 4 * a * c)) / 2 * a ;
            System.out.println("The roots are distincts and real" + root1 + "," + root2);
		}
		else if (discriminant == 0) {
			root1 = root2 = -b / 2 * a;
			System.out.println("The roots are real and equal" + root1 + "," + root2);
		}
		else if(discriminant < 0) {
			root1 = root2 = -b / 2 * a;
			imaginary = Math.sqrt(-discriminant) / 2 * a;
			imaginary1 = - Math.sqrt(-discriminant) / 2 * a;
			System.out.println("The roots are distinct and complex"  + root1  + "," +  imaginary +" , " + root2 + "," + imaginary1);
		}
		// Close open resources
	    try {
			if(sc != null) {
				sc.close();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
