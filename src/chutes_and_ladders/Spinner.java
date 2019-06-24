package chutes_and_ladders;

import java.util.Random;

public class Spinner 
{
	private Random rand;
	
	/**
	 * Constructs a new instance of Random.
	 */
	public Spinner()
	{
		rand = new Random();
	}
	
	/**
	 * Generates a random number between 1 and 6
	 * @return
	 * 	int between 1 - 6
	 */
	public int spin()
	{
		int result = Math.abs(rand.nextInt() % 7);
		while (result == 0)
			result = Math.abs(rand.nextInt() % 7);
		return result;
	}
}
