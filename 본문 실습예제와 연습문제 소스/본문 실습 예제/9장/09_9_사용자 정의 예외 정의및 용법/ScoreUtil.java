package ch9.ex4;

public class ScoreUtil{
	public int calcScore(int score)  throws UserDefinedException {  
		System.out.println("calcScore �޼ҵ� ����");
		//�Է��� ���� ������ 0���� 100�� ������ ����� ��������� ���� �߻�
        if(score<0 || score>100) 
        	throw new UserDefinedException("��Ȯ�� ������ �Է��ϼ���." );
        System.out.println("calcScore �޼ҵ� ��");       
        return score;
	}
}

