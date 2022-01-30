package Quick_Anime;

import java.util.Scanner;

public class admin_validation {
	
	
	//objects
	static Scanner sc=new Scanner(System.in);
	
	
	public  boolean check_admin(admin admin1) {
		sc.nextLine();
		System.out.println("ENTER YOUR Admin email");
		String email=sc.nextLine();
		System.out.println("ENTER YOUR admin password");
		String pass=sc.nextLine();
		
		boolean check=admin1.admin_login(email,pass);
		if(check) {
			System.out.println("you have been loged-in as admin");
			return true;
		}else {
			System.out.println("EMAIL OR PASSWORD IS WRONG !!!! retry again");
			return false;
		}
		
	}

}
