package GUI;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class TimeBar extends JPanel{
	Integer progress = 100;
	JProgressBar MyProgressBar; 
	int Time = 0;
	public TimeBar(){
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		setPreferredSize(new Dimension(414, 30));
		
		MyProgressBar = new JProgressBar(0, 100);
		MyProgressBar.setBackground(new Color(0, 0, 0));
		MyProgressBar.setValue(progress);
		MyProgressBar.setBounds(16, 6, 380, 18);
		add(MyProgressBar);
	}
	
	public void BarRunning(){
			System.out.println("running");
			Timer.sleep(100);
			MyProgressBar.setValue(progress);
			progress--;
			this.setVisible(true);
			

	}
	
	
}
