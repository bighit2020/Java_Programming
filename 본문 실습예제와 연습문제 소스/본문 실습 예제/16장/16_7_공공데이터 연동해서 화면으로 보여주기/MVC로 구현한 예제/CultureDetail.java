package ch16.ex9;

import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;

class CultureDetail extends JDialog{
	CultureVo vo=null;
	String cultureId=null;
	CultureController controller;
    JLabel jlb = new JLabel("문화제 상세 화면");
    JLabel jlbId=new JLabel("문화재 번호");
    JLabel jlbTitle=new JLabel("문화재 이름");
    JLabel jlbSize=new JLabel("문화재 면적");
    JLabel jlbDetail = new JLabel("문화재 상세 설명");
    public CultureDetail(String cultureId){
    	this.setTitle("문화재 상세 화면");
    	this.cultureId=cultureId;
    	
    	controller=new CultureController();
    			
    	vo=controller.receiveDetailData(cultureId);
      
        setDetailInfo();
    }
    
    private void setDetailInfo(){
    	String cultureId=vo.getCultureId();
    	String cultureTitle=vo.getCultureTitle();
    	String cultureSize=vo.getCultureSize();
    	String cultureInfo=vo.getCultureInfo();
    	
    	jlbId.setText("문화재 번호: "+cultureId);
    	jlbTitle.setText("문화재 이름:"+cultureTitle);
    	jlbSize.setText("문화재 면적:"+cultureSize);
    	jlbDetail.setText("문화재 설명:"+cultureInfo);
    	
    	this.setLayout(new GridLayout(4,0));
    	this.add(jlbId);
    	this.add(jlbTitle);
    	this.add(jlbSize);
    	this.add(jlbDetail);
        this.setSize(400,400);
        this.setModal(true); 
        this.setVisible(true);
      	
    }

}