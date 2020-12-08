package windowsBuilder.arrays;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MatrizSwing {

	private JFrame frmNotasDoAluno;
	private JTextField qtdAlunos;
	private JTextField nota;
	private JTextField qtdNotas;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatrizSwing window = new MatrizSwing();
					window.frmNotasDoAluno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MatrizSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNotasDoAluno = new JFrame();
		frmNotasDoAluno.setTitle("NOTAS DO ALUNO");
		frmNotasDoAluno.setBounds(100, 100, 450, 300);
		frmNotasDoAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		frmNotasDoAluno.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNotasDoAluno = new JLabel("Quantidade de Notas");
		panel_2.add(lblNotasDoAluno);
		lblNotasDoAluno.setHorizontalAlignment(SwingConstants.CENTER);
		
		qtdNotas = new JTextField();
		panel_2.add(qtdNotas);
		qtdNotas.setColumns(10);
		
		JPanel panel = new JPanel();
		frmNotasDoAluno.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Aluno");
		panel.add(lblNewLabel);
		
		qtdAlunos = new JTextField();
		panel.add(qtdAlunos);
		qtdAlunos.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frmNotasDoAluno.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNota = new JLabel("Nota");
		panel_1.add(lblNota);
		
		nota = new JTextField();
		panel_1.add(nota);
		nota.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmNotasDoAluno.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JTextArea textArea = new JTextArea();
		panel_3.add(textArea);
		
		JPanel panel_4 = new JPanel();
		frmNotasDoAluno.getContentPane().add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String qtdNota = qtdNotas.getText();
				int quantasNotas = Integer.parseInt(qtdNota);
				
				String qtdAluno = qtdAlunos.getText();
				int quantosAlunos = Integer.parseInt(qtdAluno);
				
				String texto = String.valueOf(qtdAluno);
				textArea.setText(texto);
				System.out.println("Notas " + quantasNotas+"\n" + "Alunos " + quantosAlunos);
			}
		});
		panel_4.add(btnAdicionar, "name_5480913512533");
	}

}
