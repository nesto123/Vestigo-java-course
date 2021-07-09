/**
 * 
 */
package garden;

import java.util.ArrayList;

/**
 * Contains all tree and flower plots in garden.
 * @author franv
 *
 */
public class Garden {
	/**
	 * Contains all plants in garden.
	 */
	//public Plot[] garden = new Plot[2];
	public ArrayList<Plot> garden = new ArrayList<>();

	/**
	 * Returns list of all trees and flowers in garden.
	 */
	@Override
	public String toString() {
		
		String list = "Garden:\n";
		int i = 0;
		for (Plot plot : this.garden) 
		{
			if(plot != null)
			{
				list += i++ + ". " + plot.toString() + "\n";
			}
			else
			{
				list += i++ + "empty plot\n";
			}
		}
		
		return list;
	}
	
	
	
}
