/**
 * 
 */
package Zadatak2;

/**
 * Represents parking lot.
 * @author franv
 *
 */
public class ParkingLot {
	
	private int regularLargeSpaces;
	private int regularMediumSpaces;
	private int regularSmallSpaces;
	private int handicappedLargeSpaces;
	private int handicappedMediumSpaces;
	private int handicappedSmallSpaces;
	
	/**
	 * Initializes parking size.
	 */
	public ParkingLot()
	{
		this.regularLargeSpaces = 10;
		this.regularMediumSpaces = 24;
		this.regularSmallSpaces = 9;
		this.handicappedLargeSpaces = 0;
		this.handicappedMediumSpaces = 5;
		this.handicappedSmallSpaces = 0; 
	}
	
	/**
	 * Try to park a vehicle if there is space.
	 * @param vehicle to park
	 */
	public void park(Vehicle vehicle)
	{
		System.out.println("Parking " + vehicle.getClass().getSimpleName()
					+ " " + vehicle.getVehicleType().name() 
					+ " " + vehicle.getCarSpaceType().name() + ".");
		try {
			String message = findParkingSpotAndPark(vehicle.getCarSpaceType(), vehicle.getVehicleType());
			System.out.println("The " + vehicle.getClass().getSimpleName() + " is parked at " + message);
		} catch (NoSpaceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Prints out number of free spaces.
	 */
	public void showFreeSpots()
	{
		System.out.println("There are " + regularLargeSpaces + " regular Large Spaces left.");
		System.out.println("There are " + regularMediumSpaces + " regular Medium Spaces left.");
		System.out.println("There are " + regularSmallSpaces + " regular Small Spaces left.");
		System.out.println("There are " + handicappedLargeSpaces + " handicapped Large Spaces left.");
		System.out.println("There are " + handicappedMediumSpaces + " handicapped Medium Spaces left.");
		System.out.println("There are " + handicappedSmallSpaces + " handicapped Small Spaces left.");
	}
	
	/**
	 * Tries to park a vehicle if possible.
	 * @param spaceType space required for vehicle
	 * @param vehicleType type of vehicle 
	 * @return message were vehicle is parked if it is parked
	 * @throws NoSpaceException if there is no space in parking loot
	 */
	private String findParkingSpotAndPark(CarSpaceType spaceType, VehicleType vehicleType) throws NoSpaceException
	{
		if(vehicleType == VehicleType.HANDICAPPED)
		{
			if( spaceType.ordinal() == CarSpaceType.SMALL.ordinal() 
					&& this.handicappedSmallSpaces > 0)
			{
				this.handicappedSmallSpaces -= 1;
				return "handicapped Small Space.";
			}
			if( spaceType.ordinal() <= CarSpaceType.MEDIUM.ordinal() 
					&& this.handicappedMediumSpaces > 0)
			{
				this.handicappedMediumSpaces -= 1;
				return "handicapped Medium Space.";
			}
			if( spaceType.ordinal() <= CarSpaceType.LARGE.ordinal() 
					&& this.handicappedLargeSpaces > 0)
			{
				this.handicappedLargeSpaces -= 1;
				return "handicapped Large Space.";
			}
		}
		
		if( spaceType.ordinal() == CarSpaceType.SMALL.ordinal() 
				&& this.regularSmallSpaces > 0)
		{
			this.regularSmallSpaces -= 1;
			return "regular Small Space.";
		}
		if( spaceType.ordinal() <= CarSpaceType.MEDIUM.ordinal() 
				&& this.regularMediumSpaces > 0)
		{
			this.regularMediumSpaces -= 1;
			return "regular Medium Space.";
		}
		if( spaceType.ordinal() <= CarSpaceType.LARGE.ordinal() 
				&& this.regularLargeSpaces > 0)
		{
			this.regularLargeSpaces -= 1;
			return "regular Large Space.";
		}
		
		throw new NoSpaceException();		
	}
}
