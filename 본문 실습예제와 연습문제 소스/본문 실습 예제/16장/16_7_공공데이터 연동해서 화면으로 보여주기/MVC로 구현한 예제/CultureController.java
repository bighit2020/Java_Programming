package ch16.ex9;

import java.util.ArrayList;

public class CultureController {
	CultureModel model=new CultureModel();
	public ArrayList<CultureVo> receiveData(int begin,int end){
		 return model.receiveData(begin,end);
	}
	
	public void viewCultureDetail(String cultureId){
		model.viewCultureDetail(cultureId);
	}
	
	public CultureVo receiveDetailData(String  cultureId ){
		return model.receiveDetailData(cultureId);
	}

}

