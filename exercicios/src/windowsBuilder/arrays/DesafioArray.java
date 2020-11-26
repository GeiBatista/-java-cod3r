package windowsBuilder.arrays;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DesafioArray {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_Qtd;
	private JTextField textField_Total;
	private JTextField textField_Media;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesafioArray window = new DesafioArray();
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
	public DesafioArray() {
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
		
		JLabel lblArray = new JLabel("ARRAY");
		lblArray.setBounds(0, 0, 450, 15);
		lblArray.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblArray);
		
		JLabel lblQtdeNotas = new JLabel("Qtde Notas");
		lblQtdeNotas.setBounds(0, 15, 111, 23);
		frame.getContentPane().add(lblQtdeNotas);
		
		textField = new JTextField();
		textField.setBounds(117, 48, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total das Notas");
		lblTotal.setBounds(0, 50, 128, 15);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblMdiaDasNotas = new JLabel("Média das Notas");
		lblMdiaDasNotas.setBounds(0, 77, 147, 15);
		frame.getContentPane().add(lblMdiaDasNotas);
		
		textField_Qtd = new JTextField();
		textField_Qtd.setColumns(10);
		textField_Qtd.setBounds(107, 17, 114, 19);
		frame.getContentPane().add(textField_Qtd);
		
		textField_Total = new JTextField();
		textField_Total.setColumns(10);
		textField_Total.setBounds(117, 48, 114, 19);
		frame.getContentPane().add(textField_Total);
		
		textField_Media = new JTextField();
		textField_Media.setBounds(127, 75, 114, 19);
		frame.getContentPane().add(textField_Media);
		textField_Media.setColumns(10);
		
		int qtdDeNotas = Integer.parseInt(textField_Qtd.getText());
				
		int[] notas = new int[qtdDeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			
		}
	}
}
