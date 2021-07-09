/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca1;

import java.util.Scanner;

/**
 * @author franv
 *
 */
public class Zadatak5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an hour: ");
		int hour = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter a day: ");
		String day = sc.nextLine();
		sc.close();
		
		boolean store_is_open;
		if ( day.equalsIgnoreCase("sunday") || day.equalsIgnoreCase("saturday") 
				|| (hour > 16 || hour < 8) ) {
			store_is_open = false;
		}
		else if ( day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday")
				 	|| day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday")
				 	||  day.equalsIgnoreCase("Friday") ) {
			store_is_open = true;
		}
		else {
			store_is_open = false;
		}
		
		System.out.println("On given day and time store is open: " + store_is_open);
		
	}

}
