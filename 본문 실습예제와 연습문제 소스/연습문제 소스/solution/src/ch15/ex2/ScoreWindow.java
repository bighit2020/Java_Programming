package ch15.ex2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


//각 입력 요소를 먼저 작은 판넬에 올린 후에 다시 큰 판넬위에 올린다.
public class ScoreWindow {
	 private Frame frame;
	 private Button btnAdd,btnCalc;
	  private Panel ScorePanel,btnPanel;
	  private Panel scorePanel,namePanel,gradePanel,subPanel,pointPanel;
	  private Panel listPanel,totalPanel,avgPanel,calcPanel;
	  private java.awt.List  pointList;
	  
	  private Label lName,lGrade,lSub,lPoint;
	  private TextField tName,tGrade,tSub,tPoint;
	  private Label lTotal,lAverage;
	  private TextField tTotal,tAverage;

	  Student st=null;
	  ArrayList<Student> sList;
	  HashMap<String,Float> testInfo;
		
	  public ScoreWindow() {
	    frame = new Frame("시험점수 계산");  //화면 객체를 생성한다.
	    scorePanel = new Panel();
	    scorePanel.setBackground(Color.GREEN);
	    scorePanel.setLayout(new GridLayout(0,1));

	    namePanel=new Panel();
	    gradePanel=new Panel();
	    subPanel=new Panel();
	    pointPanel=new Panel();
	    btnPanel=new Panel();
	    
	    lName=new Label("이름");
	    tName=new TextField("",30);  //입력할 수 있는 글자수
	    namePanel.add(lName);
	    namePanel.add(tName);
	    
	    lGrade=new Label("학년");
	    tGrade=new TextField("",30);
	    gradePanel.add(lGrade);
	    gradePanel.add(tGrade);
	    
	    lSub=new Label("과목");
	    tSub=new TextField("",30);
	    subPanel.add(lSub);
	    subPanel.add(tSub);
	    
	    lPoint=new Label("점수");
	    tPoint=new TextField("",30);
	    pointPanel.add(lPoint);
	    pointPanel.add(tPoint);
	    
	    pointList =new java.awt.List();
	    pointList.setBackground(Color.ORANGE);
	    pointList.add("이름        학년        과목        점수");
	    
	    lTotal=new Label("총점");
	    lAverage=new Label("평균");
	    
	    tTotal=new TextField("",20);
	    tAverage=new TextField("",20);
	    
	    totalPanel=new Panel();
	    totalPanel.add(lTotal);
	    totalPanel.add(tTotal);
	    		
	    avgPanel=new Panel();
	    avgPanel.add(lAverage);
	    avgPanel.add(tAverage);
	    
	    calcPanel =new Panel();
	    calcPanel.add(totalPanel);
	    calcPanel.add(avgPanel);

	    listPanel=new Panel();
	    listPanel.setLayout(new GridLayout(0,1));
	    listPanel.add(pointList);
	    listPanel.add(calcPanel);

	    
	    btnAdd=new Button("목록추가");
	    btnCalc=new Button("점수계산");
	    btnPanel.add(btnAdd);
	    btnPanel.add(btnCalc);
	    
        sList=new ArrayList<Student>();
	    
	    btnAdd.addActionListener(new ActionListener() {
			 public void actionPerformed( ActionEvent e){
				 String name=tName.getText();
				 int grade=Integer.parseInt(tGrade.getText());
				 String subject=tSub.getText();
				 int point=Integer.parseInt(tPoint.getText());
				 pointList.add(name+"        "+grade +"        "+subject+"        "+point);
				 System.out.println("이름: "+name+" , 학년:"+grade+"과목:"+subject+", 점수:"+point);
				 
				 sList.add(new Student(name,grade,subject,point));
			 }
	    });
	    
	    btnCalc.addActionListener(new ActionListener() {
			 public void actionPerformed( ActionEvent e){
				 
				 testInfo=calcScore(sList);
				 tTotal.setText(Float.toString(testInfo.get("총점")));
				 tAverage.setText(Float.toString(testInfo.get("평균")));
				
			 }
	    });
	  }
	  
	  public void launchFrame() {
		scorePanel.add(namePanel);
		scorePanel.add(gradePanel);
		scorePanel.add(subPanel);
		scorePanel.add(pointPanel);
		
		frame.add(scorePanel,BorderLayout.NORTH);
		frame.add(listPanel,BorderLayout.CENTER);
		frame.add(btnPanel,BorderLayout.SOUTH);
		
		frame.setSize(500,500);  //프레임의 크기를 세팅한다.
		frame.setVisible(true);  //프레임의 보기속성을 지정한다.
	  }
	  
	  public static HashMap<String,Float> calcScore(java.util.List<Student> list){
		//1.로컬변수 선언
		Student st=null;
		float total=0;
		float average=0f;
		HashMap<String,Float> sMap=new HashMap<String,Float>();
				
		int length=list.size(); //ArrayList에 저장된 학생의 수를 구한다.
		for(int i=0; i<length;i++){
			st=list.get(i);
			total+=st.getPoint();
		}
		
		average=(float)total/length;
		
		sMap.put("총점",total);
		sMap.put("평균",average);
		
		return sMap;
	  }
	  
	  public static void main(String args[]) {

		ScoreWindow  border = new ScoreWindow();
	    border.launchFrame();
	  }
}
