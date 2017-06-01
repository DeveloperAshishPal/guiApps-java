package guiApps;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AntSmasher extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
					AntSmasher frame = new AntSmasher();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	
	public AntSmasher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		Icon icon = new ImageIcon(AntSmasher.class.getResource("antg.gif"));
		
		JLabel ant = new JLabel();
		ant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ant.setVisible(false);
			}
		});
		ant.setIcon(icon);
		ant.setBounds(12, 66, 45, 30);
		getContentPane().add(ant);
		
		JLabel ant2 = new JLabel();
		ant2.setIcon(icon);
		ant2.setBounds(12, 139, 45, 30);
		ant2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ant2.setVisible(false);
			}
		});
		getContentPane().add(ant2);
		
		JLabel ant3 = new JLabel();
		ant3.setIcon(icon);
		ant3.setBounds(12, 213, 45, 30);
		ant3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ant3.setVisible(false);
			}
		});
		getContentPane().add(ant3);
		
		JLabel ant4 = new JLabel();
		ant4.setIcon(icon);
		ant4.setBounds(201, 42, 45, 30);
		ant4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ant4.setVisible(false);
			}
		});
		getContentPane().add(ant4);
		
		JLabel ant5 = new JLabel();
		ant5.setIcon(icon);
		ant5.setBounds(188, 163, 45, 30);
		ant5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ant5.setVisible(false);
			}
		});
		getContentPane().add(ant5);
		
		JLabel ant6 = new JLabel();
		ant6.setIcon(icon);
		ant6.setBounds(317, 242, 45, 30);
		ant6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ant6.setVisible(false);
			}
		});
		getContentPane().add(ant6);
		
		JLabel ant7 = new JLabel();
		ant7.setIcon(icon);
		ant7.setBounds(341, 81, 45, 30);
		ant7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ant7.setVisible(false);
			}
		});
		getContentPane().add(ant7);
		
	}

}
