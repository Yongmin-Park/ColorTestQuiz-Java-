package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

public class QuizPanel extends JPanel{
	JLabel colorText;
	JLabel levelText;
	int level;
	String levelString;
	WindowMain myWM = null;
	protected Random random = new Random();
	int one, another;
	private final JLabel lblNewLabel = new JLabel("▼ Pick the told color, no matter what color it is.");//글자 색에 상관없이 글자가 말하는 색을 고르세요
	
	public QuizPanel(WindowMain wm){
		myWM = wm;
		level = myWM.lvlMGR.levelNow;
		System.out.println(myWM.CNTlist.size());

		this.one = random.nextInt(myWM.CNTlist.size());
		while(true){
			this.another = random.nextInt(myWM.CNTlist.size());
			if(this.one != this.another){
				break;
			}
		}
		setBackground(new Color(255, 255, 255));
		setPreferredSize(new Dimension(414, 200));
		setLayout(null);

		JLabel colorText = new JLabel(myWM.CNTlist.get(one).text);
		colorText.setBounds(73, 55, 118, 90);
		colorText.setForeground(new Color(myWM.CNTlist.get(another).RGB[0], myWM.CNTlist.get(another).RGB[1], myWM.CNTlist.get(another).RGB[2]));
		colorText.setFont(new Font("Courier New", Font.BOLD, 40));
		add(colorText);
		this.colorText = colorText;
		
		JLabel levelText = new JLabel(level+"");
		levelText.setBounds(264, 47, 200, 90);
		levelText.setFont(new Font("Arial Black", Font.PLAIN, 65));
		add(levelText);
		this.levelText = levelText;
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setBounds(49, 110, 269, 90);
		lblNewLabel.setForeground(new Color(102, 102, 102));
		add(lblNewLabel);
		
	}
}
