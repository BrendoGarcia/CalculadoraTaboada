package tel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.Spring;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class telas {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextField numero;
	int x;
	Spring calculo;
	int valor;
	private JLabel numeros;
	private JLabel resultado;
	private JLabel resultado_1;
	private JLabel resultado_2;
	private JLabel resultado_3;
	private JLabel resultado_4;
	private JLabel resultado_5;
	private JLabel resultado_6;
	private JLabel resultado_7;
	private JLabel resultado_8;
	private JLabel resultado_9;
	private JLabel taboada;
	private final JLabel taboadacalculeitor = new JLabel("Calculadora de Taboada");
	private JLabel lblNewLabel_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telas window = new telas();
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
	public telas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		numero = new JTextField();
		numero.setBounds(99, 47, 213, 20);
		frame.getContentPane().add(numero);
		numero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Informe o Número");
		lblNewLabel.setBounds(158, 22, 154, 14);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor = Integer.parseInt(numero.getText());
				int calculo1 = 0;
				int calculo2 = 0;
				int calculo3 = 0;
				int calculo4 = 0;
				int calculo5 = 0;
				int calculo6 = 0;
				int calculo7 = 0;
				int calculo8 = 0;
				int calculo9 = 0;
				int calculo10 = 0;
				
				for(x = 1; x <= 10; x++ ) {
					
					
					
					calculo1 = valor * 1;
					calculo2 = valor * 2;
					calculo3 = valor * 3;
					calculo4 = valor * 4;
					calculo5 = valor * 5;
					calculo6 = valor * 6;
					calculo7 = valor * 7;
					calculo8 = valor * 8;
					calculo9 = valor * 9;
					calculo10 = valor * 10;
					
					//System.out.println(numero.getText()+ " X " + x  +" = " + calculo);
					
					
					//lblNewLabel_1.setText(numero.getText()); 
					resultado.setText(numero.getText()+" X " + 1  +" = " + calculo1);
					resultado_1.setText(numero.getText()+ " X " + 2 + " = " + calculo2);
					resultado_2.setText(numero.getText()+ " X " + 3 + " = " + calculo3);
					resultado_3.setText(numero.getText()+ " X " + 4 + " = " + calculo4);
					resultado_4.setText(numero.getText()+ " X " + 5 + " = " + calculo5);
					resultado_5.setText(numero.getText()+ " X " + 6 + " = " + calculo6);
					resultado_6.setText(numero.getText()+ " X " + 7 + " = " + calculo7);
					resultado_7.setText(numero.getText()+ " X " + 8 + " = " + calculo8);
					resultado_8.setText(numero.getText()+ " X " + 9 + " = " + calculo9);
					resultado_9.setText(numero.getText()+ " X " + 10 + " = " + calculo10);
					taboada.setText("Taboada do " + numero.getText() );
					taboadacalculeitor.setVisible(false);
					
				}
				
				
			
				
			}
		});
		btnNewButton.setBounds(322, 46, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		resultado = new JLabel();
		resultado.setBounds(5, 107, 307, 23);
		frame.getContentPane().add(resultado);
		
		resultado_1 = new JLabel();
		resultado_1.setBounds(5, 137, 307, 23);
		frame.getContentPane().add(resultado_1);
		
		resultado_2 = new JLabel();
		resultado_2.setBounds(5, 164, 307, 23);
		frame.getContentPane().add(resultado_2);
		
		resultado_3 = new JLabel();
		resultado_3.setBounds(5, 190, 307, 23);
		frame.getContentPane().add(resultado_3);
		
		resultado_4 = new JLabel();
		resultado_4.setBounds(5, 218, 307, 23);
		frame.getContentPane().add(resultado_4);
		
		resultado_5 = new JLabel();
		resultado_5.setBounds(5, 247, 307, 23);
		frame.getContentPane().add(resultado_5);
		
		resultado_6 = new JLabel();
		resultado_6.setBounds(5, 275, 307, 23);
		frame.getContentPane().add(resultado_6);
		
		resultado_7 = new JLabel();
		resultado_7.setBounds(5, 299, 307, 23);
		frame.getContentPane().add(resultado_7);
		
		resultado_8 = new JLabel();
		resultado_8.setBounds(5, 325, 307, 23);
		frame.getContentPane().add(resultado_8);
		
		resultado_9 = new JLabel();
		resultado_9.setBounds(5, 349, 307, 23);
		frame.getContentPane().add(resultado_9);
		
		taboada = new JLabel();
		taboada.setBounds(170, 94, 142, 14);
		frame.getContentPane().add(taboada);
		taboadacalculeitor.setHorizontalAlignment(SwingConstants.CENTER);
		taboadacalculeitor.setBounds(5, 77, 429, 31);
		frame.getContentPane().add(taboadacalculeitor);
		
		lblNewLabel_1 = new JLabel("Desenvolvido por Brendo");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 493, 424, 47);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
	}
}
