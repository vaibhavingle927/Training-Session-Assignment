package Quick_Anime;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class user_operations {
	
	//object
	connection c=new connection();
	
	public void welcome(String email) throws SQLException, ClassNotFoundException {
		try {
		c.connect();
		Statement stmt=c.con1.createStatement();
		String query="select NAME from USER_INFO WHERE EMAIL='"+email+"'";
		ResultSet rs=stmt.executeQuery(query);  
		rs.next();
		System.out.println("welcome to user home page \n ------------------ \n -------------------- "+rs.getString(1) +" san ----------------------");
		
		c.con1.close();
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
		
	}
	
	public void des_anime(){
		try {
			c.connect();
			Statement stmt=c.con1.createStatement();
			String query="select * from ANIMELIST order by ANIME_RATING";
			ResultSet rs=stmt.executeQuery(query);
			int ptr=1;
		//	System.out.println("a_name     |  a_category   |    a_author   |    a_rating");
			while(rs.next()){
				
				System.out.println(ptr+++". ANIME NAME        :"+ rs.getString(1)+"\nAnime CATEGORY  :" +rs.getString(2)+"\nANIME AUTHOR     :" +rs.getString(3)+"\nANIME RATING    :" +rs.getInt(4));
				System.out.println();				
			}
			c.con1.close();
			
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

	
	public void list_anime(){
		try {
			c.connect();
			Statement stmt=c.con1.createStatement();
			String query="select * from ANIMELIST order by ANIME_NAME";
			ResultSet rs=stmt.executeQuery(query);
		//	System.out.println("a_name     |  a_category   |    a_author   |    a_rating");
			int ptr=1;
			while(rs.next()){
				
				System.out.println(ptr+++". ANIME NAME        :"+ rs.getString(1)+"\nAnime CATEGORY  :" +rs.getString(2)+"\nANIME AUTHOR     :" +rs.getString(3)+"\nANIME RATING    :" +rs.getInt(4));
				System.out.println();
			}
			c.con1.close();
			
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
	public boolean watch_anime(String a_name){
		boolean v1=false;
		try {
			c.connect();
			Statement stmt=c.con1.createStatement();
			String query="select ANIME_NAME from ANIMELIST where ANIME_NAME='"+a_name+"'";
			ResultSet rs=stmt.executeQuery(query);
			v1=true;
			rs.next();
			System.out.println("you are watching anime"+ rs.getString(1));
			c.con1.close();
			
	}catch(Exception e) {
		
		System.out.println(e.getMessage());
		return v1;
	}
	return v1;	
	}
	

}
