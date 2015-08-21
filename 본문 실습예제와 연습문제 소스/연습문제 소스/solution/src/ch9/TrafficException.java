package ch9;

public class TrafficException extends Exception {
	String violationMessage;
	
	public TrafficException(String violationMessage){
		super();
		this.violationMessage=violationMessage;
	}
	
	public String getViolationMessage(){
		return "���� ����:"+violationMessage;
	}
	

}
