package com.PoopApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;

public class Window {

	private JFrame frame;
	private JPanel panel;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtLocation;
	private JTextField txtNote;
	private JButton btnNewPoop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Poop App");
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		txtDate = new JTextField();
		txtDate.setText("Date");
		panel.add(txtDate);
		txtDate.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setText("Time");
		panel.add(txtTime);
		txtTime.setColumns(10);
		
		txtLocation = new JTextField();
		txtLocation.setText("Location");
		panel.add(txtLocation);
		txtLocation.setColumns(10);
		
		txtNote = new JTextField();
		txtNote.setText("Note");
		panel.add(txtNote);
		txtNote.setColumns(10);
		
		btnNewPoop = new JButton("New Poop");
		panel.add(btnNewPoop);
	}

}
