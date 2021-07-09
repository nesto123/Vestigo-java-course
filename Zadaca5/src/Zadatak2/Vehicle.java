/**
 * 
 */
package Zadatak2;

/**
 * Represents a vehicle.
 * @author franv
 *
 */
public class Vehicle {
	private final VehicleType vehicleType;
	private final CarSpaceType carSpaceType;
	
	/**
	 * Initializes new vehicle.
	 * @param carSpaceType car space type
	 * @param vehicleType vehicle type
	 */
	public Vehicle(CarSpaceType carSpaceType, VehicleType vehicleType)
	{
		this.carSpaceType = carSpaceType;
		this.vehicleType = vehicleType;
	}

	/**
	 * Gets vehicleType.
	 * @return the vehicleType
	 */
	public VehicleType getVehicleType() {
		return vehicleType;
	}

	/**
	 * Returns car space type.
	 * @return the CarSpaceType 
	 */
	public CarSpaceType getCarSpaceType() {
		return carSpaceType;
	}
	
	
	
	
}
