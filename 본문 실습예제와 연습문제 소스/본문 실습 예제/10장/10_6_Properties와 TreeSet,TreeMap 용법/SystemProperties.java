package ch10.ex4;

import java.util.Properties;
import java.util.Enumeration;
import java.util.Iterator;

public class SystemProperties{
	public static void main(String [] args){

		Properties p = System.getProperties();
		Enumeration enu = p.propertyNames();
		
		while(enu.hasMoreElements()){
			String propName = (String)enu.nextElement();
			String property = p.getProperty(propName);
			System.out.println("'"+propName+"' = '" + property+"'");
		}
	}
}



