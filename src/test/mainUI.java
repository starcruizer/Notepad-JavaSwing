package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainUI frame = new mainUI();
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
	public mainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRecordEntry = new JButton("RECORD ENTRY");
		btnRecordEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertionUI insert=new insertionUI();
				insert.setVisible(true);
				
			}
		});
		btnRecordEntry.setBounds(12, 13, 129, 25);
		contentPane.add(btnRecordEntry);
		
		JButton btnViewDay = new JButton("VIEW DAY");
		btnViewDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewUI view=new viewUI();
				view.setVisible(true);
			}
		});
		btnViewDay.setBounds(128, 51, 108, 25);
		contentPane.add(btnViewDay);
		
		JButton btnNewButton = new JButton("VIEW WEEK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewUI view=new viewUI();
				view.setVisible(true);
			}
		});
		btnNewButton.setBounds(248, 51, 106, 25);
		contentPane.add(btnNewButton);
		
		JButton btnModify = new JButton("MODIFY");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteUI delete=new deleteUI();
				delete.setVisible(true);
			}
		});
		btnModify.setBounds(12, 51, 97, 25);
		contentPane.add(btnModify);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				deleteUI delete=new deleteUI();
				delete.setVisible(true);
			}
		});
		btnDelete.setBounds(148, 13, 98, 25);
		contentPane.add(btnDelete);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchUI search=new searchUI();
				search.setVisible(true);
			}
		});
		btnSearch.setBounds(257, 13, 97, 25);
		contentPane.add(btnSearch);
		
		JButton btnQuit = new JButton("QUIT");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(236, 117, 97, 25);
		contentPane.add(btnQuit);
	}
}
