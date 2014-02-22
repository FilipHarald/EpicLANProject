import java.util.List;

public class Match {

	private List<Player> playerList;

	private List<Team> teamList;

	private Result result;

	public enum Result {

		TEAM1_WINNER, TEAM2_WINNER, TIE

	}

	/**
	 * 
	 * Receives list of players sorted by player rank, number of teams is by
	 * 
	 * default 2
	 * 
	 * 
	 * 
	 * @param playerList
	 */

	public Match(List<Player> playerList) {

		this.playerList = playerList;

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

	public Match(List<Player> playerList, int numberOfTeams) {

		this.playerList = playerList;

		this.teamList = TeamFactory.generateTeams(playerList, numberOfTeams);

	}

	/**
	 * 
	 * Gets the result of the match
	 * 
	 * 
	 * 
	 * @return result of match
	 */

	public Result getResult() {

		return result;

	}

	/**
	 * 
	 * Sets the result of the match
	 */

	public void setResult(Result result) {

		this.result = result;

	}

	/**
	 * 
	 * Gets the two teams. Team1 located at index 0, team2 located at index 1
	 * 
	 * 
	 * 
	 * @return list containing the two teams
	 */

	public List<Team> getTeams() {

		return teamList;

	}

}