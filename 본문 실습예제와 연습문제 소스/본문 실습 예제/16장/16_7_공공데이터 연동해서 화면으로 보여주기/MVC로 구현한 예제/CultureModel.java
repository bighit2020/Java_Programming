package ch16.ex9;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CultureModel {
	String authKey="6c6565627331323632303935";
	String requestUrl=null;
	int cultureNumPerPage=10;
	ArrayList<CultureVo> cultureList;
	
	public  ArrayList<CultureVo> receiveData(int beginNum,int endNum){
		try {
			requestUrl="http://openapi.seoul.go.kr:8088/"+authKey+"/xml/ListCulturalAssetsInfo/"+beginNum+"/"+endNum;
			System.out.println("requestUrl="+requestUrl);
			
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
	 
			cultureList=new ArrayList<CultureVo>();
			
			for (int temp = 0; temp < nList.getLength(); temp++) {
			   Node nNode = nList.item(temp);
			   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
			      Element eElement = (Element) nNode;
			      
			      String cultureId=getTagValue("MANAGE_NUM",eElement);
			      String cultureName=getTagValue("NAME_KOR",eElement);
			      String cultureSize=getTagValue("SCALE",eElement);
			      
			      CultureVo vo=new CultureVo(cultureId,cultureName,cultureSize);
			      cultureList.add(vo);
			   }
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cultureList;
	}
	
	public void viewCultureDetail(String cultureId){
		new CultureDetail(cultureId);
	}
	
	public  CultureVo receiveDetailData(String cultureId){
		requestUrl="http://openapi.seoul.go.kr:8088/"+authKey+"/xml/ListCulturalAssetsInfo/1/5/"+cultureId;
		CultureVo vo=null;
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
			      
			      String culId=getTagValue("MANAGE_NUM",eElement);
			      String cultureName=getTagValue("NAME_KOR",eElement);
			      String cultureSize=getTagValue("SCALE",eElement);
			      String cultureInfo=getTagValue("BOARD_KOR",eElement);
			      
			      vo=new CultureVo(culId,cultureName,cultureSize,cultureInfo);
			      
	 
			   }
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
	    Node nValue = (Node) nlList.item(0);
		return nValue.getNodeValue();
	  }		
}
