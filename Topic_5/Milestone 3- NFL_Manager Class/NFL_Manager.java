import java.util.ArrayList;
//Zachary Swoveland
//5/5/18
//CST-105
//This is my own work, Zachary Swoveland
public class NFL_Manager {
	//data fields to hold Player class inside array
	NFL_Player player = new NFL_Player();
	ArrayList<NFL_Player> playerInfo = new ArrayList<NFL_Player>();

	NFL_Manager() {

	}
	//creates 6 players
	void createPlayers(ArrayList<NFL_Player> newPlayerInfo) {
		NFL_Player laCharger = new NFL_Player();
		laCharger.setName("Philip Rivers");
		laCharger.setPosition("QuarterBack");
		laCharger.setHeight(6.5);
		laCharger.setWeight(228);
		laCharger.setPassingYards(4515);
		laCharger.setRushingYards(-2);
		laCharger.setReceivingYards(0);
		laCharger.setTackles(1);
		laCharger.setInterceptions(0);
		laCharger.setSacks(0);
		
		NFL_Player nyJets = new NFL_Player();
		nyJets.setName("LaDainian Tomlinson");
		nyJets.setPosition("Running Back");
		nyJets.setHeight(5.10);
		nyJets.setWeight(215);
		nyJets.setPassingYards(0);
		nyJets.setRushingYards(280);
		nyJets.setReceivingYards(449);
		nyJets.setTackles(1);
		nyJets.setInterceptions(0);
		nyJets.setSacks(0);
		
		NFL_Player azCardinals = new NFL_Player();
		azCardinals.setName("Larry Fitzgerald");
		azCardinals.setPosition("Wide Receiver");
		azCardinals.setHeight(6.3);
		azCardinals.setWeight(218);
		azCardinals.setPassingYards(21);
		azCardinals.setRushingYards(0);
		azCardinals.setReceivingYards(1156);
		azCardinals.setTackles(0);
		azCardinals.setInterceptions(0);
		azCardinals.setSacks(0);
		
		NFL_Player denBroncos = new NFL_Player();
		denBroncos.setName("Peyton Manning");
		denBroncos.setPosition("QuarterBack");
		denBroncos.setHeight(6.5);
		denBroncos.setWeight(230);
		denBroncos.setPassingYards(2249);
		denBroncos.setRushingYards(-6);
		denBroncos.setReceivingYards(0);
		denBroncos.setTackles(0);
		denBroncos.setInterceptions(0);
		denBroncos.setSacks(0);
		
		NFL_Player laRams = new NFL_Player();
		laRams.setName("Aaron Donald");
		laRams.setPosition("Defensive Tackle");
		laRams.setHeight(6.1);
		laRams.setWeight(280);
		laRams.setPassingYards(0);
		laRams.setRushingYards(0);
		laRams.setReceivingYards(0);
		laRams.setTackles(41);
		laRams.setInterceptions(0);
		laRams.setSacks(11);
		
		NFL_Player hTexans = new NFL_Player();
		hTexans.setName("Aaron Colvin");
		hTexans.setPosition("Defensive Backs");
		hTexans.setHeight(6.0);
		hTexans.setWeight(193);
		hTexans.setPassingYards(0);
		hTexans.setRushingYards(0);
		hTexans.setReceivingYards(0);
		hTexans.setTackles(45);
		hTexans.setInterceptions(1);
		hTexans.setSacks(0);
		//Saves them to array
		playerInfo = newPlayerInfo;
		newPlayerInfo.add(laCharger);
		newPlayerInfo.add(nyJets);
		newPlayerInfo.add(azCardinals);
		newPlayerInfo.add(denBroncos);
		newPlayerInfo.add(laRams);
		newPlayerInfo.add(hTexans);
	}
	//Outputs to main and returns as string
	public String toString() {
		createPlayers(playerInfo);
		String result = "";
		//splits each player in the create players method
		for (NFL_Player player : playerInfo) {
			result += player.toString() + "\r------------------------------------------------------\r";

		}
		return result;
	}

}
