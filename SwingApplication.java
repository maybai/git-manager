package com.example.java;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class SwingApplication {
	public static void main(String args[]){
		try{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}catch (Exception e){
			e.printStackTrace();
		}
		JFrame frame = new JFrame("Swing Application");
		Container c = frame.getContentPane();
		JPanel pane = new JPanel();
		c.add(pane);
		pane.setLayout(new FlowLayout());
		final JLabel label = new JLabel();
		JButton button = new JButton("Click me");
		pane.add(label);
		pane.add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				label.setText("Welcome to Beijing!");
		}
		});
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frame.setSize(300,240);
		frame.setVisible(true);
	}

}
