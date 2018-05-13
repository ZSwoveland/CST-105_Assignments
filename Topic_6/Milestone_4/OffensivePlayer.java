//This is my own work, Zachary Swoveland
//Zachary Swoveland
//CST-105
//5/13/18

public class OffensivePlayer extends NFL_Player {
	int passingYards = 50;
	int rushingYards = 125;
	int receivingYards = 45;

	// Offensive player constructor
	OffensivePlayer(int newPassingYards, int newRushingYards, int newRecievingYards) {
		passingYards = newPassingYards;
		rushingYards = newRushingYards;
		receivingYards = newRecievingYards;
	}

	// Offensive player toString method to display the player
	public String toString() {

		return "The player selected is:\r" + getName() + "\r" + getPosition() + "\r" + "Player's Weight: " + getWeight()
				+ "\rPlayer's Height: " + getHeight() + "\rPlayer's Passing Yards: " + getPassingYards()
				+ "\rPlayer's Rushing yards: " + getRushingYards() + "\rPlayer's Receiving yards: "
				+ getReceivingYards() + "\rPlayer's Average Offensive Yards: " + getAverageOffensiveYards();
	}

	// data fields getters
	String getAverageOffensiveYards() {
		double hold = (passingYards + rushingYards + receivingYards) / 3.0;
		return two.format(hold);
	}

	int getPassingYards() {
		return passingYards;
	}

	int getRushingYards() {
		return rushingYards;
	}

	int getReceivingYards() {
		return receivingYards;
	}

	// setters of data feild
	void setPassingYards(int newPassingYards) {
		passingYards = newPassingYards;
	}

	void setRushingYards(int newRushingYards) {
		rushingYards = newRushingYards;
	}

	void setReceivingYards(int newReceivingYards) {
		receivingYards = newReceivingYards;
	}

}
