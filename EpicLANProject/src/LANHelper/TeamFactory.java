package LANHelper;
import java.util.ArrayList;

import java.util.List;

public class TeamFactory {

	/**
	 * 
	 * Generates balanced teams
	 */

	public static ArrayList<Team> generateTeams(ArrayList<Player> playerList,

	int numberOfTeams) {

		ArrayList<Team> teamList = new ArrayList<Team>();

		for (int i = 0; i < numberOfTeams; i++) {

			teamList.add(new Team());

		}

		for (int i = 0; i < playerList.size(); i++) {

			teamList.get(i % numberOfTeams).getPlayerList().add(playerList.get(i));

		}

		return teamList;

	}

}