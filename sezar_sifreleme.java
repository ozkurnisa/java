package javaproje;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class asezar_sifreleme extends JFrame {

	private JPanel contentPane;
	private JTextField txtF1;
	private JTextField textField;
	private final JTextField txtF2 = new JTextField();


	String alfabe= "abcdefgðhýijklmnoöprsþtuüvyz";
	int ks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					asezar_sifreleme frame = new asezar_sifreleme();
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
	public asezar_sifreleme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtF1 = new JTextField();

		txtF1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtF1.setText("\u015Eifrelenecek Metin ");
		txtF1.setBounds(28, 26, 385, 33);
		contentPane.add(txtF1);
		txtF1.setColumns(10);

		JLabel lblNewLabel = new JLabel("Kayd\u0131rma say\u0131s\u0131");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(38, 96, 90, 47);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setText("0");
		textField.setBounds(150, 101, 36, 34);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\u015Fifrele");

		btnNewButton.setBounds(250, 109, 98, 21);
		contentPane.add(btnNewButton);
		txtF2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtF2.setText("");
			}
		});
		txtF2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtF2.setText("\u015Eifrelenmi\u015F Metin");
		txtF2.setBounds(28, 182, 385, 59);
		contentPane.add(txtF2);
		txtF2.setColumns(10);

		txtF1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtF1.setText("");;
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtF1.setText("");
			}
		});

		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i,uzunluk;
				String cipher ="";

				String metin = "";
				String sifreli = "";
				ks=Integer.parseInt(textField.getText());

				for(i=ks;i<29+ks;i++) {
					cipher+= alfabe.charAt(i%29);
				}

				
				metin = txtF1.getText();
				uzunluk = metin.length();

				for(i=0;i<uzunluk;i++) {
					for(int j = 0;j<29;j++) {
						if(metin.charAt(i)==alfabe.charAt(j)) {
							sifreli+= alfabe.charAt((j+ks)%29);
						}
					}
				}
				txtF2.setText(sifreli);
			}
		});

		
		
		
		
	

	}
}
