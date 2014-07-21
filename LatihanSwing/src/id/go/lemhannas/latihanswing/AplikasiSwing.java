package id.go.lemhannas.latihanswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AplikasiSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplikasiSwing frame = new AplikasiSwing();
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
	public AplikasiSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		JLabel lblTombolTampilin = new JLabel("Tombol Tampilin");
		JButton btnTampilin = new JButton("TAMPILIN");
		btnTampilin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTampilin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int angka = Integer.parseInt(textField.getText());
				int loop1, testcount;
				
				testcount=0;
				
				for(loop1=1;loop1<=angka;loop1++){
					if(angka % loop1 ==0) {
						testcount++;
					}
				}	
					
				if (testcount==2) {
				lblTombolTampilin.setText("Bilangan Prima");}
				else {lblTombolTampilin.setText("Bukan Bilangan Prima");}
			}
		});
		btnTampilin.setBounds(103, 77, 89, 23);
		contentPane.add(btnTampilin);
		
		
		lblTombolTampilin.setBounds(201, 81, 182, 14);
		contentPane.add(lblTombolTampilin);
		
		
		textField.setBounds(10, 78, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
