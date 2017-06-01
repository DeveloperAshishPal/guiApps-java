package guiApps;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tictactoe extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button1 = new JButton("");
	JButton button2 = new JButton("");
	JButton button3 = new JButton("");
	JButton button4 = new JButton("");
	JButton button5 = new JButton("");
	JButton button6 = new JButton("");
	JButton button7 = new JButton("");
	JButton button8 = new JButton("");
	JButton button9 = new JButton("");
	private boolean isXorZero = false;
	private String whoWins;
	private int counter = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		printXorZero(e);
		
	}
	
	public void printXorZero(ActionEvent e){
		JButton button = (JButton) e.getSource();
		if(button.getText().trim().length()==0){
			// this means the button is empty
			counter++;
			if(!isXorZero){
				button.setText("X");
			}else{
				button.setText("0");
			}
			isXorZero = !isXorZero;
			whoWins = isXorZero?"X Wins":"0 Wins";
			if(counter<9){
			if(isWin()){
				JOptionPane.showMessageDialog(this, "Game Over " + whoWins);
				resetGame();
			}
			}else{
				JOptionPane.showMessageDialog(this, "Game Over its a draw");
				resetGame();
			}
		}
	}
	
	public void resetGame(){
		button1.setText("");
		button2.setText("");
		button3.setText("");
		button4.setText("");
		button5.setText("");
		button6.setText("");
		button7.setText("");
		button8.setText("");
		button9.setText("");
		isXorZero = false;
		counter = 0;
	}
	
	public boolean isNotBlank(JButton button){
		if(button.getText().trim().length()>0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isTripletNotBlankAndEqual(JButton btnOne,JButton btnTwo,JButton btnThree){
		if(isNotBlank(btnOne) && isNotBlank(btnTwo) && isNotBlank(btnThree)){
			if(btnOne.getText().equals(btnTwo.getText()) && btnOne.getText().equals(btnThree.getText())){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	public boolean isWin(){
		if(isTripletNotBlankAndEqual(button1, button2, button3)){
			return true;
		}else if(isTripletNotBlankAndEqual(button4, button5, button6)){
			return true;
		}else if(isTripletNotBlankAndEqual(button7, button8, button9)){
			return true;
		}else if(isTripletNotBlankAndEqual(button1, button4, button7)){
			return true;
		}else if(isTripletNotBlankAndEqual(button2, button5, button8)){
			return true;
		}else if(isTripletNotBlankAndEqual(button3, button6, button9)){
			return true;
		}else if(isTripletNotBlankAndEqual(button1, button5, button9)){
			return true;
		}else if(isTripletNotBlankAndEqual(button3, button5, button7)){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
					tictactoe frame = new tictactoe();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public tictactoe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 381);
		getContentPane().setLayout(null);
		
		
		button1.setFont(new Font("Dialog", Font.BOLD, 16));
		button1.setBounds(19, 12, 136, 75);
		getContentPane().add(button1);
		
		
		button2.setFont(new Font("Dialog", Font.BOLD, 16));
		button2.setBounds(167, 12, 136, 75);
		getContentPane().add(button2);
		
		
		button3.setFont(new Font("Dialog", Font.BOLD, 16));
		button3.setBounds(315, 12, 136, 75);
		getContentPane().add(button3);
		
		
		button4.setFont(new Font("Dialog", Font.BOLD, 16));
		button4.setBounds(19, 114, 136, 75);
		getContentPane().add(button4);
		
		
		button5.setFont(new Font("Dialog", Font.BOLD, 16));
		button5.setBounds(167, 114, 136, 75);
		getContentPane().add(button5);
		
		
		button6.setFont(new Font("Dialog", Font.BOLD, 16));
		button6.setBounds(315, 114, 136, 75);
		getContentPane().add(button6);
		
		
		button7.setFont(new Font("Dialog", Font.BOLD, 16));
		button7.setBounds(19, 213, 136, 75);
		getContentPane().add(button7);
		
		
		button8.setFont(new Font("Dialog", Font.BOLD, 16));
		button8.setBounds(167, 213, 136, 75);
		getContentPane().add(button8);
		
		
		button9.setFont(new Font("Dialog", Font.BOLD, 16));
		button9.setBounds(315, 213, 136, 75);
		getContentPane().add(button9);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
	}

}
