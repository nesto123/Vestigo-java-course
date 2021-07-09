/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca1;

import java.util.Scanner;

/**
 * 
 * Check whether a year is a leap year.
 * @author franv
 *
 */
public class Zadaca1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a year: ");
		int year = sc.nextInt();
		sc.close();
		boolean is_leep_year;

		if( (year % 4) == 0) {
			if( (year % 100) == 0 ) {
				if( (year % 400) == 0) {
					is_leep_year = true;
				}
				else {
					is_leep_year = false;
				}
			}
			else {
				is_leep_year = true;
			}
		}
		else {
			is_leep_year = false;
		}
		
		System.out.println("Given year is leap: " + is_leep_year);			
	

	}

}
