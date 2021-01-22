package Tela;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtProduto;
	private JTextField txtMarca;
	private JTextField txtValor;
	private JTextField txtData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setTitle("Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(33, 27, 59, 26);
		contentPane.add(lblNewLabel);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(91, 30, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProduto.setBounds(33, 61, 59, 26);
		contentPane.add(lblProduto);
		
		txtProduto = new JTextField();
		txtProduto.setColumns(10);
		txtProduto.setBounds(91, 64, 181, 20);
		contentPane.add(txtProduto);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMarca.setBounds(33, 98, 59, 26);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(91, 101, 181, 20);
		contentPane.add(txtMarca);
		
		JLabel lblMarca_1 = new JLabel("Valor");
		lblMarca_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMarca_1.setBounds(33, 135, 59, 26);
		contentPane.add(lblMarca_1);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(91, 138, 86, 20);
		contentPane.add(txtValor);
		
		JLabel lblMarca_1_1 = new JLabel("Data");
		lblMarca_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMarca_1_1.setBounds(33, 172, 59, 26);
		contentPane.add(lblMarca_1_1);
		
		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(91, 175, 86, 20);
		contentPane.add(txtData);
		
		ScrollPane tabelaDados = new ScrollPane();
		tabelaDados.setBounds(296, 27, 267, 259);
		contentPane.add(tabelaDados);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCadastrar.setBounds(74, 226, 133, 37);
		contentPane.add(btnCadastrar);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
