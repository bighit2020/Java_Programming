package ch16.ex7a;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class CultureDetail extends JDialog{
	CultureVo vo=null;
	int cultureId=0;
	String authKey="자신의 인증키";
	String requestUrl=null;
	String detailInfo=null;
	JTextField tf1=new JTextField("");

    JLabel jlb = new JLabel("문화제 상세 화면");
    JLabel jlbId=new JLabel("문화재 번호");
    JLabel jlbTitle=new JLabel("문화재 이름");
    JLabel jlbSize=new JLabel("문화재 면적");
    JLabel jlbDetail = new JLabel("문화재 상세 설명");
    public CultureDetail(int cultureId){
    	
    	this.cultureId=cultureId;
    	requestUrl="http://openapi.seoul.go.kr:8088/"+authKey+"/xml/ListCulturalAssetsInfo/1/5/"+cultureId;
    	System.out.println("requestUrl="+requestUrl);   
    	receiveData();
      
        setDetailInfo();
    }
    
    private void setDetailInfo(){
    	tf1.setSize(400, 200);
    	int cultureId=vo.getCultureId();
    	String cultureTitle=vo.getCultureTitle();
    	String cultureSize=vo.getCultureSize();
    	String cultureInfo=vo.getCultureInfo();
    	
    	jlbId.setText(Integer.toString(cultureId));
    	jlbTitle.setText(cultureTitle);
    	jlbSize.setText(cultureSize);
    	jlbDetail.setText(cultureInfo);
    	
    	tf1.setText(cultureInfo);
    	tf1.setEnabled(false);
    	
    	
    	this.setLayout(new GridLayout(4,0));
    	this.add(jlbId);
    	this.add(jlbTitle);
    	this.add(jlbSize);
    	this.add(tf1);
        this.setSize(400,400);
        this.setModal(true); 
        this.setVisible(true);
      	
    }
    
    
	private void receiveData(){
		try {
			URL url=new URL(requestUrl);
			InputStream stream =url.openStream();
			InputStreamReader reader=new InputStreamReader(stream);
			char ch=0;
			
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(stream);
			doc.getDocumentElement().normalize();
	 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("row");
			System.out.println("-----------------------");
	 
			for (int temp = 0; temp < nList.getLength(); temp++) {
			   Node nNode = nList.item(temp);
			   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
			      Element eElement = (Element) nNode;
			      
			      int cultureId=Integer.parseInt(getTagValue("MANAGE_NUM",eElement));
			      String cultureName=getTagValue("NAME_KOR",eElement);
			      String cultureSize=getTagValue("SCALE",eElement);
			      String cultureInfo=getTagValue("BOARD_KOR",eElement);
			      
			      vo=new CultureVo(cultureId,cultureName,cultureSize,cultureInfo);
			   }
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
	    Node nValue = (Node) nlList.item(0);
		return nValue.getNodeValue();
	  }	

	public static void main(String[] args){
		new CultureWindow();
	}    
}