import java.applet.Applet;
import java.awt.*;

public class HelloWorld extends  Applet{
	Font f;

	//��Ʈ���� �ʱ�ȭ �Ѵ�.
	public void init(){
	  f= new Font("SansSerif", Font.BOLD,20);
	}

	//start()�޼��忡�� ��׶��� ������ ���������� �ٲ�
	public void start(){
		setBackground(Color.yellow);
		repaint();
	}

	//paint �޼��忡�� HelloWorld�� ����
	public void paint(Graphics g){
		g.setFont(f);
		g.drawString("Hello World", 10, 80);
	}	
}