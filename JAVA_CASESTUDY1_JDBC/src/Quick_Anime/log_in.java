package Quick_Anime;


import java.sql.ResultSet;
import java.sql.Statement;

public class log_in {
	
	connection c=new connection();
	
	public boolean log_in_user(String email,String pass) {
	
	try{  
		c.connect();
		  
		//step3 create the statement object  
		Statement stmt=c.con1.createStatement();  
		  
		//step4 execute query  
		
		String query="select PASSWORD from USER_INFO where EMAIL='"+email+"'";
		ResultSet rs=stmt.executeQuery(query);  
		rs.next();
		String pas=rs.getString(1);
	
		
		//step5 close the connection object  
		c.con1.close();  
		if(pas.equals(pass)) {
			return true;
		}
			
		
		  
		}catch(Exception e){ System.out.println(e);}
	return false;  
		  
		}
}