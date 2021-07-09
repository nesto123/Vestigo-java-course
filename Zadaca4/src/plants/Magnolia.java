/**
 * 
 */
package plants;

/**
 * Represents Magnolia tree.
 * @author franv
 *
 */
public class Magnolia extends Tree {

	/**
	 * Initializes newly created Magnolia tree.
	 */
	public Magnolia() {
		super();
	}
	
	/**
	 * Returns tree name -- Magnolia.
	 */
	@Override
	public String toString() {
		if(super.getWateringNumber() >= 2)
		{
			return "MAGNOLIA";
		}
		else
		{
			return "magnolia";
		}
	}
}
