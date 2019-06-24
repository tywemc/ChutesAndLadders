package chutes_and_ladders;

public class PlayerTest {

	public static void main(String[] args) 
	{
		Player p = new Player("Tyler");
		
		System.out.println(p.getName()); // Expected "Tyler"
		System.out.println(p.getPosition()); // Expected 0
		System.out.println(p.getIndex()); // Expected 0
		System.out.println();
		
		p.updatePosition(5); // Moves position to 5
		System.out.println(p.getPosition()); // Expected 5
		System.out.println(p.getIndex()); // Expected 4
		System.out.println(p.getWin()); // Expected false
		System.out.println();
		
		p.updatePosition(100); // Moves position to 100
		System.out.println(p.getPosition()); // Expected 100
		System.out.println(p.getIndex()); // Expected 99
		System.out.println(p.getWin()); // Expected true

	}

}
