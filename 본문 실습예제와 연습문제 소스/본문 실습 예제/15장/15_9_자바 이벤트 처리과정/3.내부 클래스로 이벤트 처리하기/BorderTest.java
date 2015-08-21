package ch15.ex3;

import java.awt.*;
import java.awt.event.*;
public class BorderTest {

  private Frame frame;
  private Button c, w, e, n, s;

  public BorderTest() {

    frame = new Frame("Border 이벤트 예제");
    n = new Button("btn1");
    s = new Button("btn2");
    w = new Button("btn3");
    e = new Button("btn4");
    c = new Button("btn5");
  }
    public class InnerHandler implements ActionListener{

		public void actionPerformed( ActionEvent e){

		if( e.getActionCommand().equals( "btn1"))
			System.out.println( "btn1 클릭" );
		if( e.getActionCommand().equals( "btn2"))
			System.out.println( "btn2 클릭" );
		if( e.getActionCommand().equals( "btn3"))
			System.out.println( "btn3 클릭" );
		if( e.getActionCommand().equals( "btn4"))
			System.out.println( "btn4 클릭" );
		if( e.getActionCommand().equals( "btn5"))
			System.out.println( "btn5 클릭" );

		}
	}//end InnerHandler
  public void startFrame() {

	    //Listener 등록
		n.addActionListener( new  InnerHandler() );
		s.addActionListener( new InnerHandler() );
		w.addActionListener( new InnerHandler() );
		e.addActionListener( new InnerHandler() );
		c.addActionListener( new InnerHandler() );
		
		frame.add(n, "North");
		frame.add(s, "South");
		frame.add(w, "West");
		frame.add(e, "East");
		frame.add(c, "Center");

		frame.setSize(200,200);
		frame.setVisible(true);
  }
  public static void main(String args[]) {

	  BorderTest  border = new BorderTest();
    border.startFrame();
  }
}
