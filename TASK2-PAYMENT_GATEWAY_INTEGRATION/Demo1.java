import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URL;
import java.awt.Font;

public class Demo1 {

	private JFrame frmFirst;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo1 window = new Demo1();
					window.frmFirst.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Demo1() {
		initialize();
	}
	private void initialize() {
		frmFirst = new JFrame();
		frmFirst.setTitle("HELPING HANDS");
		frmFirst.setBounds(100, 100, 810, 458);
		frmFirst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFirst.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("For Donation Visit Our Page");
		//Use your index html page location below.
		File urlDesktop=new File("C:/Users/Sudheer/Desktop/Code-Clause/PAYMENT GATEWAY INTEGRATION/index.html");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().open(urlDesktop);
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
		btnNewButton.setForeground(new Color(255, 215, 0));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(47, 356, 688, 54);
		frmFirst.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sudheer\\Downloads\\d1 (2).jpg"));
		lblNewLabel.setBounds(0, 0, 801, 439);
		frmFirst.getContentPane().add(lblNewLabel);
	}
}
