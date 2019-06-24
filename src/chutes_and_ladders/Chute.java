package chutes_and_ladders;


public class Chute 
{
	// index 0 is base, index 1 is end
	private int[] chuteStartEnd = new int[2];
	
	/**
	 * @param start
	 * 	chute's top
	 * @param stop
	 * 	chute's base
	 */
	public Chute(int start, int stop)
	{
		chuteStartEnd[0] = start;
		chuteStartEnd[1] = stop;
	}
	
	
	
	/**
	 * Gets chute's top.
	 * @return
	 * 	chutes's top
	 */
	public int getStart()
	{
		return chuteStartEnd[0];
	}
	
	/**
	 * Gets chute's base.
	 * @return
	 * 	chute's base
	 */
	public int getEnd()
	{
		return chuteStartEnd[1];
	}
	
	
	
}

