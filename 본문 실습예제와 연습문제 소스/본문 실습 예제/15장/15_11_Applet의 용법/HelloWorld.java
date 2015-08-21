import java.applet.Applet;
import java.awt.*;

public class HelloWorld extends  Applet{
	Font f;

	//폰트값을 초기화 한다.
	public void init(){
	  f= new Font("SansSerif", Font.BOLD,20);
	}

	//start()메서드에서 백그라운드 색깔을 빨간색으로 바꿈
	public void start(){
		setBackground(Color.yellow);
		repaint();
	}

	//paint 메서드에서 HelloWorld를 써줌
	public void paint(Graphics g){
		g.setFont(f);
		g.drawString("Hello World", 10, 80);
	}	
}