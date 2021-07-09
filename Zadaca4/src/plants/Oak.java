/**
 * 
 */
package plants;

/**
 * Represents Oak tree.
 * @author franv
 *
 */
public class Oak extends Tree {

	/**
	 * Initializes newly created Oak tree.
	 */
	public Oak() {
		super();
	}
	
	/**
	 * Returns tree name -- Oak.
	 */
	@Override
	public String toString() {
		if(super.getWateringNumber() >= 2)
		{
			return "OAK";
		}
		else
		{
			return "oak";
		}
	}
}
