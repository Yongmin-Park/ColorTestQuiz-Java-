package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartButton extends JPanel{
	WindowMain myWM = null;

	
	public StartButton(WindowMain wm) {
		this.myWM = wm;
		setPreferredSize(new Dimension(414, 400));
		JButton btnNewButton = new JButton("START");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(38, 145, 336, 135);
		btnNewButton.setFont(new Font("Courier New", Font.BOLD, 99));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myWM.showTimeBar();
				myWM.showQuizPanel();
				myWM.showSelectPanel();
				myWM.setVisible(true);
			}
		});
		setLayout(null);
		add(btnNewButton);

	}
	
	class ButtonPress implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			myWM.showTimeBar();
			myWM.showQuizPanel();
		}
	}
	
	
	
}
