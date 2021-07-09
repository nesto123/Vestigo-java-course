package plants;


import garden.Garden;
import gardener.Gardener;
import gardener.NoRoomInGardenException;
import java.util.Scanner;

/**
 * Class for testing/playing the game.
 * @author franv
 *
 */
public class test {

	public static void main(String[] args) {
	
		Gardener gardener = new Gardener();
		Garden garden = new Garden();
		
		try {
			gardener.addPlot(garden, "flowerbed");
			gardener.addPlot(garden, "orchard");
		}catch(java.lang.IllegalArgumentException e)
		{
			System.out.println("Illegal argument for plot type!");
		}
		gardener.admirePlants(garden);
		
		Scanner sc = new Scanner(System.in);
		String command = "";
		
		while( !command.equalsIgnoreCase("Q") )
		{
			command = sc.nextLine();
			if( command.equalsIgnoreCase("W") )
			{
				gardener.waterPlants(garden);
				System.out.println("Gardener: Drink my children, drink and GROW! HAHAHAHAHA!!");
			}
			else if( command.equalsIgnoreCase("L") )
			{
				gardener.admirePlants(garden);
				System.out.println("The gardener admires the garden ");
			}
			else if( command.equalsIgnoreCase("Q") )
			{
				sc.close();
				return;
			}
			else if( command.charAt(0) == 'P' || command.charAt(0) == 'p' )
			{
				Plantable plantable = null;
				if( command.equalsIgnoreCase("PA") )
				{
					plantable = new Amaranthus();
				}
				else if( command.equalsIgnoreCase("PH") )
				{
					plantable = new Hydrangea();
				}
				else if( command.equalsIgnoreCase("PM") )
				{
					plantable = new Magnolia();
				}
				else if( command.equalsIgnoreCase("PO") )
				{
					plantable = new Oak();
				}
				else 
				{
					System.out.println("Invalid command!");
					continue;
				}
				
				try {
					gardener.plant(garden, plantable);
					System.out.println("I've planted the " + plantable.getClass().getName().replace("plants.", "") + ".");
				}catch(NoRoomInGardenException exception) {
					System.out.println("No more room in garden!");					
				}
			}
			else 
			{
				System.out.println("Invalid command!");
			}
		}
		sc.close();
		
		
	}

}
