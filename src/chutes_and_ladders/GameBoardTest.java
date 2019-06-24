package chutes_and_ladders;

public class GameBoardTest {

	public static void main(String[] args) 
	{	
		GameBoard b = new GameBoard();
		for (int i=0; i<101; i++)
			System.out.println(b.getCell(i));
			
	}

}
