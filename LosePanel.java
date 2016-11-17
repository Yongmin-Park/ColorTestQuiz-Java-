package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.LineBorder;

public class LosePanel extends JPanel{
	WindowMain myWM = null;
	int resultLevel;
	String SymbolText[] = new String[10];
	public LosePanel(WindowMain wm){
		setBackground(new Color(51, 51, 51));
		myWM = wm;
		resultLevel =  myWM.lvlMGR.levelNow;
		setPreferredSize(new Dimension(414, 700));
		setLayout(null);
		
		SymbolText[0] = "아메바";
		SymbolText[1] = "소나무";
		SymbolText[2] = "박쥐";
		SymbolText[3] = "파충류";
		SymbolText[4] = "개미핥기";
		SymbolText[5] = "벌꿀오소리";
		SymbolText[6] = "고양이";
		SymbolText[7] = "맹금류";
		SymbolText[8] = "몽골 유목민";
		SymbolText[9] = "허블 우주 망원경";
		
		JLabel resultresult = new JLabel("결과를 알려드립니다…");
		resultresult.setBackground(new Color(238, 232, 170));
		resultresult.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		resultresult.setForeground(new Color(255, 255, 255));
		resultresult.setBounds(31, 88, 263, 31);
		add(resultresult);
		
		JLabel TEST_ = new JLabel("+++TEST");
		TEST_.setForeground(new Color(255, 255, 0));
		TEST_.setBounds(31, 33, 70, 25);
		add(TEST_);
		
		JLabel RESULT_ = new JLabel("RESULT+++");
		RESULT_.setForeground(new Color(255, 255, 0));
		RESULT_.setBounds(99, 33, 122, 25);
		add(RESULT_);
		
		JPanel resultPanel = new JPanel();
		resultPanel.setBorder(new LineBorder(new Color(204, 204, 204), 20, true));
		resultPanel.setBounds(31, 146, 350, 350);
		add(resultPanel);
		resultPanel.setLayout(null);
		
		JLabel resultLine1 = new JLabel("단계까지 도달한 당신은");
		resultLine1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		resultLine1.setBounds(112, 61, 274, 31);
		resultPanel.add(resultLine1);
		
		JLabel resultNumber = new JLabel(resultLevel+"");
		resultNumber.setForeground(new Color(0, 51, 255));
		resultNumber.setFont(new Font("Arial Black", Font.PLAIN, 40));
		resultNumber.setBounds(39, 28, 66, 81);
		resultPanel.add(resultNumber);
		
		
		
		JLabel resultLine2 = new JLabel("수준의 색채인지능력을 보유하고");
		resultLine2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		resultLine2.setBounds(39, 173, 268, 25);
		resultPanel.add(resultLine2);
		
		JLabel resultLine3 = new JLabel("있습니다");
		resultLine3.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		resultLine3.setBounds(39, 221, 172, 25);
		resultPanel.add(resultLine3);
		
		JLabel resultSymbol = new JLabel("\"" +SymbolText[resultLevel%10-1]+ "\"");
		resultSymbol.setFont(new Font("Arial Black", Font.BOLD, 28));
		resultSymbol.setBounds(44, 104, 263, 57);
		resultPanel.add(resultSymbol);
		
		System.out.println("new Lose");

		
	}
}
