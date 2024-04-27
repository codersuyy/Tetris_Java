package Design;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Play extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public Panel border = new Panel();
	public JPanel border2 = new JPanel();
	public JLabel lblDiem = new JLabel("300");
	public JLabel lblLevel = new JLabel("Level: ");
	public JPanel Playarea = new JPanel();
	public JPanel NextBlock = new JPanel();
	public JLabel lblNext = new JLabel("Next");
	public JLabel lblScore = new JLabel("Score");
	public JPanel HoldBlock = new JPanel();
	public JPanel border3 = new JPanel();
	public JLabel lblHold = new JLabel("Hold");
	
	public Play(){
		setBackground(Color.BLACK);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		setBounds(20, 20, 655, 633);
		this.Hold();
		this.PlayA();
		this.Next();
		this.Score();
		this.Level();
	}
	
	public void Hold(){
		border3.setBounds(10, 50, 124, 304);
		add(border3);
		border3.setLayout(null);
		
		HoldBlock.setBackground(Color.BLACK);
		HoldBlock.setBounds(2, 2, 120, 300);
		border3.add(HoldBlock);
		
		lblHold.setHorizontalAlignment(SwingConstants.CENTER);
		lblHold.setForeground(Color.WHITE);
		lblHold.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblHold.setBounds(10, 20, 124, 25);
		add(lblHold);
	}
	
	public void PlayA(){
		border.setBackground(Color.WHITE);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		border.setBounds(165, 10, 304, 604);
		add(border);
		border.setLayout(null);
		
		Playarea.setBackground(Color.BLACK);
		Playarea.setBounds(2, 2, 300, 600);
		border.add(Playarea);
		Playarea.setLayout(null);
	}
	
	public void Next(){
		border2.setBounds(500, 50, 124, 304);
		add(border2);
		border2.setLayout(null);
		
		NextBlock.setBackground(Color.BLACK);
		NextBlock.setBounds(2, 2, 120, 300);
		border2.add(NextBlock);
		NextBlock.setLayout(null);
		
		lblNext.setHorizontalAlignment(SwingConstants.CENTER);
		lblNext.setForeground(Color.WHITE);
		lblNext.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblNext.setBounds(500, 20, 124, 25);
		add(lblNext);
	}
	
	public void Score(){
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setForeground(Color.WHITE);
		lblScore.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblScore.setBounds(500, 400, 124, 30);
		add(lblScore);
		
		lblDiem.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiem.setForeground(Color.WHITE);
		lblDiem.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		lblDiem.setBounds(500, 440, 124, 20);
		add(lblDiem);
	}
	
	public void Level(){
		lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevel.setForeground(Color.WHITE);
		lblLevel.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblLevel.setBounds(500, 500, 124, 30);
		add(lblLevel);
	}
	
	public void setLevel(String lvl){
		lblLevel.setText("Level: "+lvl);
	}
}
