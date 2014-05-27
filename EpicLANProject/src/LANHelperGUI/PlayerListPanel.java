package LANHelperGUI;

import javax.swing.JList;
import javax.swing.JPanel;

import LANHelper.Player;
import LANHelper.RankingTable;

public class PlayerListPanel extends JPanel {

	private RankingTable rT;
	private OperatorView operatorView;
	private JList<Player> list;

	public PlayerListPanel(OperatorView operatorView, RankingTable rT) {
		this.rT = rT;
		this.operatorView = operatorView;
		
	}

	public void setPlayerListShowning(JList<Player> list){
		this.list = list;
	}
	
	public void setPlayerListShowning(){
		
		Player[] tempList = new Player[](rT.size());
		
		for (Player p : rT){
			
		}
		this.list = list;
	}
	

}
