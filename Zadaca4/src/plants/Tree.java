/**
 * 
 */
package plants;

/**
 * Represents a tree in garden.
 * @author franv
 *
 */
public abstract class Tree implements Plantable {
	
	private int wateringNumber;
	
	protected Tree()
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
