package pekan8_2511533029;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TugasPekan8_2511533029 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField textField_2;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Eror",JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasPekan8_2511533029 frame = new TugasPekan8_2511533029();
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
	public TugasPekan8_2511533029() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ASSIGNMENT");
		lblNewLabel.setBounds(152, 0, 144, 29);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 34, 80, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 73, 80, 29);
		contentPane.add(lblNewLabel_2);
		
		JComboBox combobox = new JComboBox();
		combobox.setModel(new DefaultComboBoxModel(new String[] {"Assignment Penjumlahan", "Assignment Pengurangan", "Assignment Perkalian", "Assignment Pembagian", "Assignment Sisa Bagi"}));
		combobox.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		combobox.setBounds(100, 123, 135, 29);
		contentPane.add(combobox);
		
		JLabel lblNewLabel_2_1 = new JLabel("Operator");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(10, 123, 80, 29);
		contentPane.add(lblNewLabel_2_1);
		
		text1 = new JTextField();
		text1.setBounds(100, 38, 57, 25);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setColumns(10);
		text2.setBounds(100, 77, 57, 25);
		contentPane.add(text2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Hasil");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_2_1_1.setBounds(10, 175, 80, 29);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 179, 57, 25);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				  int a = Integer.parseInt(text1.getText());
				  int b = Integer.parseInt(text2.getText());
				  int c = combobox.getSelectedIndex();
				    if (text1.getText().trim().isEmpty()) {
					pesanPeringatan ("silakan input bilangan dahlulu");
					} else if (text2.getText().trim().isEmpty()) {
						pesanPeringatan ("silakan input bilangan dahulu");
					} else if (text2.getText().trim().startsWith("0")) {
						pesanPeringatan ("bilangan tidak boleh 0");
					} else if (text1.getText().trim().startsWith("0")) {
						pesanPeringatan ("bilangan tidak boleh 0");
					}else {
					 try {
						  if (c==0) {
								hasil = a+=b;
							}
							if (c==1) {
								hasil = a-=b;
							}
							if (c==2) {
								hasil = a*=b;
							}
							if (c==3) {
								hasil = a/=b;
							}
							if (c==4) {
								hasil = a%=b;
							}
								} catch (NumberFormatException ex) {
								pesanEror ("bilangan 1 dan dua harus angka " );
						            }
								}
						textField_2.setText(String.valueOf(hasil));
			}	
		});
		btnNewButton.setBounds(291, 123, 84, 29);
		contentPane.add(btnNewButton);
	}
}
