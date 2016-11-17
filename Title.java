package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Title extends JPanel{
	
	public void BlinkBlink(){
		
	}
	
	
	public Title() {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		setPreferredSize(new Dimension(414, 230));
		
		
		
		JLabel titleText = new JLabel("Color");
		titleText.setForeground(new Color(255, 255, 255));
		titleText.setFont(new Font("Courier New", Font.BOLD, 56));
		titleText.setBounds(113, 49, 185, 74);
		setLayout(null);
		//System.out.println("asdafsdfsd");
		add(titleText);
		
		JLabel lblQuiz = new JLabel("Quiz");
		lblQuiz.setForeground(new Color(255, 255, 255));
		lblQuiz.setFont(new Font("Courier New", Font.BOLD, 56));
		lblQuiz.setBounds(129, 92, 169, 136);
		add(lblQuiz);
	}
}
