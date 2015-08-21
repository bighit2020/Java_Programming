package ch15.ex2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


//�� �Է� ��Ҹ� ���� ���� �ǳڿ� �ø� �Ŀ� �ٽ� ū �ǳ����� �ø���.
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
	    frame = new Frame("�������� ���");  //ȭ�� ��ü�� �����Ѵ�.
	    scorePanel = new Panel();
	    scorePanel.setBackground(Color.GREEN);
	    scorePanel.setLayout(new GridLayout(0,1));

	    namePanel=new Panel();
	    gradePanel=new Panel();
	    subPanel=new Panel();
	    pointPanel=new Panel();
	    btnPanel=new Panel();
	    
	    lName=new Label("�̸�");
	    tName=new TextField("",30);  //�Է��� �� �ִ� ���ڼ�
	    namePanel.add(lName);
	    namePanel.add(tName);
	    
	    lGrade=new Label("�г�");
	    tGrade=new TextField("",30);
	    gradePanel.add(lGrade);
	    gradePanel.add(tGrade);
	    
	    lSub=new Label("����");
	    tSub=new TextField("",30);
	    subPanel.add(lSub);
	    subPanel.add(tSub);
	    
	    lPoint=new Label("����");
	    tPoint=new TextField("",30);
	    pointPanel.add(lPoint);
	    pointPanel.add(tPoint);
	    
	    pointList =new java.awt.List();
	    pointList.setBackground(Color.ORANGE);
	    pointList.add("�̸�        �г�        ����        ����");
	    
	    lTotal=new Label("����");
	    lAverage=new Label("���");
	    
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

	    
	    btnAdd=new Button("����߰�");
	    btnCalc=new Button("�������");
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
				 System.out.println("�̸�: "+name+" , �г�:"+grade+"����:"+subject+", ����:"+point);
				 
				 sList.add(new Student(name,grade,subject,point));
			 }
	    });
	    
	    btnCalc.addActionListener(new ActionListener() {
			 public void actionPerformed( ActionEvent e){
				 
				 testInfo=calcScore(sList);
				 tTotal.setText(Float.toString(testInfo.get("����")));
				 tAverage.setText(Float.toString(testInfo.get("���")));
				
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
		
		frame.setSize(500,500);  //�������� ũ�⸦ �����Ѵ�.
		frame.setVisible(true);  //�������� ����Ӽ��� �����Ѵ�.
	  }
	  
	  public static HashMap<String,Float> calcScore(java.util.List<Student> list){
		//1.���ú��� ����
		Student st=null;
		float total=0;
		float average=0f;
		HashMap<String,Float> sMap=new HashMap<String,Float>();
				
		int length=list.size(); //ArrayList�� ����� �л��� ���� ���Ѵ�.
		for(int i=0; i<length;i++){
			st=list.get(i);
			total+=st.getPoint();
		}
		
		average=(float)total/length;
		
		sMap.put("����",total);
		sMap.put("���",average);
		
		return sMap;
	  }
	  
	  public static void main(String args[]) {

		ScoreWindow  border = new ScoreWindow();
	    border.launchFrame();
	  }
}
