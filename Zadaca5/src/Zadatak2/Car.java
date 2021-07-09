/**
 * 
 */
package Zadatak2;

/**
 * Represents a car in parking lot.
 * @author franv
 *
 */
public class Car extends Vehicle {

	/**
	 * Initializes new vehicle.
	 * @param vehicleType handicapped or regular.
	 */
	public Car(VehicleType vehicleType) {
		super(CarSpaceType.MEDIUM, vehicleType);
	}
}
