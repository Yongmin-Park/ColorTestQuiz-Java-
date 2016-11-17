package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.event.*;

import java.util.Random;



public class WindowMain extends JFrame{
	Integer width = 414;
	Integer height = 736;
	Container contentpane = null;
	Container ResultContainer = null;
	private Integer theTime = 0;
	TimeBar TB;
	QuizPanel QuizP;
	SelectPanel SelectP;
	LevelMGR lvlMGR = new LevelMGR(this);
	LosePanel LoseP;
	
	JPanel centerPanel = null;//Center 영역 패널
	JPanel bottomPanel = null;//하단 영역 패널
	JPanel topPanel = null;//상단 영역 패널
	JPanel topNorthPanel = null;
	JPanel topCenterPanel = null;
	JPanel eastPanel = null;//우측 영역(없음) 패널
	JPanel westPanel = null;//좌측 영역(없음) 패널
	
	ProgressBarFromInternet PBF;
	
	public ArrayList<ColorAndText> CNTlist = new ArrayList<ColorAndText>();
	ColorAndText CNT;
	
	
	public WindowMain(){
		CNT = new ColorAndText("Black", 0, 0, 0);
		CNTlist.add(CNT);
		CNT = new ColorAndText("Red", 255, 51, 0);
		CNTlist.add(CNT);
		CNT = new ColorAndText("Green", 0, 254, 51);
		CNTlist.add(CNT);
		CNT = new ColorAndText("Orange", 255, 153, 0);
		CNTlist.add(CNT);
		CNT = new ColorAndText("Blue", 0, 51, 255);
		CNTlist.add(CNT);
		CNT = new ColorAndText("Purple", 153, 0, 153);
		CNTlist.add(CNT);

		
		setSize(width, height);//크기지정 메소드, 넓이, 높이
		setResizable(false);//프레임이 보여지고 사이즈 수정여부
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentpane();
		
		setVisible(true);//프레임을 보여줄지 지정
	}
	
	private void setLocation(){
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dem = tk.getScreenSize();
		Dimension dem_frame = this.getSize();
		int xx = (int)(dem.getWidth() / 2 - dem_frame.getWidth() / 2); //화면의 전체 폭 나누기 2
		int yy = (int)(dem.getHeight() / 2 - dem_frame.getHeight() / 2); //화면의 전체 폭 나누기 2
		this.setLocation(xx, yy);
	}
	
	public void showTimeBar(){
		TB = new TimeBar();
		topPanel.add(TB, BorderLayout.NORTH);
	}
	public void showTB(){
		PBF = new ProgressBarFromInternet();
		topNorthPanel = PBF;
		topPanel.add(PBF, BorderLayout.NORTH);
		PBF.loop();
	}
	
	public void showQuizPanel(){
		QuizP = new QuizPanel(this);
		if(topPanel != null){
			topPanel.remove(topCenterPanel);
		}
		topCenterPanel = QuizP;
		topPanel.add(QuizP, BorderLayout.CENTER);
	}
	public void showSelectPanel(){
		if(centerPanel != null){
			contentpane.remove(centerPanel);
		}
		centerPanel = new SelectPanel(this);
		contentpane.add(centerPanel, BorderLayout.CENTER);
	}
	public void lvlupQuizP(){
		topPanel.remove(QuizP);
		QuizP = new QuizPanel(this);
		topPanel.add(QuizP, BorderLayout.CENTER);
		System.out.println("lvlupQP run");
	}
	public void lvlupSelectP(){
		contentpane.remove(QuizP);
		centerPanel = new SelectPanel(this);
		contentpane.add(centerPanel, BorderLayout.CENTER);
		eastPanel = new TimeBar();
		contentpane.add(eastPanel, BorderLayout.SOUTH);
		System.out.println("lvlupSP run");

	}
	
	public void showLosePanel(){
		contentpane = this.getContentPane();
		
		
		LoseP = new LosePanel(this);
		contentpane.remove(topPanel);
		contentpane.remove(centerPanel);
		


		contentpane.add(LoseP, BorderLayout.CENTER);

		
	}
	
	private void setContentpane(){////////////////////////////////컨텐츠패널 설정
		//컴포넌트와 컨테이너들이 존재할 공간을 가져옴
		contentpane = this.getContentPane();
		
		//contentpane.setLayout(new BorderLayout());
		
		//상단에 추가할 패널 개별클래스의 인스턴스로 생성
		
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		contentpane.add(topPanel, BorderLayout.NORTH);
		
		topCenterPanel = new Title();
		topPanel.add(topCenterPanel, BorderLayout.CENTER);
		
		centerPanel = new StartButton(this);
		contentpane.add(centerPanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowMain myGame = new WindowMain();


	}
}
