package ch17.ex3;

import java.sql.*;
import java.util.*;

public class MemberDao{
	private static final String driver="oracle.jdbc.driver.OracleDriver";  //����� DB���� ���� �����͸� �����Ѵ�.
	private static final String url ="jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String user = "scott";
	private static final String pwd="tiger";
	
	private Connection con;  //DB���ῡ ���Ǵ� ��ü��  �����Ѵ�.
    private	Statement stmt;
    private ResultSet rs;	

	public ArrayList<MemberVo> list(){   
	  ArrayList<MemberVo> list =  new ArrayList<MemberVo>();
	  try{			
			connDB();  //DB�� �����ϴ� �޼��� 
			String query = "select * from member ";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery( query);	//������ ������ �� ���ϵǴ� ���ڵ� ���� rs�� �����Ѵ�.		 

			 while( rs.next() ){				        //rs�� ���ڵ���� ������ �Ҵ��Ѵ�.
				 String id=rs.getString("id");						 
				 String name = rs.getString("name");
				 int height = rs.getInt("height");
				 int weight = rs.getInt("weight");
				 int age = rs.getInt("age");

				MemberVo data = new MemberVo();     //VO��ü�� �����Ѵ�.
				data.setId(id);
				data.setName( name);                //�������� VO��ü�� ��������� �����Ѵ�.
				data.setHeight(height);
				data.setWeight(weight);
				data.setAge(age);
				
				list.add( data);					//list�� VO��ü�� �߰��Ѵ�.
			} //end while 
			rs.close();
			stmt.close();
			con.close();
	  }catch(Exception e){
		e.printStackTrace();	
	  }

	  return list;
	} //end list()

	public void connDB(){
		try{
			Class.forName(driver);  
			System.out.println("Oracle ����̹� �ε� ����");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection ���� ����");

			stmt = con.createStatement();
			System.out.println("Statement ���� ����");		
		}catch(Exception e){
		e.printStackTrace();	
		}
	}
}//end class MemberDAO

