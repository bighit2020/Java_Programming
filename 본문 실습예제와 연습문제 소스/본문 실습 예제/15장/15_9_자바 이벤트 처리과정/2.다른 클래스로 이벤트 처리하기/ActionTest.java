
import java.awt.*;

public class ActionTest {
	private Frame frame;
	private Button btn1,btn2,btn3,btn4,btn5;
	public ActionTest() {
		frame = new Frame("이벤트 핸들러예제");
		btn1 = new Button("btn1");
		btn2 = new Button("btn2");
		btn3 = new Button("btn3");
		btn4 = new Button("btn4");
		btn5 = new Button("btn5");
  }

  public void startFrame() {
	  //Listener 등록
	  btn1.addActionListener( new ActionHandler() );
	  btn2.addActionListener( new ActionHandler() );
	  btn3.addActionListener( new ActionHandler() );
	  btn4.addActionListener( new ActionHandler() );
	  btn5.addActionListener( new ActionHandler() );

		frame.add(btn1, "North");
		frame.add(btn2, "South");
		frame.add(btn3, "West");
		frame.add(btn4, "East");
		frame.add(btn5, "Center");

		frame.setSize(200,200);
		frame.setVisible(true);
  }
  public static void main(String args[]) {
    ActionTest  border = new ActionTest();
    border.startFrame();
  }
}
