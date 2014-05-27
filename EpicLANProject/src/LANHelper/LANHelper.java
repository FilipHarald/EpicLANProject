package LANHelper;

import LANHelperGUI.OperatorView;

public class LANHelper {
	public static void main(String[] args) {
		RankingTable rankingTable = new RankingTable();
	    new OperatorView ("Operator view", rankingTable);
	}

}
