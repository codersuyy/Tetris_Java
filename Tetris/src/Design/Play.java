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
	
	public Play(){
		setBackground(Color.BLACK);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		setBounds(20, 20, 500, 633);
		
		
		border.setBackground(Color.WHITE);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		border.setBounds(10, 10, 304, 604);
		add(border);
		border.setLayout(null);
		
		Playarea.setBackground(Color.BLACK);
		Playarea.setBounds(2, 2, 300, 600);
		border.add(Playarea);
		Playarea.setLayout(null);
		
		border2.setBounds(345, 50, 124, 304);
		add(border2);
		border2.setLayout(null);
		
		NextBlock.setBackground(Color.BLACK);
		NextBlock.setBounds(2, 2, 120, 300);
		border2.add(NextBlock);
		NextBlock.setLayout(null);
		
		lblNext.setHorizontalAlignment(SwingConstants.CENTER);
		lblNext.setForeground(Color.WHITE);
		lblNext.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblNext.setBounds(345, 20, 124, 20);
		add(lblNext);
		
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setForeground(Color.WHITE);
		lblScore.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblScore.setBounds(345, 400, 124, 30);
		add(lblScore);
		
		lblDiem.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiem.setForeground(Color.WHITE);
		lblDiem.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		lblDiem.setBounds(345, 440, 124, 20);
		add(lblDiem);
		
		lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevel.setForeground(Color.WHITE);
		lblLevel.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblLevel.setBounds(345, 500, 124, 20);
		add(lblLevel);
	}
	public void setLevel(String lvl){
		lblLevel.setText("Level: "+lvl);
	}
}
