package Design;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
					frame.setTitle("Tetris");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(20, 20, 500, 660);
					frame.setResizable(false);
					frame.setContentPane(hiscore);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
