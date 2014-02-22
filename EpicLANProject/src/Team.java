import java.util.ArrayList;
import java.util.List;

public class Team {

	private List<Player> playerList;
	
	public Team(){
		playerList = new ArrayList<Player>();
	}

	public Team(List<Player> playerList) {

		this.playerList = playerList;

	}

	public List<Player> getPlayerList() {

		return playerList;

	}

	public void setPlayerList() {

		this.playerList = playerList;

	}

}