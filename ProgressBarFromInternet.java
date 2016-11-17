package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgressBarFromInternet extends JPanel{
	JProgressBar jpb;
	  int i;
	  public ProgressBarFromInternet() {
	  Panel p1 = new Panel();

	  jpb = new JProgressBar(0,100); //최소0,최대100
	  p1.add(jpb);
	  
	   this.add(p1);
	  
	  //this.pack();
	  this.setVisible(true);
 //무한루프
	 }
	 public void loop(){
	        
	     for(i=100; i>=0; i--){ //100부터 0까지 감소    
	     System.out.println("runn");
	     jpb.setValue(i);
	     Timer.sleep(100);
	    }
	 }
	 
	 
	

}
