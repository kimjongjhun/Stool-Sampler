package com.PoopApp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

public class Window implements ActionListener{

	private JFrame frame;
	private JFrame poopConstructorFrame;
	private JPanel panel;
	private JPanel poopPanel;
	private JButton btnNewPoop;
	
	public Poop p;
	
	private JTextField txtText;
	private JList<String> list;

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
		
		btnNewPoop.addActionListener(this);
	}

	public void poopCreationFrame() {
		poopConstructorFrame = new JFrame();
		poopConstructorFrame.setBounds(100, 100, 640, 480);
		poopConstructorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		poopConstructorFrame.setTitle("Poop Creation");
		poopConstructorFrame.setVisible(true);
		poopConstructorFrame.setLocationRelativeTo(frame);
		poopConstructorFrame.setAlwaysOnTop(true);
		
		poopPanel = new JPanel();
		poopConstructorFrame.getContentPane().add(poopPanel, BorderLayout.CENTER);
		
		txtText = new JTextField();
		txtText.setText("text");
		txtText.setVisible(true);
		frame.getContentPane().add(txtText, BorderLayout.CENTER);
		txtText.setColumns(10);
		
		list = new JList<String>();
		list.setToolTipText("Select the type of poop.");
		list.setVisible(true);
		list.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"1", "2", "3", "4", "5", "6", "7"};
			public String getElementAt(int index) {
				return values[index-1];
			}
			public int getSize() {
				return 0;
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frame.getContentPane().add(list, BorderLayout.WEST);
		
		poopPanel.add(txtText);
		poopPanel.add(list);
		
		makePoop();
	}
	
	public void makePoop() {
		p = new Poop(null, null, null, 0, 0, 0);
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
		
		btnNewPoop = new JButton("Make A New Poop");
		panel.add(btnNewPoop);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewPoop) {
			poopCreationFrame();
		}
		
	}

}
