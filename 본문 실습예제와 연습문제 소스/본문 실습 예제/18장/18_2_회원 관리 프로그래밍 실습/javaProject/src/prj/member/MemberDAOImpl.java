package prj.member;


import javax.sql.*;
import java.sql.*;
import javax.naming.*;
import java.util.*;

public class MemberDAOImpl implements MemberDAO{
	private static final String driver="oracle.jdbc.driver.OracleDriver";  //����� DB���� ���� �����͸� �����Ѵ�.
	private static final String url ="jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "scott";
	private static final String pwd="tiger";

	
	private Connection con;  //DB���ῡ ���Ǵ� ��ü��  �����Ѵ�.
    private	Statement stmt;
    private ResultSet rs;	

	public ArrayList<MemberVo> listMember(){   
		 ArrayList<MemberVo> list =  new ArrayList<MemberVo>();
		  try{			
				connDB();  //DB�� �����ϴ� �޼��� 
				String query="select * from Member order by id";
				System.out.println(query);
				ResultSet rs = stmt.executeQuery( query);	 

				 while( rs.next() ){				       
					 String id=rs.getString("id");						 
					 String name = rs.getString("name");
					 int height = rs.getInt("height");
					 int weight = rs.getInt("weight");
					 int age = rs.getInt("age");

					MemberVo data = new MemberVo();     
					data.setId(id);
					data.setName( name);                
					data.setHeight(height);
					data.setWeight(weight);
					data.setAge(age);
					
					list.add( data);					
				} //end while 
				rs.close();
				stmt.close();
				con.close();
		  }catch(Exception e){
			e.printStackTrace();	
		  }

		  return list;
	} //end list()
	
	public void insertMember(MemberVo mem){
		String id=mem.getId();
		String name=mem.getName();
		int height= mem.getHeight();
		int weight = mem.getWeight();
		int age = mem.getAge();
		try{
		
		connDB();
		
		String query = "insert into member(id,name,height,weight,age) ";
		      query=query +"values("+"'"+id+"','"+name+"',"+height+","+weight+","+age +")" ;
		System.out.println(query);
		stmt.executeUpdate(query);		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//ȸ�� ���� �����ϴ� �޼ҵ�
	public void updateMember(MemberVo mem){
		
	}
	
	//ȸ�� ���� �����ϴ� �޼ҵ�
	public void deleteMember(MemberVo mem){
		
		
	}
	
	
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

