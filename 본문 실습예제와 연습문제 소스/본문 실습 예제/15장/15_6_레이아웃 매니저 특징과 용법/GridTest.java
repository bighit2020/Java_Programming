package ch15.ex1;

import java.awt.*;
public class GridTest {
  private Frame frame;
  private Button b1, b2, b3;
  private TextField tf1,tf2,tf3;
  
  public GridTest() {
    frame = new Frame("GridLayout 예제");
    b1 = new Button("버튼1");
    b2 = new Button("버튼2");
    b3 = new Button("버튼3");
    tf1 = new TextField("입력창1입니다.");
    tf2 = new TextField("입력창2입니다.");
    tf3 = new TextField("입력창3입니다.");
  }

  public void startFrame() {
    frame.setLayout (new GridLayout(3,0));  //행을 3행으로 고정한다.
	 // frame.setLayout (new GridLayout(2,0));  //행을 3행으로 고정한다.
    frame.add(b1);
    frame.add(tf1);
    frame.add(b3);
    frame.add(tf2);
    frame.add(b2);
    frame.add(tf3);

    frame.pack();  //컴포넌트의 크기에 맞게 프레임의 크기를 조정한다.
    frame.setVisible(true);
  }

  public static void main(String args[]) {
    GridTest g = new GridTest();
    g.startFrame();
  }
}
