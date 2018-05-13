//This is my own work, Zachary Swoveland
//Zachary Swoveland
//CST-105
//5/13/18

public class DefensivePlayer extends NFL_Player {
	int sacks = 2;
	int tackles = 0;
	int interceptions = 8;

	// Defensive player constructor
	DefensivePlayer(int newSacks, int newTackles, int newInterceptions) {
		sacks = newSacks;
		tackles = newTackles;
		interceptions = newInterceptions;
	}

	// Defensive player toString to display the player
	public String toString() {

		return "The player selected is:\r" + getName() + "\r" + getPosition() + "\r" + "Player's Weight: " + getWeight()
				+ "\rPlayer's Height: " + getHeight() + "\rPlayer's tackles: " + getTackles()
				+ "\rPlayer's Interceptions: " + getInterceptions() + "\rPlayer's Sacks: " + getSacks()
				+ "\rPlayer's Average Defensive Score: " + getAverageDefensiveScore();
	}

	// data fields getters
	String getAverageDefensiveScore() {
		double hold = (tackles + interceptions + sacks) / 3.0;
		return two.format(hold);
	}

	int getTackles() {
		return tackles;
	}

	int getInterceptions() {
		return interceptions;
	}

	int getSacks() {
		return sacks;
	}

	// data fields setters
	void setTackles(int newTackles) {
		tackles = newTackles;
	}

	void setInterceptions(int newInterceptions) {
		interceptions = newInterceptions;
	}

	void setSacks(int newSacks) {
		sacks = newSacks;
	}
}
