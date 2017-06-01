package guiApps;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AirCrash extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					AirCrash frame = new AirCrash();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public AirCrash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
	}

}
