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
		for(int i = 0; i < 9; i++) {
			if(e.getSource() == buttons[i]) {
				if(player1go) {
					if(buttons[i].getText() == "") {
						buttons[i].setForeground(Color.GREEN);
						buttons[i].setText("X");
						player1go = false;
						
						text.setText("O Turn");
						check();
					}
				}
				else {
					if(buttons[i].getText() == "") {
						buttons[i].setForeground(Color.RED);
						buttons[i].setText("O");
						player1go = true;
						
						text.setText("X Turn");
						check();
					}
					
				}
				
			}
		}
		
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
		
		 if((buttons[0].getText() == "X") &&
			(buttons[1].getText() == "X") &&
			(buttons[2].getText() == "X")
			) {
			 
			 xWins(0,1,2);
		}
		 if((buttons[3].getText() == "X") &&
					(buttons[4].getText() == "X") &&
					(buttons[5].getText() == "X")
					) {
					 
					 xWins(3,4,5);
				}
		 if((buttons[6].getText() == "X") &&
					(buttons[7].getText() == "X") &&
					(buttons[8].getText() == "X")
					) {
					 
					 xWins(6,7,8);
				}
		 if((buttons[0].getText() == "X") &&
					(buttons[3].getText() == "X") &&
					(buttons[6].getText() == "X")
					) {
					 
					 xWins(0,3,6);
				}
		 if((buttons[1].getText() == "X") &&
					(buttons[4].getText() == "X") &&
					(buttons[7].getText() == "X")
					) {
					 
					 xWins(1,4,7);
				}
		 if((buttons[2].getText() == "X") &&
					(buttons[5].getText() == "X") &&
					(buttons[8].getText() == "X")
					) {
					 
					 xWins(2,5,8);
				}
		 if((buttons[0].getText() == "X") &&
					(buttons[4].getText() == "X") &&
					(buttons[8].getText() == "X")
					) {
					 
					 xWins(0,4,8);
				}
		 if((buttons[2].getText() == "X") &&
					(buttons[4].getText() == "X") &&
					(buttons[6].getText() == "X")
					) {
					 
					 xWins(2,4,6);
				}
		 if((buttons[0].getText() == "O") &&
					(buttons[1].getText() == "O") &&
					(buttons[2].getText() == "O")
					) {
					 
					 oWins(0,1,2);
				}
				 if((buttons[3].getText() == "O") &&
							(buttons[4].getText() == "O") &&
							(buttons[5].getText() == "O")
							) {
							 
							 oWins(3,4,5);
						}
				 if((buttons[6].getText() == "O") &&
							(buttons[7].getText() == "O") &&
							(buttons[8].getText() == "O")
							) {
							 
							 oWins(6,7,8);
						}
				 if((buttons[0].getText() == "O") &&
							(buttons[3].getText() == "O") &&
							(buttons[6].getText() == "O")
							) {
							 
							 oWins(0,3,6);
						}
				 if((buttons[1].getText() == "O") &&
							(buttons[4].getText() == "O") &&
							(buttons[7].getText() == "O")
							) {
							 
							 oWins(1,4,7);
						}
				 if((buttons[2].getText() == "O") &&
							(buttons[5].getText() == "O") &&
							(buttons[8].getText() == "O")
							) {
							 
							 oWins(2,5,8);
						}
				 if((buttons[0].getText() == "O") &&
							(buttons[4].getText() == "O") &&
							(buttons[8].getText() == "O")
							) {
							 
							 oWins(0,4,8);
						}
				 if((buttons[2].getText() == "O") &&
							(buttons[4].getText() == "O") &&
							(buttons[6].getText() == "O")
							) {
							 
							 oWins(2,4,6);
						}
				
		
		
	}
	
	public void xWins(int a, int b, int c) {
		
	}
	
	public void oWins(int a, int b, int c) {
		
	}
}