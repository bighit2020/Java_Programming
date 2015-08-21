package ch15.ex5;

import java.awt.*;
import java.awt.event.*;
public class FlowTest extends WindowAdapter{
  private Frame frame;
  private Button button1;
  private Button button2;
  private Button button3;

  public FlowTest() {
   frame = new Frame("Flow Layout");
    button1 = new Button("Ok");
    button2 = new Button("Open");
    button3 = new Button("Close");
  }
 public void windowClosing( WindowEvent e){
		System.exit( 0 );
 }
  public void startFrame() {
	frame.addWindowListener( this);
  
   frame.setLayout(new FlowLayout());
    frame.add(button1);
    frame.add(button2);
    frame.add(button3);
    frame.setSize(100,100);
    frame.setVisible(true);
  }

  public static void main(String args[]) {
    FlowTest flow = new FlowTest();
    flow.startFrame();
  }
}
