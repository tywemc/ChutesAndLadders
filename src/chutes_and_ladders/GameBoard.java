package chutes_and_ladders;

import java.util.ArrayList;

public class GameBoard
{
	private ArrayList<Integer> board = new ArrayList<Integer>();
	
	/**
	 * Creates the game board
	 */
	public GameBoard()
	{
		for (int i=0; i<101; i++)
			board.add(i);
	}
	
	public int getCell(int index)
	{
		return board.get(index);
	}
	

}
