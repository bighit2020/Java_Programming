package ch15.ex1;

import java.awt.*;
public class GridTest {
  private Frame frame;
  private Button b1, b2, b3;
  private TextField tf1,tf2,tf3;
  
  public GridTest() {
    frame = new Frame("GridLayout ����");
    b1 = new Button("��ư1");
    b2 = new Button("��ư2");
    b3 = new Button("��ư3");
    tf1 = new TextField("�Է�â1�Դϴ�.");
    tf2 = new TextField("�Է�â2�Դϴ�.");
    tf3 = new TextField("�Է�â3�Դϴ�.");
  }

  public void startFrame() {
    frame.setLayout (new GridLayout(3,0));  //���� 3������ �����Ѵ�.
	 // frame.setLayout (new GridLayout(2,0));  //���� 3������ �����Ѵ�.
    frame.add(b1);
    frame.add(tf1);
    frame.add(b3);
    frame.add(tf2);
    frame.add(b2);
    frame.add(tf3);

    frame.pack();  //������Ʈ�� ũ�⿡ �°� �������� ũ�⸦ �����Ѵ�.
    frame.setVisible(true);
  }

  public static void main(String args[]) {
    GridTest g = new GridTest();
    g.startFrame();
  }
}
