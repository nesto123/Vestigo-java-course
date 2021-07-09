/**
 * 
 */
package Zadatak2;

/**
 * Testing class for parking loot.
 * @author franv
 *
 */
public class Zadatak2 {

	/**
	 * Testing program.
	 * @param args none
	 */
	public static void main(String[] args) {
		
		ParkingLot lot = new ParkingLot();
		
		lot.park(new Bike(VehicleType.HANDICAPPED));
		lot.park(new Car(VehicleType.HANDICAPPED));
		lot.park(new Car(VehicleType.HANDICAPPED));
		lot.park(new Car(VehicleType.HANDICAPPED));
		lot.park(new Car(VehicleType.HANDICAPPED));
		lot.park(new Car(VehicleType.HANDICAPPED));
		lot.showFreeSpots();
	}

}
