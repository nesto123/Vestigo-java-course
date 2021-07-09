/**
 * 
 */
package garden;

import plants.Plantable;
import plants.Tree;

/**
 * Plot type for trees.
 * @author franv
 *
 */
public class Orchard implements Plot {
	/**
	 * Array to hold all trees planted in this plot.
	 */
	private Tree[] plot;
	
	/**
	 * Initializes plot size.
	 */
	public Orchard()
	{
		this.plot = new Tree[CAPACITY];
	}
	
	@Override
	public boolean addPlant(int i, Plantable p) throws InvalidPlantType, SpaceOccupiedException {

		if( !(p instanceof Tree) )
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
		
		this.plot[i] = (Tree) p;
		
		return true;
	}

	@Override
	public Plantable getPlant(int i) {

		return this.plot[i];
	}

	@Override
	public int countPlants() {
		
		int count = 0;
		for (Tree tree : this.plot) {
			if(tree != null)
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Returns list of all trees in plot.
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
