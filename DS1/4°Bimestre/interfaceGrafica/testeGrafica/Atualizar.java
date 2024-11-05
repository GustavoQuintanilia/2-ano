package exemploGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Atualizar extends JFrame {

	private JPanel contentPane;
	private JTextField textApelido;
	private JTextField textNome;
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atualizar frame = new Atualizar();
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
	public Atualizar() {
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 459);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Atualizar amigos");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 33));
		lblTitulo.setBounds(171, 11, 282, 40);
		contentPane.add(lblTitulo);
		
		JLabel lblID = new JLabel("id:");
		lblID.setFont(new Font("Arial", Font.PLAIN, 18));
		lblID.setBounds(47, 93, 19, 14);
		contentPane.add(lblID);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNome.setBounds(47, 140, 52, 14);
		contentPane.add(lblNome);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setFont(new Font("Arial", Font.PLAIN, 18));
		lblApelido.setBounds(41, 193, 65, 19);
		contentPane.add(lblApelido);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTelefone.setBounds(41, 243, 84, 14);
		contentPane.add(lblTelefone);
		
		JTextField textTelefone = new JTextField();
		textTelefone.setText("<dynamic>");
		textTelefone.setBounds(128, 238, 424, 29);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAtualizar.setBounds(45, 339, 108, 53);
		contentPane.add(btnAtualizar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVoltar.setBounds(455, 339, 108, 53);
		contentPane.add(btnVoltar);
		
		textApelido = new JTextField();
		textApelido.setText("<dynamic>");
		textApelido.setColumns(10);
		textApelido.setBounds(128, 190, 424, 29);
		contentPane.add(textApelido);
		
		textNome = new JTextField();
		textNome.setText("<dynamic>");
		textNome.setColumns(10);
		textNome.setBounds(128, 135, 424, 29);
		contentPane.add(textNome);
		
		textId = new JTextField();
		textId.setText("<dynamic>");
		textId.setColumns(10);
		textId.setBounds(128, 88, 424, 29);
		contentPane.add(textId);
	}
}
