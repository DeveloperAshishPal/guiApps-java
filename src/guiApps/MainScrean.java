package guiApps;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MainScrean extends JFrame {

	private JPanel contentPane;
	MP3Player mp3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					MainScrean frame = new MainScrean();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public MainScrean() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 434);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		
		JMenuItem mntmTictactoe = new JMenuItem("TicTacToe");
		mnGame.add(mntmTictactoe);
		
		JMenuItem mntmSudoku = new JMenuItem("Sudoku");
		mnGame.add(mntmSudoku);
		
		JMenuItem mntmLogoquiz = new JMenuItem("LogoQuiz");
		mnGame.add(mntmLogoquiz);
		
		JMenuItem mntmAntSmasher = new JMenuItem("Ant Smasher");
		mnGame.add(mntmAntSmasher);
		
		JMenuItem mntmSnake = new JMenuItem("Snake");
		mnGame.add(mntmSnake);
		
		JMenuItem mntmPackman = new JMenuItem("Packman");
		mnGame.add(mntmPackman);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mnHelp.add(mntmAboutUs);
		
		JMenuItem mntmTutorial = new JMenuItem("Tutorial");
		mnHelp.add(mntmTutorial);
		
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		getContentPane().setLayout(null);
		
		Icon icon = new ImageIcon(MainScrean.class.getResource("giphy.gif"));
	}
}
