package chutes_and_ladders;

public class TrapTest {

	public static void main(String[] args) 
	{
		LadderList ladderlist = new LadderList();
		ChuteList chutelist = new ChuteList();
		
		System.out.println(chutelist.getChute(2).getStart()); // Expected 49
		System.out.println(ladderlist.getLadder(5).getEnd()); // Expected 44

	}

}
