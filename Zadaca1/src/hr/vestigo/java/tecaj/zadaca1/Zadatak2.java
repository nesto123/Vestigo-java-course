/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca1;

import java.util.Scanner;

/**
 * Calculating nth potency of given number.
 * @author franv
 *
 */
public class Zadatak2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int base = sc.nextInt();
		System.out.println("Please enter a potency: ");
		int potency = sc.nextInt();
		sc.close();
		
		int result = (int) Math.pow(base, potency); 
		System.out.println( potency + ". of given number is: " + result);
	}

}
