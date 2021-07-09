/**
 * 
 */
package gardener;


import garden.Flowerbed;
import garden.Garden;
import garden.InvalidPlantType;
import garden.Orchard;
import garden.Plot;
import garden.SpaceOccupiedException;
import plants.Plantable;

/**
 * Represents garden with trees and flowers.
 * @author franv
 *
 */
public class Gardener {
	 /**
	  * Tries to plant a plant in garden.
	  * @param g Garden to plant a plant.
	  * @param p plant to be planted.
	  * @throws NoRoomInGardenException  thrown when there is no more room in garden
	  */
	public void plant (Garden g, Plantable p) throws NoRoomInGardenException
	{
		for(int i = 0; i < g.garden.size(); ++i)
		{
			for(int j = 0; j < Plot.CAPACITY; ++j)
			{
				try {
					if( g.garden.get(i).addPlant(j, p))
					{
						return;
					}
				}catch(SpaceOccupiedException exeception1){
					continue;
				}catch(InvalidPlantType exception2)
				{
					break;
				}				
			}
		}
		throw new NoRoomInGardenException();
	}
	
	/**
	 * Used to water plants in given garden.
	 * @param g garden for watering plants
	 */
	public void waterPlants(Garden g)
	{
		for(int i = 0; i < g.garden.size(); ++i)
		{
			for( int j = 0; j < Plot.CAPACITY; ++j)
			{
				Plantable p = g.garden.get(i).getPlant(j);			
				if(p != null)
				{
					p.addWater();
				}				
			}
		}
	}
	
	/**
	 * Prints out all plants in given garden.
	 * @param g garden to be printed
	 */
	public void admirePlants(Garden g)
	{
		System.out.println(g.toString()); 
	}

	/**
	 * Gardener can add plot type 'orchard' or 'flowerbed' to a garden.
	 * @param g garden to add plot
	 * @param plotType 'orchard' or 'flowerbed'
	 * @throws java.lang.IllegalArgumentException thrown when illegal plot type is passed
	 */
	public void addPlot( Garden g, String plotType) throws java.lang.IllegalArgumentException
	{
		if( plotType.equals("orchard") )
		{
			Orchard orchard = new Orchard();
			g.garden.add(orchard);
		}
		else if( plotType.equals("flowerbed") )
		{
			Flowerbed flowebed = new Flowerbed();
			g.garden.add(flowebed);
		}
		else
		{
			throw new java.lang.IllegalArgumentException("Illegal plot type!");
		}
	}
	
	
}
