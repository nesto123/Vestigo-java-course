/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca2;

import java.util.Arrays;

/**
 * @author franv
 *
 */
public class Zadatak1 {

	
	
	/**
	 * A given array is split to three sorted subarrays.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {9, 8, 937, 912, 1961, 24, 7, 61, 7285, 17, 826, 175, 6813, 8123, 4373, 3, 
				92, 99, 897, 32, 50, 1, 67, 24};
		
		int[] subArray1 = Arrays.copyOfRange(array, 0, (array.length / 3) );
		int[] subArray2 = Arrays.copyOfRange(array, (array.length / 3) , ( 2 * array.length / 3) );
		int[] subArray3 = Arrays.copyOfRange(array, ( 2 * array.length / 3), array.length );
		
		Arrays.sort(subArray1);
		Arrays.sort(subArray2);
		Arrays.sort(subArray3);
		
		System.out.println( Arrays.toString(subArray1)) ;
		System.out.println( Arrays.toString(subArray2)) ;
		System.out.println( Arrays.toString(subArray3)) ;
	}

}
