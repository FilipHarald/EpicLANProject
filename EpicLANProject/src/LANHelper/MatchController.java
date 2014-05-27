package LANHelper;
import java.util.ArrayList;


public class MatchController {
	private RankingTable rankingTable;
	private Match match;

	public MatchController(RankingTable rT, Match m) {
		rankingTable = rT;
		match = m;
	}
	
	public void setMatch(Match m){
		match = m;
	}

	public void setWinningTeam(int winningTeam) {
		match.setWinningTeam(winningTeam);
		setNewRatings();
	}

	private void setNewRatings() {
		ArrayList<Team> teamList = match.getTeams();
		int winningTeamIndex = match.getWinningTeam();

		for (int i = 0; i < teamList.size(); i++) {

			for (Player p : teamList.get(i).getPlayerList()) {
				if (winningTeamIndex == i) {
					p.increaseRating(1);
				} else {
					p.decreaseRating(1);
				}
			}
		}
		rankingTable.update();
	}
}
