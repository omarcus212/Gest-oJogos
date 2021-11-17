package br.senai.sp.jandira.frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Framejogo extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	
	public Framejogo() {
		setTitle("Jogos");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		textField = new JTextField();
		textField.setBounds(85, 39, 143, 17);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(69, 66, 178, 17);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(69, 102, 36, 17);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(69, 134, 178, 17);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(97, 164, 86, 17);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(85, 192, 160, 69);
		getContentPane().add(textField_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 39, 127, 214);
		getContentPane().add(scrollPane);
		
		JList listdejogos = new JList();
		scrollPane.setRowHeaderView(listdejogos);
		
		JLabel lblNewLabel = new JLabel("Nome do jogo:");
		lblNewLabel.setBounds(10, 41, 77, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(10, 66, 58, 14);
		getContentPane().add(lblFabricante);
		
		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setBounds(272, 21, 92, 14);
		getContentPane().add(lblMeusJogos);
		
		JLabel lblZerado = new JLabel("Zerado:");
		lblZerado.setBounds(13, 102, 46, 14);
		getContentPane().add(lblZerado);
		
		JLabel lblConsole = new JLabel("Console");
		lblConsole.setBounds(13, 133, 46, 14);
		getContentPane().add(lblConsole);
		
		JLabel lblValor = new JLabel("Valor estimado:");
		lblValor.setBounds(13, 165, 74, 14);
		getContentPane().add(lblValor);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservaes.setBounds(10, 192, 74, 14);
		getContentPane().add(lblObservaes);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(195, 102, 52, 17);
		getContentPane().add(textField_6);
		
		JLabel lblNewLabel_3_1 = new JLabel("Quantas Vezes:");
		lblNewLabel_3_1.setBounds(115, 100, 90, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setForeground(new Color(240, 248, 255));
		btnNewButton.setBackground(new Color(75, 0, 130));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(44, 295, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(240, 248, 255));
		btnNewButton_1.setBackground(new Color(75, 0, 130));
		btnNewButton_1.setBounds(283, 281, 46, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(">");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(240, 248, 255));
		btnNewButton_2.setBackground(new Color(75, 0, 130));
		btnNewButton_2.setBounds(339, 281, 46, 23);
		getContentPane().add(btnNewButton_2);

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
