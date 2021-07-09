/**
 * 
 */
package plants;

/**
 * Represents a flower in garden.
 * @author franv
 *
 */
public abstract class Flower implements Plantable {
	
	private int wateringNumber;

	protected Flower()
	{
		this.wateringNumber = 0;
	}
	
	@Override
	public void addWater() {
		this.wateringNumber += 1;
	}
	
	/**
	 * Returns number of waterings
	 * @return the wateringNumber
	 */
	public int getWateringNumber() {
		return wateringNumber;
	}
}
