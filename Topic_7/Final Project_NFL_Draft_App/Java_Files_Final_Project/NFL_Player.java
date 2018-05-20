import java.text.DecimalFormat;

//Zachary Swoveland
//5/5/18
//CST-105
//This is my own work, Zachary Swoveland
//Revised 5/13/18
//Revised 5/20/18
public abstract class NFL_Player {
	// Formats decimals for the doubles in use for averages
	public static DecimalFormat two = new DecimalFormat("#.##");
	// data fields to be store information
	String playerName = "Player Name";
	int weight = 200;
	double height = 5.8;
	String position = "Position";

	// constructor
	NFL_Player() {

	}

	// constructor to test if information is being stored properly
	NFL_Player(String newPlayerName, String newPosition, int newWeight, double newHeight) {
		playerName = newPlayerName;
		weight = newWeight;
		height = newHeight;
		position = newPosition;

	}

	// getters of the data fields
	String getName() {
		return playerName;
	}

	int getWeight() {
		return weight;
	}

	double getHeight() {
		return height;
	}

	String getPosition() {
		return position;
	}

	// end of the getters of the data fields
	// to String method that outputs to the main class
	public String toString() {

		return getName() + getPosition() +  getWeight()
				+ getHeight();
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

	// end of the setters of the data fields
}
