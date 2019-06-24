package chutes_and_ladders;


public class Ladder 
{
	// index 0 is base, index 1 is end
	private int[] ladStartEnd = new int[2];
	
	/**
	 * @param start
	 * 	Ladder's base
	 * @param stop
	 * 	Ladder's top
	 */
	public Ladder(int start, int stop)
	{
		ladStartEnd[0] = start;
		ladStartEnd[1] = stop;
	}
	
	
	
	/**
	 * Gets ladder's base
	 * @return
	 * 	ladder's base
	 */
	public int getStart()
	{
		return ladStartEnd[0];
	}
	
	/**
	 * Gets ladder's top
	 * @return
	 * 	ladder's top
	 */
	public int getEnd()
	{
		return ladStartEnd[1];
	}
	
}








