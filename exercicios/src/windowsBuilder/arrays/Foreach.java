package windowsBuilder.arrays;

import java.awt.EventQueue;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class Foreach {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Foreach window = new Foreach();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Foreach() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblForEach = new JLabel("FOR EACH");
		lblForEach.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblForEach, BorderLayout.NORTH);
		
		JLabel lblLista = new JLabel("Lista");
		frame.getContentPane().add(lblLista, BorderLayout.WEST);
		
		JComboBox comboBox = new JComboBox();
		frame.getContentPane().add(comboBox, BorderLayout.CENTER);
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};

		for (double nota : notas) {
			comboBox.addItem(Arrays.toString(notas));
		}
	}

}
