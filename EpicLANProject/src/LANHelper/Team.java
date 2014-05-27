package LANHelper;
import java.util.ArrayList;
import java.util.List;

public class Team {

	private ArrayList<Player> playerList;

	public Team() {
		playerList = new ArrayList<Player>();
	}

	public Team(ArrayList<Player> playerList) {

		this.playerList = playerList;

	}

	public ArrayList<Player> getPlayerList() {

		return playerList;

	}
	

//	 public void setPlayerList() {
//	
//	 this.playerList = playerList;
//	
//	 }

}