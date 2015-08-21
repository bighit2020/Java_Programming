package ch15.ex1;

import java.awt.*;
public class BorderTest {
  private Frame frame;
  private Button center, west, east, north, south;
  private TextField tf1;
  public BorderTest() {
    frame = new Frame("BorderLayout ����");  //ȭ�� ��ü�� �����Ѵ�.
    south = new Button("��ư1");
    west = new Button("��ư2");
    east = new Button("��ư3");
    center = new Button("��ư4");
    tf1=new TextField();
    tf1.setText("�Է�â�Դϴ�.");
  }
  public void startFrame() {
		frame.add(tf1, "North");  //������ ������Ʈ�� ��ġ�� �����Ѵ�.
		frame.add(south, "South");
		frame.add(west, "West");
		frame.add(east, "East");
		frame.add(center, "Center");

		frame.setSize(400,400);  //�������� ũ�⸦ �����Ѵ�.
		frame.setVisible(true);  //�������� ����Ӽ��� �����Ѵ�.
  }
  public static void main(String[] args) {
    BorderTest  border = new BorderTest();
    border.startFrame();
  }
}
