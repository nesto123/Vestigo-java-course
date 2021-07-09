/**
 * 
 */
package garden;

import plants.Flower;
import plants.Plantable;

/**
 * Plot type for flowers.
 * @author franv
 *
 */
public class Flowerbed implements Plot {
	/**
	 * Array to hold all flowers planted in this plot.
	 */
	private Flower[] plot;
	
	/**
	 * Initializes plot size.
	 */
	public Flowerbed()
	{
		this.plot = new Flower[CAPACITY];
	}
	
	@Override
	public boolean addPlant(int i, Plantable p) throws InvalidPlantType, SpaceOccupiedException {
		
		if( !(p instanceof Flower) )
		{
			throw new InvalidPlantType();
		}
		if( this.plot[i] != null )
		{
			throw new SpaceOccupiedException();
		}
		if( (i < 0) || (i > CAPACITY) )
		{
			return false;
		}
		
		this.plot[i] = (Flower) p;
		
		return true;
	}

	@Override
	public Plantable getPlant(int i) {
		
		return this.plot[i];
	}

	@Override
	public int countPlants() {
		
		int count = 0;
		for (Flower flower : this.plot) {
			if(flower != null)
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Returns list of all flowers in plot.
	 */
	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < CAPACITY; ++i) {
			if(this.plot[i] == null)
			{
				output += "_ ";
			}
			else
			{
				output += this.plot[i].toString() + " ";
			}
		}
		return output;
	}

}
