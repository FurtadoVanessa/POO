package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CarregarArquivo extends JFrame {

	private JPanel contentPane;
	private JTextField configuracao;
	private JTextField cache;
	private JTextField principal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarregarArquivo frame = new CarregarArquivo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CarregarArquivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecionarArquivo = new JLabel("Selecionar arquivo de configuracao");
		lblSelecionarArquivo.setBounds(10, 47, 313, 14);
		contentPane.add(lblSelecionarArquivo);
		
		configuracao = new JTextField();
		configuracao.setBounds(10, 72, 313, 20);
		contentPane.add(configuracao);
		configuracao.setColumns(10);
		
		JButton procurarConfiguracao = new JButton("Procurar");
		procurarConfiguracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser(); 
			    chooser.setCurrentDirectory(new java.io.File("."));
			    chooser.setDialogTitle("Selecionar Configuraçaõ");
			    
			    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
			        System.out.println("getCurrentDirectory(): " 
			           +  chooser.getCurrentDirectory());
			        System.out.println("getSelectedFile() : " 
			           +  chooser.getSelectedFile());
			       configuracao.setText(chooser.getSelectedFile().getAbsolutePath());
			        }
			      else {
			        System.out.println("No Selection ");
			        }
			       }
			
		});
		procurarConfiguracao.setBounds(335, 71, 89, 23);
		contentPane.add(procurarConfiguracao);
		
		JLabel lblSelecionarArquivoDa = new JLabel("Selecionar arquivo da Cache");
		lblSelecionarArquivoDa.setBounds(10, 103, 313, 14);
		contentPane.add(lblSelecionarArquivoDa);
		
		cache = new JTextField();
		cache.setBounds(10, 128, 313, 20);
		contentPane.add(cache);
		cache.setColumns(10);
		
		JButton procurarCache = new JButton("Procurar");
		procurarCache.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser(); 
			    chooser.setCurrentDirectory(new java.io.File("."));
			    chooser.setDialogTitle("Selecionar Configuraçaõ");
			    
			    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
			        System.out.println("getCurrentDirectory(): " 
			           +  chooser.getCurrentDirectory());
			        System.out.println("getSelectedFile() : " 
			           +  chooser.getSelectedFile());
			        cache.setText(chooser.getSelectedFile().getAbsolutePath());
			        }
			      else {
			        System.out.println("No Selection ");
			        }
			       
			}
		});
		procurarCache.setBounds(335, 127, 89, 23);
		contentPane.add(procurarCache);
		
		JLabel lblSelecionarArquivoDa_1 = new JLabel("Selecionar arquivo da Memoria Principal");
		lblSelecionarArquivoDa_1.setBounds(10, 159, 313, 14);
		contentPane.add(lblSelecionarArquivoDa_1);
		
		principal = new JTextField();
		principal.setBounds(10, 184, 313, 20);
		contentPane.add(principal);
		principal.setColumns(10);
		
		JButton procurarPrincipal = new JButton("Procurar");
		procurarPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser(); 
			    chooser.setCurrentDirectory(new java.io.File("."));
			    chooser.setDialogTitle("Selecionar Configuraçaõ");
			    
			    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
			        System.out.println("getCurrentDirectory(): " 
			           +  chooser.getCurrentDirectory());
			        System.out.println("getSelectedFile() : " 
			           +  chooser.getSelectedFile());
			        principal.setText(chooser.getSelectedFile().getAbsolutePath());
			        }
			      else {
			        System.out.println("No Selection ");
			        }
			       
			}
		});
		procurarPrincipal.setBounds(335, 181, 89, 23);
		contentPane.add(procurarPrincipal);
		
		JButton simular = new JButton("Simular Cache");
		simular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Simulador simulador = new Simulador(configuracao.getText(), cache.getText(), principal.getText());
				
			}
		});
		simular.setBounds(143, 227, 159, 23);
		contentPane.add(simular);
		
		JLabel lblSimuladorDeMemoria = new JLabel("Simulador de Memoria Cache");
		lblSimuladorDeMemoria.setBounds(107, 11, 216, 14);
		contentPane.add(lblSimuladorDeMemoria);
	}
}
