package ch16.ex6;

import java.awt.List;

public class MovieController {
	MovieModel model=new MovieModel();
	//����Ʈ�� ��ȭ������ �߰��ϴ� �޼ҵ�
	public void addTitle(String title,List movieList){
		try{
			model.addTitle(title,movieList);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//����Ʈ�� �ִ� ��ȭ ������ �����ϴ� �޼ҵ�
	public void delTitle(String title,List movieList){
		model.delTitle(title,  movieList);
	}
	//����Ʈ�� �ִ� ��ȭ������� ���Ͽ� �����ϴ� �޼ҵ�
	public void saveTitles(List movieList){
		try{
			model.saveTitles(movieList);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


