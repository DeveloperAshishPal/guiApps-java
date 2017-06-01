package guiApps;

import javax.swing.JWindow;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JProgressBar;

public class splashScream extends JWindow {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int counter = 1;
	JProgressBar progressBar = new JProgressBar();
	
	public static void main(String[] args) {
					splashScream frame = new splashScream();
					frame.setVisible(true);
					frame.doProgress();
	}
	
	Timer timer;
	
	private void doProgress() {
		// TODO Auto-generated method stub
		timer = new Timer(100, new ActionListener(){
			public void actionPerformed(ActionEvent e){
				progressBar.setValue(counter);
				if(counter==100){
					timer.stop();
					splashScream.this.setVisible(false);
					MainScrean mainScreen = new MainScrean();
					mainScreen.setVisible(true);
				}
				counter++;
			}
		});			
		timer.start();
	}

	/**
	 * Create the frame.
	 */
	public splashScream() {
		setBounds(100, 100, 404, 300);
		getContentPane().setLayout(null);
		Icon icon = new ImageIcon(splashScream.class.getResource("giphy.gif"));
		
		
		
		JLabel lblTicTacToe = new JLabel("TIC TAC TOE - DESKTOP GAME");
		lblTicTacToe.setFont(new Font("Lato Semibold", Font.BOLD, 16));
		lblTicTacToe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicTacToe.setBounds(67, 244, 279, 33);
		getContentPane().add(lblTicTacToe);
		
		progressBar.setForeground(Color.YELLOW);
		progressBar.setBackground(Color.GREEN);
		progressBar.setStringPainted(true);
		progressBar.setBounds(12, 274, 379, 14);
		getContentPane().add(progressBar);

		JLabel lblimage = new JLabel("");
		lblimage.setHorizontalAlignment(SwingConstants.CENTER);
		lblimage.setIcon(icon);
		lblimage.setBounds(12, 12, 379, 220);
		getContentPane().add(lblimage);

	}
}
