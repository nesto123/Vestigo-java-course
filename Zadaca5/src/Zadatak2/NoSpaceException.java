/**
 * 
 */
package Zadatak2;

/**
 * No space exception for parking loot.
 * @author franv
 *
 */
public class NoSpaceException extends Exception {

	/**
	 * Generic UID.
	 */
	private static final long serialVersionUID = 6959221030908794617L;

	/**
	 * No free spaces.
	 */
	public NoSpaceException() {
		super("No free spaces.");
	}


}
