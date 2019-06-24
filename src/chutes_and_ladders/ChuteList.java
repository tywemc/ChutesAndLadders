package chutes_and_ladders;

import java.util.ArrayList;

public class ChuteList 
{
	private ArrayList<Chute> chutes = new ArrayList<Chute>();
	
	private int chute;
	
	/**
	 * Builds the chutes that are on the traditional Chutes and Ladders
	 * game board and appends them to an array list.
	 */
	public ChuteList()
	{
		Chute a = new Chute(16,6);
		Chute b = new Chute(47,26);
		Chute c = new Chute(49,11);
		Chute d = new Chute(56,53);
		Chute e = new Chute(62,19);
		Chute f = new Chute(64,60);
		Chute g = new Chute(87,24);
		Chute h = new Chute(93,73);
		Chute i = new Chute(95,75);
		Chute j = new Chute(98,78);
		
		chutes.add(a);
		chutes.add(b);
		chutes.add(c);
		chutes.add(d);
		chutes.add(e);
		chutes.add(f);
		chutes.add(g);
		chutes.add(h);
		chutes.add(i);
		chutes.add(j);
	}
	
	/**
	 * Gets a chute from the chute list.
	 * @param index
	 * 	list index
	 * @return
	 * 	Chute
	 */
	public Chute getChute(int index)
	{
		return chutes.get(index);
	}
	
	/**
	 * This method returns true if a player is at the top of
	 * a chute.
	 * @param index
	 * 	player's position on game board
	 * @return
	 * 	true if player's position is at the top of a chute
	 */
	public boolean chuteCheck(int index)
	{
		for (int i=0; i<chutes.size(); i++)
		{
			if (index == chutes.get(i).getStart())
			{
				chute = i;
				return true;
			}
		}
		return false;
	}
	
	public int getChuteIndex()
	{
		return chute;
	}
}
