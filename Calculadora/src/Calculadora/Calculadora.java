package Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculadora extends JFrame {

	private JPanel base;
	private JPanel areaDeCalculo;
	private JTextField barraDeCalculo;
	private JPanel linha1;
	private JButton btLimpar;
	private JButton btApagar;
	private JButton btSinal;
	private JPanel linha2;
	private JButton btSete;
	private JButton btOito;
	private JButton btNove;
	private JButton btDivisao;
	private JPanel linha3;
	private JPanel linha4;
	private JPanel linha5;
	private JButton btQuatro;
	private JButton btCinco;
	private JButton btSeis;
	private JButton btVezes;
	private JLabel lblNewLabel;
	private JButton btUm;
	private JButton btDois;
	private JButton btTres;
	private JButton btMenos;
	private JButton btZero;
	private JButton btPonto;
	private JButton btIgual;
	private JButton btMais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setOpacity(4.0f);
		setTitle("CuteLator");
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setBackground(new Color(186, 85, 211));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SarahN\\Desktop\\Calc\\icon.PNG"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 414);
		base = new JPanel();
		base.setForeground(new Color(186, 85, 211));
		base.setBackground(new Color(221, 160, 221));
		base.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(186, 85, 211), new Color(186, 85, 211), new Color(186, 85, 211), new Color(186, 85, 211)));
		setContentPane(base);
		base.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				RowSpec.decode("fill:40dlu"),
				RowSpec.decode("40dlu"),
				RowSpec.decode("40dlu"),
				RowSpec.decode("40dlu"),
				RowSpec.decode("40dlu"),
				RowSpec.decode("40dlu"),}));
		
		areaDeCalculo = new JPanel();
		areaDeCalculo.setBackground(new Color(221, 160, 221));
		base.add(areaDeCalculo, "1, 1, fill, fill");
		areaDeCalculo.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("20dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("20dlu"),},
			new RowSpec[] {
				RowSpec.decode("5dlu"),
				RowSpec.decode("30dlu"),
				RowSpec.decode("5dlu"),}));
		
		barraDeCalculo = new JTextField();
		barraDeCalculo.setForeground(new Color(255, 255, 255));
		barraDeCalculo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		barraDeCalculo.setBackground(new Color(139, 0, 139));
		areaDeCalculo.add(barraDeCalculo, "2, 2, default, fill");
		barraDeCalculo.setColumns(20);
		
		linha1 = new JPanel();
		linha1.setBackground(new Color(221, 160, 221));
		base.add(linha1, "1, 2, fill, fill");
		linha1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),},
			new RowSpec[] {
				RowSpec.decode("36dlu"),
				RowSpec.decode("5dlu"),}));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SarahN\\Desktop\\Imagem3.png"));
		linha1.add(lblNewLabel, "2, 1, center, default");
		
		btLimpar = new JButton("C");
		btLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btLimpar.setForeground(new Color(139, 0, 139));
		btLimpar.setBackground(new Color(221, 160, 221));
		linha1.add(btLimpar, "4, 1, fill, fill");
		
		btApagar = new JButton("<-");
		btApagar.setForeground(new Color(139, 0, 139));
		btApagar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btApagar.setBackground(new Color(221, 160, 221));
		linha1.add(btApagar, "6, 1, fill, fill");
		
		btSinal = new JButton("+ | -");
		btSinal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btSinal.setForeground(new Color(139, 0, 139));
		btSinal.setBackground(new Color(221, 160, 221));
		linha1.add(btSinal, "8, 1, fill, fill");
		
		linha2 = new JPanel();
		linha2.setBackground(new Color(221, 160, 221));
		base.add(linha2, "1, 3, fill, fill");
		linha2.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),},
			new RowSpec[] {
				RowSpec.decode("36dlu"),
				RowSpec.decode("5dlu"),}));
		
		btSete = new JButton("7");
		btSete.setForeground(new Color(139, 0, 139));
		btSete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btSete.setBackground(new Color(221, 160, 221));
		btSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btSete.setIcon(null);
		linha2.add(btSete, "2, 1, fill, fill");
		
		btNove = new JButton("9");
		btNove.setForeground(new Color(139, 0, 139));
		btNove.setFont(new Font("Tahoma", Font.BOLD, 14));
		btNove.setBackground(new Color(221, 160, 221));
		btNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btOito = new JButton("8");
		btOito.setForeground(new Color(139, 0, 139));
		btOito.setFont(new Font("Tahoma", Font.BOLD, 14));
		btOito.setBackground(new Color(221, 160, 221));
		btOito.setIcon(null);
		linha2.add(btOito, "4, 1, fill, fill");
		btNove.setIcon(null);
		linha2.add(btNove, "6, 1, fill, fill");
		
		btDivisao = new JButton("/");
		btDivisao.setFont(new Font("Tahoma", Font.BOLD, 14));
		btDivisao.setForeground(new Color(139, 0, 139));
		btDivisao.setBackground(new Color(221, 160, 221));
		btDivisao.setIcon(null);
		linha2.add(btDivisao, "8, 1, fill, fill");
		
		linha3 = new JPanel();
		linha3.setBackground(new Color(221, 160, 221));
		base.add(linha3, "1, 4, fill, fill");
		linha3.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),},
			new RowSpec[] {
				RowSpec.decode("36dlu:grow"),
				RowSpec.decode("5dlu"),}));
		
		btQuatro = new JButton("4");
		btQuatro.setBackground(new Color(221, 160, 221));
		btQuatro.setForeground(new Color(139, 0, 139));
		btQuatro.setFont(new Font("Tahoma", Font.BOLD, 14));
		linha3.add(btQuatro, "2, 1, fill, fill");
		
		btCinco = new JButton("5");
		btCinco.setForeground(new Color(139, 0, 139));
		btCinco.setBackground(new Color(221, 160, 221));
		btCinco.setFont(new Font("Tahoma", Font.BOLD, 14));
		linha3.add(btCinco, "4, 1, fill, fill");
		
		btSeis = new JButton("6");
		btSeis.setForeground(new Color(139, 0, 139));
		btSeis.setFont(new Font("Tahoma", Font.BOLD, 14));
		btSeis.setBackground(new Color(221, 160, 221));
		linha3.add(btSeis, "6, 1, fill, fill");
		
		btVezes = new JButton("X");
		btVezes.setForeground(new Color(139, 0, 139));
		btVezes.setBackground(new Color(221, 160, 221));
		btVezes.setFont(new Font("Tahoma", Font.BOLD, 14));
		linha3.add(btVezes, "8, 1, fill, fill");
		
		linha4 = new JPanel();
		linha4.setBackground(new Color(221, 160, 221));
		base.add(linha4, "1, 5, fill, fill");
		linha4.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),},
			new RowSpec[] {
				RowSpec.decode("36dlu:grow"),
				RowSpec.decode("5dlu"),}));
		
		btUm = new JButton("1");
		btUm.setForeground(new Color(139, 0, 139));
		btUm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btUm.setBackground(new Color(221, 160, 221));
		linha4.add(btUm, "2, 1, fill, fill");
		
		btDois = new JButton("2");
		btDois.setForeground(new Color(139, 0, 139));
		btDois.setFont(new Font("Tahoma", Font.BOLD, 14));
		btDois.setBackground(new Color(221, 160, 221));
		linha4.add(btDois, "4, 1, fill, fill");
		
		btTres = new JButton("3");
		btTres.setForeground(new Color(139, 0, 139));
		btTres.setFont(new Font("Tahoma", Font.BOLD, 14));
		btTres.setBackground(new Color(221, 160, 221));
		linha4.add(btTres, "6, 1, fill, fill");
		
		btMenos = new JButton("-");
		btMenos.setForeground(new Color(139, 0, 139));
		btMenos.setFont(new Font("Tahoma", Font.BOLD, 17));
		btMenos.setBackground(new Color(221, 160, 221));
		linha4.add(btMenos, "8, 1, fill, fill");
		
		linha5 = new JPanel();
		linha5.setBackground(new Color(221, 160, 221));
		base.add(linha5, "1, 6, fill, fill");
		linha5.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("5dlu"),},
			new RowSpec[] {
				RowSpec.decode("36dlu:grow"),
				RowSpec.decode("5dlu"),}));
		
		btZero = new JButton("0");
		btZero.setForeground(new Color(139, 0, 139));
		btZero.setFont(new Font("Tahoma", Font.BOLD, 14));
		btZero.setBackground(new Color(221, 160, 221));
		linha5.add(btZero, "2, 1, fill, fill");
		
		btPonto = new JButton(".");
		btPonto.setForeground(new Color(139, 0, 139));
		btPonto.setFont(new Font("Tahoma", Font.BOLD, 16));
		btPonto.setBackground(new Color(221, 160, 221));
		linha5.add(btPonto, "4, 1, fill, fill");
		
		btIgual = new JButton("=");
		btIgual.setForeground(new Color(139, 0, 139));
		btIgual.setFont(new Font("Tahoma", Font.BOLD, 16));
		btIgual.setBackground(new Color(221, 160, 221));
		linha5.add(btIgual, "6, 1, fill, fill");
		
		btMais = new JButton("+");
		btMais.setForeground(new Color(139, 0, 139));
		btMais.setFont(new Font("Tahoma", Font.BOLD, 14));
		btMais.setBackground(new Color(221, 160, 221));
		linha5.add(btMais, "8, 1, fill, fill");
	}

}
