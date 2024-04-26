package Design;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.Toolkit;

public class Display {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home home = new Home();
					Play play = new Play();
					Instruction ins = new Instruction();
					Highscore hiscore = new Highscore();
					JFrame frame = new JFrame();
					frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\git\\Tetris_Java\\Tetris\\img\\logo.png"));
					frame.setTitle("Tetris");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(20, 20, 665, 660);
					frame.setResizable(false);
					frame.setContentPane(play);
					play.setLevel("99");
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
