import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class TicTacToe implements ActionListener{
	
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel titleP = new JPanel();
	JPanel buttonP = new JPanel();
	JLabel text = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean player1go;
	
	
	public TicTacToe() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		
		text.setBackground(Color.BLUE);
		text.setForeground(Color.GREEN);
		text.setFont(new Font("Ink Free", Font.BOLD,75));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setText("Tic-Tac-Toe");
		text.setOpaque(true);
		
		titleP.setLayout(new BorderLayout());
		titleP.setBounds(0,0,800,100);
		
		buttonP.setLayout(new GridLayout(3,3));
		buttonP.setBackground(Color.GRAY);
		
		for(int i = 0; i < 9; i++) {
			buttons[i] = new JButton();
			buttonP.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		titleP.add(text);
		frame.add(titleP, BorderLayout.NORTH);
		frame.add(buttonP);
		
		firstTurn();
		
		 
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void firstTurn() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(random.nextInt(2) == 0) {
			player1go = true;
			text.setText("X turn");
		}
		else {
			player1go = false;
			text.setText("O turn");
		}
	}
	
	public void check() {
		
	}
	
	public void xWins(int a, int b, int c) {
		
	}
	
	public void oWins(int a, int b, int c) {
		
	}
}