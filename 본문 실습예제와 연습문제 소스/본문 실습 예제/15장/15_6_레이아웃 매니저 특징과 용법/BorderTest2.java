package ch15.ex1;

import java.awt.*;
public class BorderTest2 {
  private Frame frame;
  private Button center, west;
  private TextField tf1;
  public BorderTest2() {
    frame = new Frame("BorderLayout ����");  //ȭ�� ��ü�� �����Ѵ�.
    west = new Button("��ư1");
    center = new Button("��ư4");
    tf1=new TextField();
    tf1.setText("�Է�â�Դϴ�.");
  }
  public void startFrame() {
		frame.add(tf1, "North");  //������ ������Ʈ�� ��ġ�� �����Ѵ�.
		frame.add(west, "West");
		frame.add(center, "Center");

		frame.setSize(400,400);  //�������� ũ�⸦ �����Ѵ�.
		frame.setVisible(true);  //�������� ����Ӽ��� �����Ѵ�.
  }
  public static void main(String[] args) {
    BorderTest2  border = new BorderTest2();
    border.startFrame();
  }
}
