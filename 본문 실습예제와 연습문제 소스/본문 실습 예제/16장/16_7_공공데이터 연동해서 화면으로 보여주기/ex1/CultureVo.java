package ch16.ex7a;

public class CultureVo {
	private int cultureId;
	private String cultureTitle;
	private String cultureSize;
	private String cultureInfo;
	
	
	public CultureVo(int cultureId, String cultureTitle, String cultureSize) {
		super();
		this.cultureId = cultureId;
		this.cultureTitle = cultureTitle;
		this.cultureSize = cultureSize;
	}
	
	public CultureVo(int cultureId, String cultureTitle, String cultureSize,String cultureInfo) {
		super();
		this.cultureId = cultureId;
		this.cultureTitle = cultureTitle;
		this.cultureSize = cultureSize;
		this.cultureInfo=cultureInfo;
	}
	
	public int getCultureId() {
		return cultureId;
	}
	public void setCultureId(int cultureId) {
		this.cultureId = cultureId;
	}
	public String getCultureTitle() {
		return cultureTitle;
	}
	public void setCultureTitle(String cultureTitle) {
		this.cultureTitle = cultureTitle;
	}
	public String getCultureSize() {
		return cultureSize;
	}
	public void setCultureSize(String cultureSize) {
		this.cultureSize = cultureSize;
	}

	public String getCultureInfo() {
		return cultureInfo;
	}

	public void setCultureInfo(String cultureInfo) {
		this.cultureInfo = cultureInfo;
	}
	
	
	

}
