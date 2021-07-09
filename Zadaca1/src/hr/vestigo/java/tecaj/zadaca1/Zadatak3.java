/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca1;

import java.util.Scanner;

/**
 * Sum of all digits.
 * 
 * @author franv
 *
 */
public class Zadatak3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = sc.nextInt();
		sc.close();
		
		if( (number < 10000) || (number > 99999) ) {
			System.out.println("Given number does not have five digits!");
		}
		
		int sum = 0;
		while( number != 0) {
			sum += number % 10;
			number /= 10;
		}

		System.out.println("Sum of digits is: " + sum);
		
		
		
	}

}
