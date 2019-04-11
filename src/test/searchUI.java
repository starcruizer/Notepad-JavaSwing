package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
public class searchUI extends JFrame {
	JFrame f;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtName;
	private JTextField txtDate;
	private JTextField txtType;
	private JTextField txtPath;
	private int counter = 10 ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchUI frame = new searchUI();
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
	public searchUI() {
		setBounds(100, 100, 481, 334);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 220, 235);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(new GridLayout(4, 0, 0, 0));
		{
			JPanel panel1 = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel1.getLayout();
			contentPanel.add(panel1);
			{
				JLabel label = new JLabel("Person name - ");
				panel1.add(label);
			}
		}
		{
			JPanel panel2 = new JPanel();
			contentPanel.add(panel2);
			{
				JLabel label = new JLabel("Date of Record - ");
				panel2.add(label);
			}
		}
		{
			JPanel panel3 = new JPanel();
			contentPanel.add(panel3);
			{
				JLabel label = new JLabel("Type of Record - ");
				panel3.add(label);
			}
		}
		{
			JPanel panel4 = new JPanel();
			contentPanel.add(panel4);
			{
				JLabel label = new JLabel("Path to record - ");
				panel4.add(label);
			}
		}
		//start of button flow layout code
		{ 
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 235, 450, 35);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton searchButton = new JButton("SEARCH");
				searchButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						// Inserting
						try {
							String data = search_Backend.search(txtName.getText(), txtDate.getText(), txtType.getText(), txtPath.getText());
							 
							f=new JFrame();
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
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				searchButton.setActionCommand("Cancel");
				buttonPane.add(searchButton);
			}
		}
		
		
		
		{
			JPanel panel = new JPanel();
			panel.setBounds(230, 0, 220, 235);
			getContentPane().add(panel);
			panel.setLayout(new GridLayout(4, 0, 0, 0));
			
			JPanel panel5 = new JPanel();
			panel.add(panel5);
			{
				txtName = new JTextField();
				panel5.add(txtName);
				txtName.setColumns(10);
			}
			
			JPanel panel6 = new JPanel();
			panel.add(panel6);
			
			txtDate = new JTextField();
			panel6.add(txtDate);
			txtDate.setColumns(10);
			
			JPanel panel7 = new JPanel();
			panel.add(panel7);
			
			txtType = new JTextField();
			panel7.add(txtType);
			txtType.setColumns(10);
			
			JPanel panel8 = new JPanel();
			panel.add(panel8);
			
			txtPath = new JTextField();
			panel8.add(txtPath);
			txtPath.setColumns(10);
		}
	}

}
