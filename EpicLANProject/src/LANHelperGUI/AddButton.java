package LANHelperGUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import LANHelper.RankingTable;

public class AddButton extends JButton implements ActionListener {

	private OperatorView operatorView;
	private RankingTable rT;

	public AddButton(OperatorView operatorView, RankingTable rT) {
		super("Add");
		addActionListener(this);
		setToolTipText("Add a player to the ranking table");
		this.operatorView = operatorView;
		this.rT = rT;
	}

	public void actionPerformed(ActionEvent e) {
		String userName = JOptionPane
				.showInputDialog("Enter name of the player you wish to add");

		if (rT.add(userName)) {
			operatorView.appendText(userName + " successfully added!");
		} else {
			operatorView.setText("Player with the name " + userName
					+ " already is in the ranking table.");
		}

	}
}
