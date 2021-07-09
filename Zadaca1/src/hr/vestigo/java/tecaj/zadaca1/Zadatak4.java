/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca1;

import java.util.Scanner;

/**
 * Calculating the distance between two points in 2D space.
 * 
 * @author franv
 *
 */
public class Zadatak4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x coordinate of first number: ");
		int x1_coordinate = sc.nextInt();
		
		System.out.println("Enter y coordinate of first number: ");
		int y1_coordinate = sc.nextInt();
		
		System.out.println("Enter x coordinate of second number: ");
		int x2_coordinate = sc.nextInt();
		
		System.out.println("Enter y coordinate of second number: ");
		int y2_coordinate = sc.nextInt();
		sc.close();
		
		double distance;
		distance = Math.sqrt( Math.pow(x1_coordinate - x2_coordinate, 2) 
								+ Math.pow(y1_coordinate - y2_coordinate, 2) );
		
		System.out.println("Distance between two points is: "+ distance);
	}

}
