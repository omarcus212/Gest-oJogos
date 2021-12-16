package br.senai.sp.jandira.frame;

import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import br.senai.sp.jandira.Repository.*;
import br.senai.sp.jandira.Repositoryfabricante.RepositoryFabricante;
import br.senai.sp.jandira.fabricante.FabricanteDoJogo;
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
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.UIManager;

public class Framejogo extends JFrame {
	private JTextField textFieltitulo;
	private JTextField textField_valor;
	private int posicao = 0;

	public Framejogo() {
		getContentPane().setBackground(new Color(230, 230, 250));
		getContentPane().setForeground(new Color(75, 0, 130));

		setTitle("Jogos");
		getContentPane().setLayout(null);
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textFieltitulo = new JTextField();
		textFieltitulo.setBounds(102, 39, 143, 17);
		getContentPane().add(textFieltitulo);
		textFieltitulo.setColumns(10);

		textField_valor = new JTextField();
		textField_valor.setColumns(10);
		textField_valor.setBounds(111, 164, 86, 17);
		getContentPane().add(textField_valor);

		JLabel lblNewLabelnaoobrigatorio = new JLabel("(não obrigatorio!)");
		lblNewLabelnaoobrigatorio.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabelnaoobrigatorio.setBackground(Color.RED);
		lblNewLabelnaoobrigatorio.setForeground(Color.RED);
		lblNewLabelnaoobrigatorio.setEnabled(false);
		lblNewLabelnaoobrigatorio.setBounds(102, 183, 112, 17);
		getContentPane().add(lblNewLabelnaoobrigatorio);

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

		JLabel lblObservaes = new JLabel("Observações:");
		lblObservaes.setBounds(10, 204, 95, 14);
		getContentPane().add(lblObservaes);

		JLabel lblNewLabel_3_1 = new JLabel("Quantas Vezes:");
		lblNewLabel_3_1.setBounds(115, 102, 99, 14);
		getContentPane().add(lblNewLabel_3_1);

		JButton btnNewButtonsetaesquerda = new JButton("<");
		btnNewButtonsetaesquerda.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButtonsetaesquerda.setForeground(new Color(240, 248, 255));
		btnNewButtonsetaesquerda.setBackground(new Color(75, 0, 130));
		btnNewButtonsetaesquerda.setBounds(283, 281, 46, 23);
		getContentPane().add(btnNewButtonsetaesquerda);

		JButton btnNewButtonsetadireita = new JButton(">");
		btnNewButtonsetadireita.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButtonsetadireita.setForeground(new Color(240, 248, 255));
		btnNewButtonsetadireita.setBackground(new Color(75, 0, 130));
		btnNewButtonsetadireita.setBounds(339, 281, 46, 23);
		getContentPane().add(btnNewButtonsetadireita);

		/* coloquei o Enum de zerado ou não no combox para o fda escolher */
		JComboBox comboBoxZErado = new JComboBox();
		DefaultComboBoxModel<String> zeradomodel = new DefaultComboBoxModel<String>();

		comboBoxZErado.setEditable(true);
		comboBoxZErado.setForeground(new Color(245, 245, 245));
		comboBoxZErado.setBackground(new Color(75, 0, 130));
		comboBoxZErado.setBounds(57, 100, 48, 17);
		getContentPane().add(comboBoxZErado);
		comboBoxZErado.setModel(zeradomodel);


		/* aqui acaba */
		comboBoxZErado.setModel(new DefaultComboBoxModel(Zerado.values()));
		JComboBox comboBoxconsole = new JComboBox();
		comboBoxconsole.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxconsole.setForeground(new Color(240, 248, 255));
		comboBoxconsole.setEditable(true);
		comboBoxconsole.setBackground(new Color(75, 0, 130));
		DefaultComboBoxModel<String> consoles = new DefaultComboBoxModel<String>();
		comboBoxconsole.setBounds(67, 132, 116, 17);
		getContentPane().add(comboBoxconsole);

		for (Consoles c : Consoles.values()) {
			consoles.addElement(c.getconsole());
		}

		for(Zerado z : Zerado.values()) {
			zeradomodel.addElement(z.getzerado());
		}
		comboBoxconsole.setModel(consoles);

		/* aqui acaba */

		/*
		 * coloquei o Enum de quantidade de cezes que foi zerado no combox para o fda
		 * escolher
		 */
		JComboBox comboBoxquantidade = new JComboBox();
		comboBoxquantidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxquantidade.setEditable(true);
		DefaultComboBoxModel<String> quantidadezerado = new DefaultComboBoxModel<String>();
		comboBoxquantidade.setForeground(new Color(240, 248, 255));
		comboBoxquantidade.setBackground(new Color(75, 0, 130));
		comboBoxquantidade.setBounds(211, 101, 36, 17);

		getContentPane().add(comboBoxquantidade);

		DefaultComboBoxModel<String> quantidad = new DefaultComboBoxModel<String>();
		comboBoxquantidade.setModel(quantidad);
		for (QuantidadeZerado quantidade : QuantidadeZerado.values()) {
			quantidad.addElement(quantidade.getzerado());
		}

		/* aqui acaba */

		JComboBox comboBoxFabrica = new JComboBox();

		comboBoxFabrica.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBoxFabrica.setForeground(new Color(240, 248, 255));
		comboBoxFabrica.setEditable(true);
		comboBoxFabrica.setBackground(new Color(75, 0, 130));

		DefaultComboBoxModel<String> conso1les = new DefaultComboBoxModel<String>();
		comboBoxFabrica.setModel(conso1les);
		comboBoxFabrica.setBounds(80, 64, 108, 17);
		getContentPane().add(comboBoxFabrica);

		JTextPane textPaneobersa = new JTextPane();
		textPaneobersa.setForeground(new Color(75, 0, 130));
		textPaneobersa.setBackground(new Color(192, 192, 192));
		textPaneobersa.setBounds(102, 204, 143, 79);
		getContentPane().add(textPaneobersa);

		JButton btnNewButtonsalver = new JButton("Salver");
		btnNewButtonsalver.setForeground(new Color(230, 230, 250));
		btnNewButtonsalver.setBackground(new Color(75, 0, 130));
		btnNewButtonsalver.setBounds(27, 294, 112, 23);
		getContentPane().add(btnNewButtonsalver);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(282, 39, 157, 226);
		getContentPane().add(scrollPane);

		JList listjogo = new JList();
		DefaultListModel<String> listgame = new DefaultListModel<String>();
		
		scrollPane.setViewportView(listjogo);
		listjogo.setModel(listgame);
	

		JButton btnNewButtondeletar = new JButton("Deletar");
		btnNewButtondeletar.setForeground(new Color(230, 230, 250));
		btnNewButtondeletar.setBackground(new Color(75, 0, 130));
		btnNewButtondeletar.setBounds(283, 315, 102, 23);
		getContentPane().add(btnNewButtondeletar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(75, 0, 130));
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBounds(27, 328, 112, 23);
		getContentPane().add(btnLimpar);

		
		FabricanteDoJogo fb = new FabricanteDoJogo();
		String nome[] = fb.getNome();
		 for(String n : nome) {
			 conso1les.addElement(n);
		 }

		 
		RepositoryJogo jogorepositorio = new RepositoryJogo();

		btnNewButtonsalver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Jogo jogo = new Jogo();
				jogo.setTitulo(textFieltitulo.getText());
				jogo.setObservacao(textPaneobersa.getText());
				jogo.setZerado(obterzerado(comboBoxZErado.getSelectedIndex()));
				listgame.addElement(jogo.getTitulo());
             
				
				
				jogorepositorio.gravargames(jogo, posicao);
				posicao++;

			;
				
				//int progesoo = jogo;
			}
		});

		btnNewButtondeletar.addActionListener(new ActionListener() {

			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/**if(listjogo.getSelectedIndex() != -10) {
				
					int index = listjogo.getSelectionMode();
					 listgame.removeElementAt(index);
					  listgame.removeElement(jogorepositorio);
					  
						
				}else{
					JOptionPane.showMessageDialog(null, "selecione um jogo");
				}*/
				
		
			
				//(listjogo.getSelectionMode());
				
 			
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			   	textFieltitulo.setText(null);
			   	textPaneobersa.setText(null);
			   	textField_valor.setText(null);
				
			}
			
			
		});
			
		
		listjogo.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				Jogo jogo = jogorepositorio.jogoslist(listjogo.getSelectedIndex());
				textFieltitulo.setText(jogo.getTitulo());
				textPaneobersa.setText(jogo.getObservacao());
				comboBoxconsole.setSelectedIndex(jogo.getConsole().ordinal());
				
			
			
				
				
			}
		});

		btnNewButtonsetadireita.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(listjogo.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "escolha um jogo na lista");
				}else {
					listjogo.setSelectedIndex(listjogo.getSelectedIndex()+1);
				}
			 
				
				
			}
		});
		
		btnNewButtonsetaesquerda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(listjogo.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "escolha um jogo na lista");
				}else {
					listjogo.setSelectedIndex(listjogo.getSelectedIndex()-1);
				}
				
			 
				
				
			}
		});

		/* coloquei o Enum dos consoles para o fda escolher */

		/* e colocado aqui o action lisener do button salvar */

	}

	private QuantidadeZerado obterquantidadezerado(int quantidade) {
		if (quantidade == 0) {
			return (QuantidadeZerado.zero);
		} else if (quantidade == 1) {
			return (QuantidadeZerado.um);
		} else if (quantidade == 2) {
			return (QuantidadeZerado.dois);
		} else if (quantidade == 3) {
			return (QuantidadeZerado.tres);
		} else if (quantidade == 4) {
			return (QuantidadeZerado.quatro);
		} else {
			return (QuantidadeZerado.cinco);
		}
	}

	private Zerado obterzerado(int zerado) {
		if (zerado == 1) {
			return (Zerado.sim);
		} else {
			return (Zerado.nao);
		}
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
		} else if (consoleselect == 4) {
			return (Consoles.PLAYSTATIONONE);
		} else if (consoleselect == 5) {
			return (Consoles.PLAYSTATIOTWO);
		} else if (consoleselect == 6) {
			return (Consoles.XBOX);
		} else if (consoleselect == 7) {
			return (Consoles.XBOXONE);
		} else {
			return (Consoles.XBOXSERIEX);
		}

	}
}
