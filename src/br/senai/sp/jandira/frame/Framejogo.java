package br.senai.sp.jandira.frame;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import br.senai.sp.jandira.Repository.RepositoryJogo;
import br.senai.sp.jandira.jogo.Consoles;
import br.senai.sp.jandira.jogo.Fabricantesjogos;
import br.senai.sp.jandira.jogo.Jogo;
import br.senai.sp.jandira.jogo.QuantidadeZerado;
import br.senai.sp.jandira.jogo.Zerado;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

public class Framejogo extends JFrame {
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	
	
	public Framejogo() {
		setTitle("Jogos");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		textField = new JTextField();
		textField.setBounds(102, 39, 143, 17);
		getContentPane().add(textField);
		textField.setColumns(10);
		
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
		lblNewLabel.setBounds(10, 41, 95, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(10, 66, 58, 14);
		getContentPane().add(lblFabricante);
		
		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setBounds(272, 21, 92, 14);
		getContentPane().add(lblMeusJogos);
		
		JLabel lblZerado = new JLabel("Zerado:");
		lblZerado.setBounds(10, 102, 46, 14);
		getContentPane().add(lblZerado);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(13, 133, 58, 14);
		getContentPane().add(lblConsole);
		
		JLabel lblValor = new JLabel("Valor estimado:");
		lblValor.setBounds(13, 165, 74, 14);
		getContentPane().add(lblValor);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservaes.setBounds(10, 192, 74, 14);
		getContentPane().add(lblObservaes);
		
		JLabel lblNewLabel_3_1 = new JLabel("Quantas Vezes:");
		lblNewLabel_3_1.setBounds(115, 102, 99, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		JButton btnNewButtonsalvar = new JButton("Salvar");
		btnNewButtonsalvar.setForeground(new Color(240, 248, 255));
		btnNewButtonsalvar.setBackground(new Color(75, 0, 130));
		btnNewButtonsalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
		/*tireado o action lisener criador do button salvar daqui*/
		btnNewButtonsalvar.setBounds(44, 295, 89, 23);
		getContentPane().add(btnNewButtonsalvar);
		
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
		
		/*coloquei o Enum de zerado ou não no combox para o fda escolher*/
		JComboBox comboBoxZErado = new JComboBox();
		DefaultComboBoxModel<String> zeradomodel = new DefaultComboBoxModel<String>();
		
		comboBoxZErado.setEditable(true);
		comboBoxZErado.setForeground(new Color(245, 245, 245));
		comboBoxZErado.setBackground(new Color(75, 0, 130));
		comboBoxZErado.setBounds(57, 100, 48, 17);
		getContentPane().add(comboBoxZErado);
		
		for(Zerado zerado : Zerado.values()) {
			zeradomodel.addElement(zerado.getzerado());
		}
		comboBoxZErado.setModel(zeradomodel);
		
		/*aqui acaba*/
		
		/*coloquei o Enum de quantidade de cezes que foi zerado no combox para o fda escolher*/
		JComboBox comboBoxquantidade = new JComboBox();
		comboBoxquantidade.setEditable(true);
		DefaultComboBoxModel<String> quantidadezerado = new DefaultComboBoxModel<String>();
		comboBoxquantidade.setForeground(new Color(240, 248, 255));
		comboBoxquantidade.setBackground(new Color(75, 0, 130));
		comboBoxquantidade.setBounds(211, 101, 36, 17);
		getContentPane().add(comboBoxquantidade);


		for(QuantidadeZerado vezeszerado : QuantidadeZerado.values()){
			quantidadezerado.addElement(vezeszerado.getzerado());
			
		}
		comboBoxquantidade.setModel(quantidadezerado);
		
		/*aqui acaba*/
	
		
		
		JComboBox comboBoxFabrica = new JComboBox();
		comboBoxFabrica.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxFabrica.setForeground(new Color(240, 248, 255));
		comboBoxFabrica.setEditable(true);
		comboBoxFabrica.setBackground(new Color(75, 0, 130));
		DefaultComboBoxModel<String> fabricante = new DefaultComboBoxModel<String>();
		comboBoxFabrica.setBounds(75, 67, 108, 17);
		getContentPane().add(comboBoxFabrica);
		
		for(Fabricantesjogos f : Fabricantesjogos.values()) {
			fabricante.addElement(f.getFrabica());
		}
		comboBoxFabrica.setModel(fabricante);
		
		/*aqui acaba*/
		
	    
	    JScrollPane scrollPane_1 = new JScrollPane();
	    scrollPane_1.setBounds(194, 67, 68, 17);
	    getContentPane().add(scrollPane_1);
	    JList list = new JList();
	    scrollPane_1.setViewportView(list);
	    

		/*coloquei o Enum dos consoles para o fda escolher*/
	    
	    JComboBox comboBox = new JComboBox();
	    comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
	    comboBox.setForeground(new Color(240, 248, 255));
	    comboBox.setEditable(true);
	    comboBox.setBackground(new Color(75, 0, 130));
	    DefaultComboBoxModel<String> consoles = new DefaultComboBoxModel<String>();
	    comboBox.setBounds(67, 132, 116, 17);
	    getContentPane().add(comboBox);
	    
	    for(Consoles c : Consoles.values()) {
	    	consoles.addElement(c.getconsole());
	    }
	    comboBox.setModel(consoles);
	    
	    /*aqui acaba*/
	    
	    	
	    /*e colocado aqui o action lisener do button salvar */
	     
	    
	    
btnNewButtonsalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
		
				
				
				
				
			}
		});
	    	
	    
	
		
		
		
		
		
		
		
		
		
		
		
	    
	}
		
	
}
