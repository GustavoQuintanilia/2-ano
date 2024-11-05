package exemploGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class ListaAmigos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaAmigos frame = new ListaAmigos();
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
	public ListaAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Lista de Amigos");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 33));
		lblTitulo.setBounds(210, 10, 271, 40);
		contentPane.add(lblTitulo);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setForeground(new Color(255, 0, 0));
		btnDeletar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDeletar.setBounds(463, 380, 131, 50);
		contentPane.add(btnDeletar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtualizar.setBounds(49, 380, 131, 50);
		contentPane.add(btnAtualizar);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar.setBounds(0, 0, 66, 50);
		contentPane.add(btnVoltar);
	}
}
