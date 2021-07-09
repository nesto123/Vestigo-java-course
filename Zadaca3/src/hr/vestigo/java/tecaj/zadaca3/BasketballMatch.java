/**
 * 
 */
package hr.vestigo.java.tecaj.zadaca3;

/**
 * Class for basketball match.
 * @author franv
 *
 */
public class BasketballMatch {
	public final int playersOnField = 5;
	public Team teamBlue;
	public Team teamWhite;
	
	/**
	 * Constructor for basketball match.
	 */
	public BasketballMatch()
	{
		this.teamBlue = new Team("Blue", 55, 77);
		this.teamWhite = new Team("White", 56, 89);
		
		int blueScores = this.teamBlue.numberOfScores(77);
		int whiteScores = this.teamWhite.numberOfScores(89);
		int blueFauls = this.teamBlue.numberOfFouls(55);
		int whiteFauls = this.teamWhite.numberOfScores(56);
		
		if(blueScores > whiteScores)
		{
			System.out.println("Winner is " + this.teamBlue.bojaDresa 
					+ " with score " + blueScores 
					+ " and number of fauls is " + blueFauls +".");
		}
		else if( blueScores < whiteScores )
		{
			System.out.println("Winner is " + this.teamWhite.bojaDresa 
					+ " with score " + whiteScores 
					+ " and number of fauls is " + whiteFauls +".");		}
		else
		{
			System.out.println("It is a tie.");
		}
		
		if( blueFauls > whiteFauls)
		{
			System.out.println("Blue team has more fauls.");
		}
		else if(blueFauls < whiteFauls)
		{
			System.out.println("White team has more fauls.");
		}
		else
		{
			System.out.println("Both teams hawe the same number of fauls.");
		}
	}
	

	

	

}
