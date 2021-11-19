package br.senai.sp.jandira.frame;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import br.senai.sp.jandira.Repository.RepositoryJogo;
import br.senai.sp.jandira.Repositoryfabricante.RepositoryFabricante;
import br.senai.sp.jandira.jogo.Consoles;
import br.senai.sp.jandira.jogo.Jogo;
import br.senai.sp.jandira.jogo.QuantidadeZerado;
import br.senai.sp.jandira.jogo.Zerado;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

public class Framejogo extends JFrame {
	private JTextField textFieldnome;
	private JTextField textField_valor;
	private JTextField obseervçao;
	private int posicao = 0;
	
	public Framejogo() {
		setTitle("Jogos");
		getContentPane().setLayout(null);
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		textFieldnome = new JTextField();
		textFieldnome.setBounds(102, 39, 143, 17);
		getContentPane().add(textFieldnome);
		textFieldnome.setColumns(10);
		
		textField_valor = new JTextField();
		textField_valor.setColumns(10);
		textField_valor.setBounds(111, 164, 86, 17);
		getContentPane().add(textField_valor);
		
		obseervçao = new JTextField();
		obseervçao.setColumns(10);
		obseervçao.setBounds(102, 192, 160, 69);
		getContentPane().add(obseervçao);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 39, 127, 214);
		getContentPane().add(scrollPane);
		
		JList listjogos = new JList();
		scrollPane.setViewportView(listjogos);
		
		JLabel lblNewLabel = new JLabel("Nome do jogo:");
		lblNewLabel.setBounds(10, 41, 95, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(10, 66, 73, 14);
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
		lblValor.setBounds(10, 166, 95, 14);
		getContentPane().add(lblValor);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservaes.setBounds(10, 192, 95, 14);
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
		comboBoxquantidade.addItem("1");comboBoxquantidade.addItem("2");
		comboBoxquantidade.addItem("3");comboBoxquantidade.addItem("4");
		comboBoxquantidade.addItem("5");
		getContentPane().add(comboBoxquantidade);

		
           
        	   
		
		
		/*aqui acaba*/
	
		String dias[] = { "EA sport", "Microsoft", "Xbox", "ActionVisa", "Sony" };

		
		JComboBox comboBoxFabrica = new JComboBox();
		
		comboBoxFabrica.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxFabrica.setForeground(new Color(240, 248, 255));
		comboBoxFabrica.setEditable(true);
		comboBoxFabrica.setBackground(new Color(75, 0, 130));
		 DefaultComboBoxModel<String> conso1les = new DefaultComboBoxModel<String>(dias);
		 comboBoxFabrica.setModel(conso1les);
		comboBoxFabrica.setBounds(80, 64, 108, 17);
		getContentPane().add(comboBoxFabrica);
	    ;
	    

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
	     
	    RepositoryJogo joguinho = new RepositoryJogo();
	    
btnNewButtonsalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Jogo jogo = new Jogo();
		jogo.setTitulo(textFieldnome.getText());
		jogo.setValor(textField_valor.getText());
		jogo.setConsole(obterconsole(comboBox.getSelectedIndex()));
				
		DefaultComboBoxModel<String> listmodel = new DefaultComboBoxModel<String>();
		  listjogos.setModel(listmodel);
	  listmodel.addElement(jogo.getTitulo());
	  
	  joguinho.gravargames(jogo, posicao);
	  posicao++;
				
				
	  if(posicao == joguinho.gettamanho()) {
		  btnNewButtonsalvar.setEnabled(false);
		  JOptionPane.showMessageDialog(null, "se Esgoto");
	  }
	  
	  
			}
		});
	
		
		
		
		
		
		
		
		
		
		
		
	    
	}
	
	private Consoles obterconsole(int consoleselect) {

		// para descobrir o periodod do aluno

		if (consoleselect == 0) {
			return (Consoles.NITENDO);
		} else if (consoleselect == 1) {
			return (Consoles.PLAYSTATIOFIVE);
		} else if (consoleselect == 2) {
			return (Consoles.PLAYSTATIOFOR);
		} else if (consoleselect == 3) {
			return (Consoles.PLAYSTATION);
		} else if(consoleselect == 4){
			return (Consoles.PLAYSTATIONONE);
		}else if(consoleselect == 5){
			return (Consoles.PLAYSTATIOTWO);
		}else if(consoleselect == 6){
			return (Consoles.XBOX);
		}else if(consoleselect == 7){
			return (Consoles.XBOXONE);
		}else {
			return (Consoles.XBOXSERIEX);
		}
		
		
	}
}
