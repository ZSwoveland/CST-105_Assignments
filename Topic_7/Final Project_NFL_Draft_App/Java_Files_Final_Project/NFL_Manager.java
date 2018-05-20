import java.util.ArrayList;

//Zachary Swoveland
//5/5/18
//CST-105
//This is my own work, Zachary Swoveland
//Revised 5/13/18
//Revised 5/20/18
public class NFL_Manager {
	// data fields to hold Player class inside array

	ArrayList<NFL_Player> playerInfo = new ArrayList<NFL_Player>();

	NFL_Manager() {

	}

	// creates 6 players
	void createPlayers(ArrayList<NFL_Player> newPlayerInfo) {
		NFL_Player laCharger = new OffensivePlayer(4515, -2, 0);
		laCharger.setName("Philip Rivers");
		laCharger.setPosition("QB");
		laCharger.setHeight(6.5);
		laCharger.setWeight(228);

		NFL_Player nyJets = new OffensivePlayer(0, 280, 449);
		nyJets.setName("LaDainian Tomlinson");
		nyJets.setPosition("RB");
		nyJets.setHeight(5.10);
		nyJets.setWeight(215);

		NFL_Player azCardinals = new OffensivePlayer(21, 0, 1156);
		azCardinals.setName("Larry Fitzgerald");
		azCardinals.setPosition("WR");
		azCardinals.setHeight(6.3);
		azCardinals.setWeight(218);

		NFL_Player denBroncos = new OffensivePlayer(2249, -6, 0);
		denBroncos.setName("Peyton Manning");
		denBroncos.setPosition("QB");
		denBroncos.setHeight(6.5);
		denBroncos.setWeight(230);

		NFL_Player laRams = new DefensivePlayer(11, 41, 0);
		laRams.setName("Aaron Donald");
		laRams.setPosition("DT");
		laRams.setHeight(6.1);
		laRams.setWeight(280);

		NFL_Player hTexans = new DefensivePlayer(0, 45, 1);
		hTexans.setName("Aaron Colvin");
		hTexans.setPosition("DB");
		hTexans.setHeight(6.0);
		hTexans.setWeight(193);

		// Saves them to array
		playerInfo = newPlayerInfo;
		newPlayerInfo.add(laCharger);
		newPlayerInfo.add(nyJets);
		newPlayerInfo.add(azCardinals);
		newPlayerInfo.add(denBroncos);
		newPlayerInfo.add(laRams);
		newPlayerInfo.add(hTexans);
	}

	// Outputs to main and returns as string
	public String toString() {
		createPlayers(playerInfo);
		String result = "";
		// splits each player in the create players method
		for (NFL_Player player : playerInfo) {
			result += player.toString();

		}
		return result;
	}

}
