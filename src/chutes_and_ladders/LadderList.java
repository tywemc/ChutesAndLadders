package chutes_and_ladders;

import java.util.ArrayList;

public class LadderList 
{
	private ArrayList<Ladder> ladders = new ArrayList<Ladder>();
	
	private int ladder;
	
	/**
	 * Builds the ladders that are on the traditional Chutes and Ladders
	 * game board and appends them to an array list.
	 */
	public LadderList()
	{
		Ladder a = new Ladder(1,38);
		Ladder b = new Ladder(4,14);
		Ladder c = new Ladder(9,31);
		Ladder d = new Ladder(21,42);
		Ladder e = new Ladder(28,84);
		Ladder f = new Ladder(36,44);
		Ladder g = new Ladder(51,67);
		Ladder h = new Ladder(71,91);
		Ladder i = new Ladder(80,100);
		
		ladders.add(a);
		ladders.add(b);
		ladders.add(c);
		ladders.add(d);
		ladders.add(e);
		ladders.add(f);
		ladders.add(g);
		ladders.add(h);
		ladders.add(i);
	}
	
	/**
	 * Gets a ladder from the ladder list.
	 * @param index
	 * 	list index
	 * @return
	 * 	Ladder
	 */
	public Ladder getLadder(int index)
	{
		return ladders.get(index);
	}
	
	/**
	 * This method returns true if a player is at the base of
	 * a ladder.
	 * @param index
	 * 	player's position on game board
	 * @return
	 * 	true if player's position is at the base of a ladder
	 */
	public boolean ladderCheck(int index)
	{
		for (int i=0; i<ladders.size(); i++)
		{
			if (index == ladders.get(i).getStart())
			{
				ladder = i;
				return true;
			}
				
		}
		return false;
	}
	
	public int getLadderIndex()
	{
		return ladder;
	}
}
