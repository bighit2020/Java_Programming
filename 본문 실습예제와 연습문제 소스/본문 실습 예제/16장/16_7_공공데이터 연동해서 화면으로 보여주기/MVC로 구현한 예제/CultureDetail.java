package ch16.ex9;

import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;

class CultureDetail extends JDialog{
	CultureVo vo=null;
	String cultureId=null;
	CultureController controller;
    JLabel jlb = new JLabel("��ȭ�� �� ȭ��");
    JLabel jlbId=new JLabel("��ȭ�� ��ȣ");
    JLabel jlbTitle=new JLabel("��ȭ�� �̸�");
    JLabel jlbSize=new JLabel("��ȭ�� ����");
    JLabel jlbDetail = new JLabel("��ȭ�� �� ����");
    public CultureDetail(String cultureId){
    	this.setTitle("��ȭ�� �� ȭ��");
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
    	
    	jlbId.setText("��ȭ�� ��ȣ: "+cultureId);
    	jlbTitle.setText("��ȭ�� �̸�:"+cultureTitle);
    	jlbSize.setText("��ȭ�� ����:"+cultureSize);
    	jlbDetail.setText("��ȭ�� ����:"+cultureInfo);
    	
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