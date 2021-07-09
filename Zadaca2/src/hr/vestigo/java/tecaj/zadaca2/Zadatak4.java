/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author franv
 *
 */
public class Zadatak4 {

	/**
	 * Extract all letters from char matrix that can be found
	 * in string "VESTIGO" to new array.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] charMatrix = {{'K','A','5','V','S','1','Z'}, 
								{'D','A','3','E', 'L'},
								{'A','W','S','C','6'},
								{'O','T','9'},
								{'Y','Z','1','I','S'},
								{'4','R','G','T','S'},
								{'A','B','0','I','S'}};
		ArrayList<Character> result = new ArrayList<>();
		
		for (int i = 0; i < charMatrix.length; i++) {
			for (int j = 0; j < charMatrix[i].length ; j++) {
				if( "VESTIGO".indexOf(charMatrix[i][j]) >= 0 )
				{
					result.add(charMatrix[i][j]);
				}
			}
		}
		
		System.out.println(Arrays.toString(result.toArray()));
	}		

}
