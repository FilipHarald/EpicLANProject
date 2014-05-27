package LANHelperGUI;

import java.awt.FlowLayout;

import javax.swing.*;

import LANHelper.RankingTable;

public class ButtonPanel extends JPanel {

	public ButtonPanel(OperatorView operatorView, RankingTable rT) {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		add(new AddButton(operatorView, rT));
		add(new RemoveButton(operatorView, rT));
		add(new SearchButton(operatorView, rT));
		add(new ShowPlayersButton(operatorView));
		add(new NewTournamentButton(operatorView));
		add(new NewMatchButton(operatorView));

	}

}