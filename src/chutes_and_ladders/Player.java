package chutes_and_ladders;

public class Player 
{
	private String name;
	
	private int position;
	
	private boolean succession;
	
	/**
	 * Makes a new player to the game.
	 * @param givenName
	 * 	player's name
	 */
	public Player(String givenName)
	{
		name = givenName;
		position = 0;
		succession = false;
	}
	
	/**
	 * Gets a player's name.
	 * @return
	 * 	player's name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Gets player's position.
	 * @return
	 * 	player's position
	 */
	public int getPosition()
	{
		return position;
	}
	
	/**
	 * Gives player's index so they can be tracked on the game board.
	 * @return
	 * 	player's index
	 */
	public int getIndex()
	{
		return position;
	}
	
	/**
	 * Updates a player's position.
	 * @param destination
	 * 	destination
	 */
	public void updatePosition(int destination)
	{
		position = destination;
	}
	
	/**
	 * Checks if player's position is the finish block.
	 * @return
	 * 	true if player's position is at the finish block. else false
	 */
	public boolean getWin()
	{
		return succession;
	}
	
	public void setWin()
	{
		succession = true;
	}
	
}












