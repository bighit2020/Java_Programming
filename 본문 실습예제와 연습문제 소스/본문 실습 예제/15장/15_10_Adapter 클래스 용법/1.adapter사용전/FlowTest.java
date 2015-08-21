package ch15.ex6;
import java.awt.*;
import java.awt.event.*;
public class FlowTest implements WindowListener{
  private Frame frame;
  private Button button1;
  private Button button2;
  private Button button3;

  public FlowTest() {
   frame = new Frame("Adaper 사용 전 예제");
    button1 = new Button("Ok");
    button2 = new Button("Open");
    button3 = new Button("Close");
  }
// WindowListener 인터페이스 7개의 추상메소드 모두구현
 public void windowClosing( WindowEvent e){
		System.exit( 0 );
 }
 public void windowActivated( WindowEvent e){}
 public void windowClosed( WindowEvent e){}
 public void windowDeactivated( WindowEvent e){}
 public void windowDeiconified( WindowEvent e){}
 public void windowIconified( WindowEvent e){}
 public void windowOpened( WindowEvent e){}


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
