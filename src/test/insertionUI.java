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

public class insertionUI extends JFrame {

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
					insertionUI frame = new insertionUI();
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
	public insertionUI() {
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
				
				
					JLabel lblStorageLeft = new JLabel("Storage Left - 10");
					buttonPane.add(lblStorageLeft);
				
				
				JButton okButton = new JButton("Save");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						// Button Clicked
						counter--;
						lblStorageLeft.setText("Storage Left -"+ counter);
						
						// Inserting
						try {
							insert_delete_Backend.insert(txtName.getText(), txtDate.getText(), txtType.getText(), txtPath.getText());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					}
				});
				
				buttonPane.add(okButton); 
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
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
