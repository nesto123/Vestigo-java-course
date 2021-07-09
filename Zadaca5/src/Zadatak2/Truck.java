/**
 * 
 */
package Zadatak2;

/**
 * Represents a truck in parking lot.
 * @author franv
 *
 */
public class Truck extends Vehicle {

	/**
	 * Initializes new truck.
	 * @param vehicleType handicapped or regular.
	 */
	public Truck(VehicleType vehicleType) {
		super(CarSpaceType.LARGE, vehicleType);
	}

}
