package Design;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Home extends JFrame {

	private JPanel contentPane;
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
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
		setTitle("Tetris");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(WIDTH/2, HEIGHT/2, 500, 660);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NameGame();
	}
	public void NameGame(){
		JLabel lblTetris = new JLabel("TETRIS");
		lblTetris.setForeground(new Color(255, 255, 255));
		lblTetris.setFont(new Font("Bookman Old Style", Font.BOLD, 60));
		lblTetris.setBounds((500-240)/2, 10, 240,83);
		contentPane.add(lblTetris);
	}
}
