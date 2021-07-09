/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca3;


/**
 * a program that goes through all one-digit, two-digit, and three-digit numbers, and prints all those that fall into one of the following two categories:
 * a) Three-digit prime numbers
 * b) Single-digit and double-digit palindromes
 * @author franv
 *
 */
public class Zadatak1 {
	/**
	 * Checks if number is prime.
	 * 
	 * @param n number to check if it is prime.
	 * @return true if number is prime, else returns false
	 */
	public static boolean isPrime(int n)
	{
		if( (n == 0) || (n==1) )
		{
			return false;
		}
		else {
			for (int i = 2; i < (n / 2) ; i++) {
				if( n % i == 0 ) {
					return false;
				}
			}
			return true;
		}
	}
	
	/**
	 * Checks if number is a palindrome.
	 * @param n number to check if it is palindrome.
	 * @return true if number is palindrome, else false.
	 */
	public static boolean isPalindrome(int n)
	{
		String str = Integer.toString(n);
		for (int i = 0; i < (str.length() / 2); i++) {
			if( str.charAt(i) != str.charAt( str.length() - i - 1) )
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 1000; i++) {
			
			if( isPrime(i) && (i > 99))
			{
				System.out.println(i);
			}
			else if( isPalindrome(i) && (i < 100))
			{
				System.out.println(i);
			}
				
		}
		
	}

}
