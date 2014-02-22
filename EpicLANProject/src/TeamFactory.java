import java.util.ArrayList;

import java.util.List;

public class TeamFactory {

	/**
	 * 
	 * Generates two balanced teams(not sure if this should be in this class)
	 */

	public static List<Team> generateTeams(List<Player> playerList,

	int numberOfTeams) {

		List<Team> teamList = new ArrayList<Team>();

		for (int i = 0; i < numberOfTeams; i++) {

			teamList.add(new Team());

		}

		for (int i = 0; i < playerList.size(); i++) {

			teamList.get(i % numberOfTeams).getPlayerList()

			.add(playerList.get(i));

		}

		return teamList;

	}

}