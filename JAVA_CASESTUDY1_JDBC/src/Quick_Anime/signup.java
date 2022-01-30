package Quick_Anime;

import java.sql.*;

public class signup {
	
	connection c=new connection();
	
public boolean addUser(auth a) throws ClassNotFoundException, SQLException  {
	
		boolean check=false;
		try{  
		
			
			c.connect();
			String query = "INSERT INTO user_info VALUES(?,?,?,?)";
			PreparedStatement pst=c.con1.prepareStatement(query); 	
			 
		  
			pst.setString(1, a.getName());
			pst.setString(2, a.getNumber());
			pst.setString(3, a.getPassword());
			pst.setString(4, a.getEmail());
			pst.executeUpdate();
			
		
			
			check=true;
			c.con1.close();  
			  
			}catch(SQLIntegrityConstraintViolationException e){ System.out.println("user is not unique");}  
			  
		return check;
		
	}
	
}
