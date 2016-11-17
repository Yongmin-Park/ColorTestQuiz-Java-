package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.LineBorder;

import java.util.Random;


public class SelectPanel extends JPanel {
   WindowMain myWM = null;
   int first, second, third;//첫번째, 두번째, 세번째(위치순 아닌 생성순서)버튼 생성용 각각 랜덤 변수
   int quizOne, quizAnother;//QuizPanel 에서 넘겨받은 퀴즈 텍스트(정답)와, 퀴즈 텍스트의 색상(오답) 
   Integer RanButtonNum;
   protected Random random = new Random();
   boolean IsCorrect;
   
   
   public SelectPanel(WindowMain wm) {//게임 시작 후 중앙에 색상별 버튼 3개 있는 패널 생성자
	 myWM = wm;
	 
	 quizOne = myWM.QuizP.one;
	 quizAnother = myWM.QuizP.another;
	 
	 while(true){
		 RanButtonNum = random.nextInt(myWM.CNTlist.size());
		 if(this.RanButtonNum != this.quizOne && this.RanButtonNum != this.quizAnother){
			 break;
		 }
	 }

	 
	 first = random.nextInt(3);
	 while(true){
		this.second = random.nextInt(3);
		if(this.first != this.second){
			break;
		}
	 }
	 
	  while(true){
			this.third = random.nextInt(3);
			if(this.first != this.second && this.first != this.third && this.second != this.third){
				break;
			}
	  }
	   
	  
	  
	  
	  setPreferredSize(new Dimension(414, 400));
	  setBackground(new Color(255, 204, 204));//살구색
      myWM = wm;
      
      setLayout(null);
      
      
      JButton buttonArr[] = new JButton[3];
      
      buttonArr[first] = new JButton(/*myWM.CNTlist.get(quizOne).text*/);
      buttonArr[first].setBackground(new Color(myWM.CNTlist.get(quizOne).RGB[0], myWM.CNTlist.get(quizOne).RGB[1], myWM.CNTlist.get(quizOne).RGB[2]));
      buttonArr[first].addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	//myWM.TB.BarRunning();
        	myWM.lvlMGR.LevelUp();
			myWM.setVisible(true);

     		System.out.println("correctPress");

         }
      });
      buttonArr[first].setBounds(32, 21+first*126, 352, 108);
      buttonArr[first].setOpaque(true);
      buttonArr[first].setBorderPainted(false);
      add(buttonArr[first]);
      
      
      buttonArr[second] = new JButton(/*myWM.CNTlist.get(quizAnother).text*/);
      buttonArr[second].setBackground(new Color(myWM.CNTlist.get(quizAnother).RGB[0], myWM.CNTlist.get(quizAnother).RGB[1], myWM.CNTlist.get(quizAnother).RGB[2]));
      buttonArr[second].addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	//myWM.TB.BarRunning();
      		myWM.showLosePanel();
			myWM.setVisible(true);

        	System.out.println("Wrong Press");

         }
      });
      buttonArr[second].setBounds(32, 21+second*126, 352, 108);
      buttonArr[second].setOpaque(true);
      buttonArr[second].setBorderPainted(false);
      add(buttonArr[second]);
      
      
      buttonArr[third] = new JButton(/*myWM.CNTlist.get(RanButtonNum).text*/);
      buttonArr[third].setBackground(new Color(myWM.CNTlist.get(RanButtonNum).RGB[0], myWM.CNTlist.get(RanButtonNum).RGB[1], myWM.CNTlist.get(RanButtonNum).RGB[2]));
      buttonArr[third].addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	//myWM.TB.BarRunning();
        	myWM.showLosePanel();
 			myWM.setVisible(true);

        	 System.out.println("Wrong Press");

         }
      });
      buttonArr[third].setOpaque(true);
      buttonArr[third].setBorderPainted(false);
      buttonArr[third].setBounds(32, 21+third*126, 352, 108);
      add(buttonArr[third]);
      
      
      
      
     
      
      
      
      
      
      /*
      buttonArr[0] = new JButton(myWM.CNTlist.get(one).text);
      buttonArr[0].setBackground(new Color(myWM.CNTlist.get(one).RGB[0], myWM.CNTlist.get(one).RGB[1], myWM.CNTlist.get(one).RGB[2]));
      //button1.setForeground(new Color(255, 255, 255));
      buttonArr[0].addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	myWM.TB.BarRunning();
			myWM.TB.setVisible(true);
         }
      });
      buttonArr[0].setBounds(32, 21, 352, 108);
      add(buttonArr[0]);
      
      JButton button2 = new JButton(myWM.CNTlist.get(two).text);
      buttonArr[0].setBackground(new Color(myWM.CNTlist.get(two).RGB[0], myWM.CNTlist.get(two).RGB[1], myWM.CNTlist.get(two).RGB[2]));
      //button2.setForeground(Color.BLUE);
      buttonArr[0].addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
         	myWM.TB.BarRunning();
 			myWM.TB.setVisible(true);
          }
       });
      button2.setBounds(32, 147, 352, 108);
      add(button2);
      
      JButton button3 = new JButton(myWM.CNTlist.get(three).text);
      buttonArr[0].setBackground(new Color(myWM.CNTlist.get(three).RGB[0], myWM.CNTlist.get(three).RGB[1], myWM.CNTlist.get(three).RGB[2]));
      //button3.setForeground(Color.GREEN);
      button3.setBounds(32, 274, 352, 108);
      add(button3);
      
      */
   }
}
