package LANHelper;
import java.util.ArrayList;

public class Match {

	private ArrayList<Team> teamList;
	private int winningTeam;

	/**
	 * 
	 * Receives list of players sorted by player rating, number of teams is by
	 * 
	 * default 2
	 * 
	 * @param playerList
	 */

	public Match(ArrayList<Player> playerList) {

		this.teamList = TeamFactory.generateTeams(playerList, 2);

	}

	/**
	 * 
	 * Receives list of players, sorted by player rank, and number of teams
	 * 
	 * participating in match
	 * 
	 * 
	 * 
	 * @param playerList
	 * 
	 *            , list of players sorted by rank
	 * 
	 * @param numberOfTeams
	 * 
	 *            , number of teams participating in match
	 */

	public Match(ArrayList<Player> playerList, int numberOfTeams) {

		this.teamList = TeamFactory.generateTeams(playerList, numberOfTeams);

	}

	/**
	 * 
	 * Gets the result of the match
	 * 
	 * 
	 * 
	 * @return index (in teamList) of winning team
	 */

	public int getWinningTeam() {

		return winningTeam;

	}

	/**
	 * 
	 * Sets the winning team of the match, by using their index in teamList
	 * 
	 */

	public void setWinningTeam(int result) {

		this.winningTeam = result;

	}

	/**
	 * 
	 * Gets the two teams. Team1 located at index 0, team2 located at index 1
	 * 
	 * 
	 * 
	 * @return list containing the two teams
	 */

	public ArrayList<Team> getTeams() {

		return teamList;

	}

}