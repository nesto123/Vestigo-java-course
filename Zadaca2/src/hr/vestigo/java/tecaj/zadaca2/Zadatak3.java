/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca2;

import java.util.Arrays;

/**
 * @author franv
 *
 */
public class Zadatak3 {
	/**
	 * Returns true if word is a palindrome, otherwise returns false.
	 * @param word for checking if it is palindrome.
	 * @return true if palindrome, otherwise false.
	 */
	public static boolean isPalindrome(String word)
	{
		for (int i = 0; i < (word.length() / 2) ; i++) 
		{
			if( Character.toLowerCase(word.charAt(i)) != Character.toLowerCase( word.charAt(word.length() - i - 1) ) )
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * Extract palindromes from array and saves them into new array.
	 * Depending on length of string if it is even it is saved in all
	 * caps, otherwise string remains the same as original string.
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Bob", "civic", "Time", "rAdar", "lol", "DotA", "dEtarTrated", 
						"sAiPpuaKivikauPPias", "rotoR", "solo", "kite", "Rick", "Evee", 
						"discipline", "_wow_", "sTat"};
		String[] result = new String[15];
		int numPalindrome = 0;
		
		for (String word : arr) {
			if( isPalindrome(word) )
			{
				if( (word.length() % 2) == 0 ) {
					result[numPalindrome] = word.toUpperCase();
				}
				else {
					result[numPalindrome] = word;
				}
				numPalindrome++;
			}
				
		}
		
		System.out.println(Arrays.toString(result));
	}
	

}
