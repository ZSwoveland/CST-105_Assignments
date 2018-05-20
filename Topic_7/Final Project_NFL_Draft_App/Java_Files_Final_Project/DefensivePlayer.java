//This is my own work, Zachary Swoveland
//Zachary Swoveland
//CST-105
//5/13/18
//Revised 5/20/18
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

		return getName() + "\rPosition: " + getPosition() + "\rWeight: " + getWeight() + "\rHeight: " + getHeight()
				+ "\rTackles: " + getTackles() + "\rInterceptions: " + getInterceptions() + "\rSacks: " + getSacks()
				+ "\rAverage Defensive Score: " + getAverageDefensiveScore() + "_";
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
