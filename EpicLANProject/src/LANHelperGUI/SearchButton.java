package LANHelperGUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import LANHelper.RankingTable;

public class SearchButton extends JButton implements ActionListener {

	private OperatorView operatorView;

	public SearchButton(OperatorView operatorView, RankingTable rT) {
		super("Search");
		this.operatorView = operatorView;
		addActionListener(this);
		setToolTipText("Search after a player");
	}

	public void actionPerformed(ActionEvent e) {
		String userName = JOptionPane
				.showInputDialog("Enter name: ");

		if (userName == null) {
			return;
		}
	}
}
