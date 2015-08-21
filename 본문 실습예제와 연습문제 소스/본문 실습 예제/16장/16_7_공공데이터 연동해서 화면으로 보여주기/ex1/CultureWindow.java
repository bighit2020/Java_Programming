package ch16.ex7a;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class CultureWindow  extends JFrame implements ActionListener{
	String resultMsg=null; 
	ArrayList<CultureVo> cultureList=new ArrayList<CultureVo>();
    JLabel label=new JLabel("문화재 정보 조회 결과");
	List culList=new List();

	Panel p=new Panel();
	JButton btnNext=new JButton("다음");
	JButton btnPrevious=new JButton("이전");
	
	
	public CultureWindow(){
		super("문화재 정보 조회 화면");
		init();
	}
	
	public void actionPerformed(ActionEvent e){
		String mTitle=e.getActionCommand();
		if(e.getSource()==culList){
			int index=culList.getSelectedIndex();
			System.out.println("index "+index);
			CultureVo cultureVo=cultureList.get(index);
			int cultureId=cultureVo.getCultureId();
			new CultureDetail(cultureId);
		}
		
	
	}
	
	private void init(){
		receiveData();
		startFrame();
		
	}		
	
	private void startFrame(){
		p.add(btnNext);
		p.add(btnPrevious);
		culList.setBackground(Color.green);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(BorderLayout.NORTH,label);
		add(BorderLayout.CENTER,culList);
		add(BorderLayout.SOUTH,p);
		
		setBounds(0,0,800,600);
		setVisible(true);
		//Listener와 연결한다.
		culList.addActionListener(this);
		btnNext.addActionListener(this);
		btnPrevious.addActionListener(this);
		
		//List 컴포넌트에 문화재 제목을 표시한다.
		for(int i=0;i<cultureList.size();i++){
			CultureVo vo=cultureList.get(i);
			int cultureId=vo.getCultureId();
			String cultureTitle=vo.getCultureTitle();
			
			culList.add(cultureId+ "      "+cultureTitle);
		}
		
	}
	
	private void receiveData(){
		try {
			URL url=new URL("http://openapi.seoul.go.kr:8088/6c6565627331323632303935/xml/ListCulturalAssetsInfo/1/10/");
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
			      
			      CultureVo vo=new CultureVo(cultureId,cultureName,cultureSize);
			      cultureList.add(vo);
			      /*
			      System.out.println("문화재 번호 : " + getTagValue("MANAGE_NUM", eElement));
			      System.out.println("문화재 이름 : " + getTagValue("NAME_KOR", eElement));
		          System.out.println("문화재 한자명 : " + getTagValue("NAME_CNI", eElement));
			      System.out.println("문화재 크기 : " + getTagValue("SCALE", eElement));	
			      System.out.println();*/
	 
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