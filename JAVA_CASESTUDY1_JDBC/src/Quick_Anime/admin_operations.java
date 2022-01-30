package Quick_Anime;

import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class admin_operations {
	
	//objects
	connection c=new connection();
	animevar avr=new animevar();
    Scanner sc=new Scanner(System.in);

	//delete user
	public void del_user(String email) {
		try {
			c.connect();
			String query = "delete from USER_INFO WHERE EMAIL='"+email+"'";
			PreparedStatement pst=c.con1.prepareStatement(query); 
			pst.executeUpdate();
			
			c.con1.close();
			System.out.println("user is successfully deleted");
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
    
	//add anime
	public void add_anime() {
		try {
			c.connect();
			sc.nextLine();
			System.out.println("ENTER anime NAME");
			avr.setA_name(sc.nextLine());
		
			Thread.sleep(800);
			System.out.println("ENTER anime category ");
			avr.setA_catg(sc.nextLine());
		
			Thread.sleep(800);
			System.out.println("ENTER anime author");
			avr.setA_author(sc.nextLine());
		
			Thread.sleep(800);
			System.out.println("ENTER anime rating");
			avr.setA_rating(sc.nextInt());
		
			String query = "INSERT INTO ANIMELIST VALUES(?,?,?,?)";
			PreparedStatement pst=c.con1.prepareStatement(query); 
		
			pst.setString(1,avr.getA_name());
			pst.setString(2,avr.getA_catg());
			pst.setString(3,avr.getA_author());
			pst.setInt(4,avr.getA_rating());
			pst.executeUpdate();
		
			c.con1.close();  
		}
		catch(
				SQLIntegrityConstraintViolationException e){ 
			System.out.println("user is not unique");
			} 
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//delete anime
	public void del_anime(String a_name) {
		try {
			c.connect();
			String query = "delete from ANIMELIST WHERE ANIME_NAME='"+a_name+"'";
			PreparedStatement pst=c.con1.prepareStatement(query); 
			pst.executeUpdate();
			
			c.con1.close();
			System.out.println("anime is successfully deleted");
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	//update anime
	public void up_anime(int rat,String a_name) {
		try {
		c.connect();
		
		Statement st=c.con1.createStatement();
		String query="UPDATE ANIMELIST SET ANIME_RATING='"+rat+"' where ANIME_NAME= '"+a_name+"'";
		st.executeQuery(query);
		c.con1.close();
		System.out.println("Anime rating updated");
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	

}
