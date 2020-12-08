package windowsBuilder.arrays;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DesafioArray {

	private JFrame frame;
	private JTextField textField_Notas;
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
		
		JLabel lblTotal = new JLabel("Total das Notas");
		lblTotal.setBounds(0, 85, 128, 15);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblMdiaDasNotas = new JLabel("Média das Notas");
		lblMdiaDasNotas.setBounds(0, 112, 147, 15);
		frame.getContentPane().add(lblMdiaDasNotas);
		
		textField_Notas = new JTextField();
		textField_Notas.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				int qtdDeNotas = Integer.parseInt(textField_Qtd.getText());				
				int[] notas = new int[qtdDeNotas];							
				
				//for (int i = 0; i < notas.length; i++) {
					textField_Qtd.setText("");
					notas[0] = Integer.parseInt(textField_Notas.getText());
					
					System.out.println(Arrays.toString(notas));	
				//}
			}
		});
		
		Scanner entrada = new Scanner(System.in);
		
		textField_Notas.setBounds(129, 48, 51, 19);
		frame.getContentPane().add(textField_Notas);
		textField_Notas.setColumns(10);
		
		textField_Qtd = new JTextField();
		textField_Qtd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				int qtdDeNotas = Integer.parseInt(textField_Qtd.getText());				
//				int[] notas = new int[qtdDeNotas];
//							
//				
//				for (int i = 0; i < notas.length; i++) {
//					notas[i] = Integer.parseInt(textField_Notas.getText());
//					System.out.println(notas);			
//				}
//				
//				
//				System.out.println(Arrays.toString(notas));
		}
		});
		textField_Qtd.setColumns(10);
		textField_Qtd.setBounds(127, 17, 114, 19);
		frame.getContentPane().add(textField_Qtd);
		
		textField_Total = new JTextField();
		textField_Total.setColumns(10);
		textField_Total.setBounds(127, 83, 114, 19);
		frame.getContentPane().add(textField_Total);
		
		textField_Media = new JTextField();
		textField_Media.setBounds(127, 110, 114, 19);
		frame.getContentPane().add(textField_Media);
		textField_Media.setColumns(10);
		
		JLabel lblNotas = new JLabel("Notas");
		lblNotas.setBounds(0, 48, 70, 25);
		frame.getContentPane().add(lblNotas);
		
//		textField_Qtd.setText("0");
//		int qtdDeNotas = Integer.parseInt(textField_Qtd.getText());
//				
//		int[] notas = new int[qtdDeNotas];
//		
//		for (int i = 0; i < notas.length; i++) {
//			notas[i] = Integer.parseInt(textField_Notas.getText());
//			System.out.println(notas);			
//		}
	}
}
