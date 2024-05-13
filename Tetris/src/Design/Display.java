package Design;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Display {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					Home home = new Home(frame);
					Play play = new Play();
					Instruction ins = new Instruction();
					Highscore hiscore = new Highscore();
					frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\git\\Tetris_Java\\Tetris\\img\\logo.png"));
					frame.setTitle("Tetris");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(20, 20, 655, 660);
					frame.setResizable(false);
					frame.setContentPane(home);
					play.setLevel("99");
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
