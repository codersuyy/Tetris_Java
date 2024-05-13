package Design;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Home extends JPanel{
	private static final long serialVersionUID = 1L;
	private JFrame mainFrame;
	
	public JLabel lblTetris = new JLabel("TETRIS");
	public JLabel lblPlay = new JLabel("PLAY");
	public JLabel lblInstruction = new JLabel("INSTRUCTION");
	public JLabel lblHighscore = new JLabel("HIGHSCORE");
	
	public Home(JFrame frame) {
		setBackground(Color.BLACK);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		NameGame();
		this.mainFrame = frame;
		ButtonPlay();
		ButtonInstruction();
		ButtonHighscore();
	}

	public void NameGame(){
		lblTetris.setHorizontalAlignment(SwingConstants.CENTER);
		lblTetris.setForeground(new Color(255, 255, 255));
		lblTetris.setFont(new Font("Bookman Old Style", Font.BOLD, 60));
		lblTetris.setBounds((655-240)/2, 10, 240,83);
		add(lblTetris);
	}
	
	public void ButtonPlay(){
		lblPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				Play pl = new Play();
				mainFrame.setContentPane(pl);
				pl.setLevel("1");
				mainFrame.revalidate();  // Tells the layout manager to reset based on the new content pane
				mainFrame.repaint();  // Redraws the frame so the new content pane is displayed
			}
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
		lblPlay.setBounds((655-200)/2, 250, 200, 30);
		add(lblPlay);
	}
	
	public void ButtonInstruction(){
		lblInstruction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				Instruction in = new Instruction();
				mainFrame.setContentPane(in);
				mainFrame.revalidate();
				mainFrame.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblInstruction.setForeground(Color.WHITE);
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
		lblInstruction.setBounds((655-200)/2, 300, 200, 30);
		add(lblInstruction);
	}
	
	public void ButtonHighscore(){
		lblHighscore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				Highscore high = new Highscore();
				mainFrame.setContentPane(high);
				mainFrame.revalidate();
				mainFrame.repaint();
			}
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
		lblHighscore.setBounds((655-200)/2, 350, 200, 30);
		add(lblHighscore);
	}
}