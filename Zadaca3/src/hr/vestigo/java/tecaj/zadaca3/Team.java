/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca3;

/**
 * This class represents the basketball team.
 * @author franv
 *
 */
public class Team {
	public String bojaDresa;
	public int stats4Defense;
	public int stats4Attack;
	
	/**
	 *  Constructor for basketball team with given attributes.
	 * @param bojaDresa dress color
	 * @param stats4Defense defense points
	 * @param stats4Attack attack points
	 */
	public Team(String bojaDresa, int stats4Defense, int stats4Attack)
	{
		this.bojaDresa = bojaDresa;
		
		if( !this.checkStatistics(stats4Attack, stats4Defense) )
		{
			System.out.println("Invalid stats");
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * Checks if team stats are valid.
	 * @param stats4Defense new defense for team
	 * @param stats4Attack new attack for team
	 * @return true if stats are valid, otherwise false
	 */
	public boolean checkStatistics( int stats4Defense, int stats4Attack)
	{
		if(  (stats4Attack < 1) || (stats4Attack > 100) 
				|| (stats4Defense < 1) || (stats4Defense > 100)  )
		{
			return false;			
		}
		else
		{
			this.stats4Attack = stats4Attack;
			this.stats4Defense = stats4Defense;
			return true;
		}	
	}
	
	/**
	 *  Get score of team
	 * @param attack
	 * @return
	 */
	int numberOfScores(int attack) 
	{
		attack /= 10;
		if(attack <= 0)
		{
			return 0;
		}
		return  attack * 12;
	}
	
	/**
	 * Get number of fauls for team.
	 * @param defense
	 * @return
	 */
	int numberOfFouls(int defense) 
	{
		return (100 - defense) / 10;
	}
	

	
}
