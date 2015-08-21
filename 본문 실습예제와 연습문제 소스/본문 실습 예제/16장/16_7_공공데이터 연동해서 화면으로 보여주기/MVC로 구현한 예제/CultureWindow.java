package ch16.ex9;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;


public class CultureWindow  extends JFrame implements ActionListener{
	String requestUrl=null;
	int cultureNumPerPage=10;
	int pageNum=0;
	int beginNum=cultureNumPerPage*pageNum+1;
	int endNum=cultureNumPerPage*(pageNum+1);
	CultureController controller;
	ArrayList<CultureVo> cultureList;
    JLabel label;
    JTable culTable;

	Panel p;
	JButton btnNext;
	JButton btnPrevious;
	String[][] cultureItems ;
	CulTableModel model;
	int rowIdx=-1;
	int cultureId=0;
	
	public CultureWindow(){
		super("문화재 정보 조회 화면");
		label=new JLabel("문화재 정보 조회 결과");
	    culTable=new JTable();

		p=new Panel();
		btnNext=new JButton("다음");
		btnPrevious=new JButton("이전");
		cultureItems = new String[0][2];		
		init();
	}
	
	private void init(){
		controller=new CultureController();
		cultureList=controller.receiveData(beginNum,endNum);
		loadTableData();
		startFrame();
		
	}	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btnNext){
			pageNum++;
			beginNum=cultureNumPerPage*pageNum+1;
			endNum=cultureNumPerPage*(pageNum+1);
			cultureList=controller.receiveData(beginNum,endNum);
			
			loadTableData();
					
		}else if(e.getSource()==btnPrevious){
			if(pageNum>0)
			   pageNum--;
			
			beginNum=cultureNumPerPage*pageNum+1;
			endNum=cultureNumPerPage*(pageNum+1);
			cultureList=controller.receiveData(beginNum,endNum);
			loadTableData();
			
		}
	}
	
		
	
	private void loadTableData(){
		
		cultureItems = new String[cultureList.size()][2];
    	for(int i=0; i<cultureList.size();i++){
    		CultureVo vo=cultureList.get(i);
    		cultureItems[i][0]=vo.getCultureId();
    		cultureItems[i][1]=vo.getCultureTitle();
    		
    	}

        model=new CulTableModel(cultureItems);
    	culTable.setModel(model);
	}

	private void startFrame(){

    	ListSelectionModel rowSM = culTable.getSelectionModel();
        
		//테이블의 행을 선택했을 시  문화재 번호를 가지고 온다.
		rowSM.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        rowSM.addListSelectionListener(new ListSelectionListener(){
           public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()){
                     ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                     rowIdx=lsm.getMinSelectionIndex();
                     System.out.println("rowIdx: "+rowIdx);
                     if(rowIdx!=-1){
                    	 String cultureId=cultureItems[rowIdx][0];
                    	 new CultureDetail(cultureId);    
                    	 rowIdx=-1;
                     }
                  }
            }
         });
        
		p.add(btnPrevious);
		p.add(btnNext);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(BorderLayout.NORTH,label);
		add(BorderLayout.CENTER,new JScrollPane(culTable));
		add(BorderLayout.SOUTH,p);
		
		setBounds(0,0,800,600);
		setVisible(true);
		//Listener와 연결한다.
		btnNext.addActionListener(this);
		btnPrevious.addActionListener(this);
	}

	public static void main(String[] args){
		new CultureWindow();
	}
}