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

public class LevelMGR {
	public WindowMain myWM = null;
	Integer levelNow = 1;
	int time = 5;
	public LevelMGR(WindowMain wm){
		myWM = wm;
	}
	
	public void Ticktock(){
		myWM.TB.BarRunning();
	}
	
	public void LevelUp(){
		levelNow++;
		//myWM.lvlupQuizP();
		//myWM.lvlupSelectP();
		myWM.showQuizPanel();
		myWM.showSelectPanel();
		System.out.println("lvlup run");
	}
	
	public void Lose(){
		
	}
}
