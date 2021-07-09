/**
 * 
 */
package plants;

/**
 * Represents Amaranthus flower.
 * @author franv
 *
 */
public class Amaranthus extends Flower {

	/**
	 * Initializes newly created Amaranthus flower.
	 */
	public Amaranthus() {
		super();
	}
	
	/**
	 * Returns flower name -- Amaranthus
	 */
	@Override
	public String toString() {
		if(super.getWateringNumber() >= 1)
		{
			return "AMARANTHUS";
		}
		else
		{
			return "amaranthus";
		}
	}
}
