package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class viewUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterDay;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewUI frame = new viewUI();
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
	public viewUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 154);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEnterDay = new JTextField();
		txtEnterDay.setBounds(12, 34, 116, 22);
		contentPane.add(txtEnterDay);
		txtEnterDay.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						String data=view_Backend.view(txtEnterDay.getText());
						JFrame f=new JFrame();
						if(data.contentEquals("null"))
							{
								data="NOT FOUND !!";
								JOptionPane.showMessageDialog(f,data);
							}
						else
						{
							data="FOUND !!   "+data;
							JOptionPane.showMessageDialog(f,data); 
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		btnSearch.setBounds(12, 69, 97, 25);
		contentPane.add(btnSearch);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(126, 69, 97, 25);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("Enter day !!");
		lblNewLabel.setBounds(12, 13, 116, 16);
		contentPane.add(lblNewLabel);
	}
}
