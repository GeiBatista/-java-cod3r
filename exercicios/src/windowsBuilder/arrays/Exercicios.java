package windowsBuilder.arrays;

import java.awt.EventQueue;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Exercicios {

	private JFrame frame;
	private JTextField jTFTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicios window = new Exercicios();
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
	public Exercicios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("NOTAS DO ALUNO");
		lblNewLabel.setBounds(0, 0, 450, 15);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 0, 36, 248);
		frame.getContentPane().add(lblTotal);

		jTFTotal = new JTextField();
		jTFTotal.setBounds(64, 115, 114, 19);
		frame.getContentPane().add(jTFTotal);
		jTFTotal.setColumns(10);

		double[] notasDoAluno = new double[3];

		notasDoAluno[0] = 5;
		notasDoAluno[1] = 3;
		notasDoAluno[2] = 8;

		double total = 0;

		for (int i = 0; i < notasDoAluno.length; i++) {
			total += notasDoAluno[i];
		}
		
		jTFTotal.setText(String.valueOf(total));
	}

}
