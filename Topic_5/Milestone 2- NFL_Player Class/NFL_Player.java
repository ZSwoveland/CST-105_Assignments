import java.text.DecimalFormat;
//Zachary Swoveland
//5/5/18
//CST-105
//This is my own work, Zachary Swoveland
public class NFL_Player {
	//Formats decimals for the doubles in use for averages
	private static DecimalFormat two = new DecimalFormat("#.##");
	// data fields to be store information
	String playerName = "Player Name";
	int weight = 200;
	double height = 5.8;
	String position = "Position";
	int passingYards = 50;
	int rushingYards = 125;
	int receivingYards = 45;
	int sacks = 2;
	int tackles = 0;
	int interceptions = 8;

	// constructor
	NFL_Player() {

	}

	// constructor to test if information is being stored properly
	NFL_Player(String newPlayerName, String newPosition, int newWeight, double newHeight, int newPassingYards,
			int newRushingYards, int newReceivingYards, int newSacks, int newTackles, int newInterceptions) {
		playerName = newPlayerName;
		weight = newWeight;
		height = newHeight;
		position = newPosition;
		passingYards = newPassingYards;
		rushingYards = newRushingYards;
		receivingYards = newReceivingYards;
		sacks = newSacks;
		tackles = newTackles;
		interceptions = newInterceptions;
	}

	// getter Average of the offensive yards
	String getAverageOffensiveYards() {
		double hold = (passingYards + rushingYards + receivingYards) / 3.0;
		return two.format(hold);
	}

	// getter Average of defensive score
	String getAverageDefensiveScore() {
		double hold = (tackles + interceptions + sacks) / 3.0;
		return two.format(hold);
	}

	// getters of the data fields
	String getName() {
		return "Player's Name: " + playerName;
	}

	int getWeight() {
		return weight;
	}

	double getHeight() {
		return height;
	}

	String getPosition() {
		return "Player's position: " + position;
	}

	int getPassingYards() {
		return passingYards;
	}

	int getRushingYards() {
		return rushingYards;
	}

	int getTackles() {
		return tackles;
	}

	int getInterceptions() {
		return interceptions;
	}

	int getReceivingYards() {
		return receivingYards;
	}

	int getSacks() {
		return sacks;
	}

	// end of the getters of the data fields
	// to String method that outputs to the main class
	public String toString() {

		return "The player selected is:\r" + getName() + "\r" + getPosition() + "\r" + "Player's weight: " + getWeight() + "\rPlayer's height: "
				+ getHeight() + "\rPlayer's passing yards: " + getPassingYards() + "\rPlayer's rushing yards: "
				+ getRushingYards() + "\rPlayer's receiving yards: " + getReceivingYards()
				+ "\rPlayer's average offensive yards: " + getAverageOffensiveYards() + "\rPlayer's tackles: "
				+ getTackles() + "\rPlayer's interceptions: " + getInterceptions() + "\rPlayer's sacks: " + getSacks()
				+ "\rPlayer's average defensive score: " + getAverageDefensiveScore();
	}

	// setters of the data fields
	void setName(String newPlayerName) {
		playerName = newPlayerName;
	}

	void setWeight(int newWeight) {
		weight = newWeight;
	}

	void setHeight(double newHeight) {
		height = newHeight;
	}

	void setPosition(String newPosition) {
		position = newPosition;
	}

	void setPassingYards(int newPassingYards) {
		passingYards = newPassingYards;
	}

	void setRushingYards(int newRushingYards) {
		rushingYards = newRushingYards;
	}

	void setTackles(int newTackles) {
		tackles = newTackles;
	}

	void setInterceptions(int newInterceptions) {
		interceptions = newInterceptions;
	}

	void setReceivingYards(int newReceivingYards) {
		receivingYards = newReceivingYards;
	}

	void setSacks(int newSacks) {
		sacks = newSacks;
	}
	// end of the setters of the data fields
}
