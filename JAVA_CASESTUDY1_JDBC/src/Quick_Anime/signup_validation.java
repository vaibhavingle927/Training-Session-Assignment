package Quick_Anime;

import java.sql.SQLException;
import java.util.Scanner;

public class signup_validation {
	static Scanner sc=new Scanner(System.in);
	
	login_validation lv1=new login_validation();
	
	
	public void check_new_user(auth a1,signup s1,log_in l1) throws ClassNotFoundException, SQLException, InterruptedException {
		
		sc.nextLine();
		System.out.println("ENTER YOUR NAME");
		a1.setName(sc.nextLine());
		Thread.sleep(800);
		System.out.println("ENTER YOUR Email");
		a1.setEmail(sc.nextLine());
		Thread.sleep(800);
		System.out.println("ENTER YOUR Number");
		a1.setNumber(sc.nextLine());
		Thread.sleep(800);
		System.out.println("ENTER YOUR Password");
		a1.setPassword(sc.nextLine());

		boolean check=s1.addUser(a1);
		if(check) {
			System.out.println("user successfully signed up");
		}
		else {
			System.out.println(" retry again");
		}
		Thread.sleep(800);
		System.out.println("Now you are on the user login page/n plaese enter 1 to login ");
		int n=sc.nextInt();
		if(n==1) {
		lv1.check_login(l1);
		}else {
			System.out.println("you didnt no. 1");
		}
		
		
		
	}
}
