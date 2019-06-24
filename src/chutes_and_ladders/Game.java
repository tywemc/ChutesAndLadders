package chutes_and_ladders;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Automated Chutes and Ladders game through console.
 * @author Tyler McAnally
 *
 */

public class Game {

	public static void main(String[] args) 
	{
		new GameBoard();
		LadderList ladderlist = new LadderList();
		ChuteList chutelist = new ChuteList();
		Spinner spinner = new Spinner();
		
		ArrayList<Player> players = new ArrayList<Player>();

		
		Scanner scanner = new Scanner(System.in);
		int numPlayers = 0;
		
		while (numPlayers < 1 || numPlayers > 4)
		{
			System.out.println("How many players? (Max: 4) ");
			numPlayers = scanner.nextInt();
			scanner.nextLine();
		}
		
		for (int i=0; i<numPlayers; i++)
		{
			System.out.println("Player " + (i+1) + "'s name: ");
			String name = scanner.nextLine();
			Player plr = new Player(name);
			players.add(plr);
		}
		scanner.close();

//		Keep for testing
//		Player player1 = new Player("Tyler");
//		Player player2 = new Player("Grace");
//		players.add(player1);
//		players.add(player2);
		
		int turnLoop = 0;
		int spin;
		
		
		while (true)
		{
//			Scanner in = new Scanner(System.in);
//			String input = in.nextLine();
			spin = spinner.spin();
			Player player = players.get(turnLoop);
			System.out.println(player.getName());
			System.out.println("Spin: " + spin);
			int playerLocation = player.getPosition();
			int preLocation = player.getPosition();
			player.updatePosition(playerLocation+spin);
			playerLocation = player.getPosition();
			
			
			if (ladderlist.ladderCheck(playerLocation))
			{
				System.out.println("LADDER");
				int index = ladderlist.getLadderIndex();
				Ladder destinationLadder = ladderlist.getLadder(index);
				int ladderEnd = destinationLadder.getEnd();
				preLocation = player.getPosition();
				player.updatePosition(ladderEnd);
				playerLocation = player.getPosition();
				System.out.println("Location: " + playerLocation);
				System.out.println();
			}
			else if (chutelist.chuteCheck(playerLocation))
			{
				System.out.println("CHUTE");
				int index = chutelist.getChuteIndex();
				Chute destinationChute = chutelist.getChute(index);
				int chuteEnd = destinationChute.getEnd();
				preLocation = player.getPosition();
				player.updatePosition(chuteEnd);
				playerLocation = player.getPosition();
				
				System.out.println("Location: " + playerLocation);
				System.out.println();
			}
			else
			{
				if (playerLocation > 100)
				{
					player.updatePosition(preLocation);
					playerLocation = preLocation;
				}
				System.out.println("Location: " + playerLocation);
				System.out.println();
			}
			
			if (playerLocation == 100)
			{
				player.setWin();
				players.remove(turnLoop);
				System.out.println("WINNER");
				break;
			}
			
			turnLoop++;
			if (turnLoop >= players.size())
				turnLoop = 0;
			
			if (players.size() == 0)
				break;
			
			
			
				
		}

	}

}
