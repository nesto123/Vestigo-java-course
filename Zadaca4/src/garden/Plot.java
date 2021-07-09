/**
 * 
 */
package garden;

import plants.Plantable;

/**
 * Represents plots in garden.
 * @author franv
 *
 */
public interface Plot {
	/**
	 * Number of plants a plot can have.
	 */
    public static final int CAPACITY = 5;
    
    /**
     * For given place plants a plant.
     * @param i place to put a plant
     * @param p plant for planting
     * @return true if planting was done successfully
     * @throws InvalidPlantType if plant type does not match plot type
     * @throws SpaceOccupiedException if on selected plot there is already another plant
     */
    public boolean addPlant(int i, Plantable p) throws InvalidPlantType, SpaceOccupiedException;
    
    /**
     * Gets plant planted on ith place in plot.
     * @param i place in plot
     * @return plant planted on ith place in plot.
     */
    public Plantable getPlant(int i);
    
    /**
     * Gets number of planted plants in plot.
     * @return number of planted plants.
     */
    public int countPlants();
}
