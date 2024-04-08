package Design;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Home extends JFrame {

	private JPanel contentPane;
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;

	public Home() {
		setTitle("Tetris");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(20, 20, 500, 660);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
public void NameGame(){
	JLabel lblTetris = new JLabel("TETRIS");
	lblTetris.setForeground(new Color(255, 255, 255));
	lblTetris.setFont(new Font("Bookman Old Style", Font.BOLD, 60));
	lblTetris.setBounds((500-240)/2, 10, 240,83);
	contentPane.add(lblTetris);
}
public void ButtonPlay(){
	JLabel lblPlay = new JLabel("PLAY");
	lblPlay.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseExited(MouseEvent e) {
			lblPlay.setForeground(Color.WHITE);
		}
	});
	lblPlay.addMouseMotionListener(new MouseMotionAdapter() {
		@Override
		public void mouseMoved(MouseEvent e) {
			lblPlay.setForeground(Color.RED);
		}
	});
	
	lblPlay.setHorizontalAlignment(SwingConstants.CENTER);
	lblPlay.setForeground(Color.WHITE);
	lblPlay.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	lblPlay.setBounds((500-200)/2, 250, 200, 30);
	contentPane.add(lblPlay);
}
public void ButtonInstruction(){
	JLabel lblInstruction = new JLabel("INSTRUCTION");
	lblInstruction.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseExited(MouseEvent e) {
			lblInstruction.setForeground(Color.WHITE);
		}
		@Override
		public void mouseClicked(MouseEvent e) {
		}
	});
	lblInstruction.addMouseMotionListener(new MouseMotionAdapter() {
		@Override
		public void mouseMoved(MouseEvent e) {
			lblInstruction.setForeground(Color.RED);
		}
	});
	lblInstruction.setHorizontalAlignment(SwingConstants.CENTER);
	lblInstruction.setForeground(Color.WHITE);
	lblInstruction.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	lblInstruction.setBounds((500-200)/2, 300, 200, 30);
	contentPane.add(lblInstruction);
}
public void ButtonHighscore(){
	JLabel lblHighscore = new JLabel("HIGHSCORE");
	lblHighscore.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseExited(MouseEvent e) {
			lblHighscore.setForeground(Color.WHITE);
		}
	});
	lblHighscore.addMouseMotionListener(new MouseMotionAdapter() {
		@Override
		public void mouseMoved(MouseEvent e) {
			lblHighscore.setForeground(Color.RED);
		}
	});
	lblHighscore.setHorizontalAlignment(SwingConstants.CENTER);
	lblHighscore.setForeground(Color.WHITE);
	lblHighscore.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	lblHighscore.setBounds((500-200)/2, 350, 200, 30);
	contentPane.add(lblHighscore);
}
}