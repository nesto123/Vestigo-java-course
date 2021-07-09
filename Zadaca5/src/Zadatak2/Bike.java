/**
 * 
 */
package Zadatak2;

/**
 * Represents a bike in parking lot.
 * @author franv
 *
 */
public class Bike extends Vehicle {

	/**
	 * Initializes new bike.
	 * @param vehicleType handicapped or regular.
	 */
	public Bike(VehicleType vehicleType) {
		super(CarSpaceType.SMALL, vehicleType);
	}

}
