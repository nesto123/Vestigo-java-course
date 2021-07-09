/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author franv
 *
 */
public class Zadatak2 {
	/**
	 * Returns number of instances of letter 'o' in array.
	 * @param array input.
	 * @return number of instances of letter 'o' in array.
	 */
	public static int numberOfOccurrences(String[] array)
	{	
		int occurrences = 0;
		for (String string : array) {
			if( string.indexOf('o') >= 0 ) 
			{
				occurrences++;
			}
		}
		return occurrences;
	}

	/**
	 * For given three arrays we print out the array with 
	 * largest number of instances of letter 'o'.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"Nick", "Tom", "Jerry", "Bob", "Jerry", "Mike", "Tom",
							"Jerry", "Tom"};
		String[] arr2 = {"Hello", "World", "Java", "Jerry", "Bob", "Tom", "Jerry"};
		String[] arr3 = {"Rob", "Mike", "George", "Jerry", "Tom", "David", "John", 
							"Jack", "Jerry", "Tom"};
		
		HashMap<Object, Integer> map = new HashMap<Object, Integer>();
		map.put(arr1, numberOfOccurrences(arr1));
		map.put(arr2, numberOfOccurrences(arr2));
		map.put(arr3, numberOfOccurrences(arr3));
		
		String[] result = {};
		int max = -1;
		for( Map.Entry<Object, Integer> item : map.entrySet() )
		{
			if(item.getValue() > max )
			{
				max= item.getValue();
				result = (String[]) item.getKey();
			}
		}
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		
	}

}
