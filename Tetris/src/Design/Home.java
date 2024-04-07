package Design;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		NameGame();
	}
	//Ten game
	public void NameGame(){
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel lblTetris = new JLabel("TETRIS");
		lblTetris.setFont(new Font("Snap ITC", Font.PLAIN, 64));
		lblTetris.setBounds(267, 16, 296, 72);
		getContentPane().add(lblTetris);
	}
}
