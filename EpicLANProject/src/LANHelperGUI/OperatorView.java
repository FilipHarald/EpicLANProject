package LANHelperGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import LANHelper.Player;
import LANHelper.RankingTable;

public class OperatorView extends JFrame {
	
	private ButtonPanel buttonPanel;
	private PlayerListPanel playerListPanel;
	private JTextArea messageArea;
	protected RankingTable rT;

	public OperatorView(String title, RankingTable rT) {
        super(title);
		this.rT = rT;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel messagePanel = new JPanel();
		messageArea = new JTextArea(20, 20);
		messageArea.setEditable(false);
		messagePanel.add(new JScrollPane(messageArea));
		add(messagePanel, BorderLayout.CENTER);

		buttonPanel = new ButtonPanel(this, rT);
		add(buttonPanel, BorderLayout.WEST);
		
		playerListPanel = new PlayerListPanel(this, rT);
		add(playerListPanel, BorderLayout.EAST);

		pack();
		setVisible(true);
	}

	public void setText(String s) {
		messageArea.setText(s);
	}
	
	public void appendText(String s) {
		messageArea.append("\ns");
	}
	
	public void printPlayerData(Player p){
		
	}

}
