

import java.awt.event.*;

public class ActionHandler implements ActionListener{
	public void actionPerformed( ActionEvent e){
		if( e.getActionCommand().equals( "btn1"))
			System.out.println( "��ư1 Ŭ��" );
		if( e.getActionCommand().equals( "btn2"))
			System.out.println( "��ư2 Ŭ��" );
		if( e.getActionCommand().equals( "btn3"))
			System.out.println( "��ư3 Ŭ��" );
		if( e.getActionCommand().equals( "btn4"))
			System.out.println( "��ư4 Ŭ��" );
		if( e.getActionCommand().equals( "btn5"))
			System.out.println( "��ư5 Ŭ��" );

	}
}
