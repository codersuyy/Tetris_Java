package Design;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class Instruction extends JPanel{
	private static final long serialVersionUID = 1L;
	public JTextArea txtrIn = new JTextArea();
	
	public Instruction() {
		setBackground(Color.BLACK);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		txtrIn.setForeground(Color.WHITE);
		txtrIn.setBackground(Color.BLACK);
		txtrIn.setText("In Tetris, players complete lines by moving differently shaped pieces (tetrominoes), which descend onto the playing field. The completed lines disappear and grant the player points, and the player can proceed to fill the vacated spaces. The game ends when the uncleared lines reach the top of the playing field.");
		txtrIn.setBounds(10, 11, 430, 278);
		add(txtrIn);
	}
}
