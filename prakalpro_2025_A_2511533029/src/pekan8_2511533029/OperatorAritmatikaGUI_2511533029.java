package pekan8_2511533029;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533029 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
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
					OperatorAritmatikaGUI_2511533029 frame = new OperatorAritmatikaGUI_2511533029();
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
	public OperatorAritmatikaGUI_2511533029() {
		setTitle("OperatorAritmatika_2511533029");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 2");
		lblNewLabel_1.setBounds(10, 75, 47, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 1");
		lblNewLabel_2.setBounds(10, 43, 47, 13);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMTIKA");
		lblNewLabel.setBounds(114, 10, 134, 15);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setBounds(10, 114, 41, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setBounds(10, 205, 47, 13);
		contentPane.add(lblNewLabel_4);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(76, 40, 96, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(76, 72, 96, 18);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("silakan input bilangan dahlulu");
					} else if (txtBil2.getText().trim().isEmpty()) {
						pesanPeringatan ("silakan input bilangan dahulu");
					} else if (txtBil2.getText().trim().startsWith("0")) {
						pesanPeringatan ("bilangan tidak boleh 0");
					} else {
					
					  try {	
				int a = Integer.parseInt(txtBil1.getText());
				int b = Integer.parseInt(txtBil2.getText());
				int c = cbOperator.getSelectedIndex();
				if (c==0) {
					hasil = a+b;
				}
				if (c==1) {
					hasil = a-b;
				}
				if (c==2) {
					hasil = a*b;
				}
				if (c==3) {
					hasil = a/b;
				}
				if (c==4) {
					hasil = a%b;}
					} catch (NumberFormatException ex) {
					pesanEror ("bilangan 1 dan dua harus angka " );
			}
					}
				 txtHasil.setText(String.valueOf(hasil));
			}
		});
		btnNewButton.setBounds(189, 110, 84, 30);
		contentPane.add(btnNewButton);
		
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(76, 110, 57, 30);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setBounds(76, 202, 96, 18);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);

	}
}
