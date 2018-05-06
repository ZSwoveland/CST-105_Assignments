//Zachary Swoveland
//5/5/18
//CST-105
//This is my own work, Zachary Swoveland
public class NFL_Draft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Milestone 2 Test
		System.out.println("Testing NFL Player Class:\r");
		//Test constructor for NFL Player Class 
		NFL_Player players = new NFL_Player();
		System.out.println(players.toString());
		
		System.out.println();
		//Test constructor that needs to be filled on instantiation
		NFL_Player player = new NFL_Player("LT", "Running Back", 215, 5.10, 143, 293, 154, 0, 2, 2);
		System.out.println(player.toString());
		
		System.out.println("\rEnd of Test!");
		//Seperates assignments
		System.out.println("----------------------------");
		//Milestone 3 Test
		System.out.println("Testing NFL Manger Class:\r");
		
		NFL_Manager manage = new NFL_Manager();
		System.out.println(manage.toString());
		
		System.out.println("End of Test!");
	}

}
