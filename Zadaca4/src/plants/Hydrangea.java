/**
 * 
 */
package plants;

/**
 * Represents Hydrangea flower
 * @author franv
 *
 */
public class Hydrangea extends Flower {

	/**
	 * Initializes newly created Hydrangea flower.
	 */
	public Hydrangea() {
		super();
	}
	
	/**
	 * Returns flower name -- Hydrangea
	 */
	@Override
	public String toString() {
		if(super.getWateringNumber() >= 1)
		{
			return "HYDRANGEA";
		}
		else
		{
			return "hydrangea";
		}
	}
}
