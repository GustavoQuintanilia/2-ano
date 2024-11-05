package exemploGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textApelido;
	private JTextField textTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Cadastro de amigos");
		titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 33));
		titulo.setBounds(155, 35, 333, 40);
		contentPane.add(titulo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNome.setBounds(39, 143, 54, 22);
		contentPane.add(lblNome);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setFont(new Font("Arial", Font.PLAIN, 18));
		lblApelido.setBounds(39, 205, 64, 22);
		contentPane.add(lblApelido);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTelefone.setBounds(39, 270, 76, 22);
		contentPane.add(lblTelefone);
		
		textNome = new JTextField();
		textNome.setBounds(125, 142, 437, 29);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textApelido = new JTextField();
		textApelido.setColumns(10);
		textApelido.setBounds(125, 205, 437, 29);
		contentPane.add(textApelido);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(125, 270, 437, 29);
		contentPane.add(textTelefone);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCadastrar.setBounds(65, 386, 104, 47);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnVoltar.setBounds(458, 386, 104, 47);
		contentPane.add(btnVoltar);
	}
}
