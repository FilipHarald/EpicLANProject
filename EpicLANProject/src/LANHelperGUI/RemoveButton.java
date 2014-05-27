package LANHelperGUI;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import LANHelper.RankingTable;


public class RemoveButton extends JButton implements ActionListener {

	private OperatorView operatorView;
	private RankingTable rT;
	
	public RemoveButton(OperatorView operatorView, RankingTable rT) {
		super("Remove");
		addActionListener(this);
		setToolTipText("Remove a player from the ranking table");
		this.operatorView = operatorView;
	}

	public void actionPerformed(ActionEvent e) {
		String name = JOptionPane.showInputDialog("Enter name of the player you wish to remove");
		
		Object[] options2 = { "Yes", "No" };
		int m = JOptionPane.showOptionDialog(null,
				"Are you sure you wish to remove: " + name
				+ " from the database?",
				"Removing a bike owner", JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options2,
				options2[0]);
		rT.remove(name);		
	}
	


}
