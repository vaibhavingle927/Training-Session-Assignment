package Quick_Anime;

import java.sql.SQLException;
import java.util.Scanner;

public class login_validation {
	
	//objects
	static Scanner sc=new Scanner(System.in);
	user_operations uo=new user_operations();
	
	
	public void check_login(log_in l1) throws ClassNotFoundException, SQLException {
		sc.nextLine();
		System.out.println("ENTER YOUR Email");
		String email=sc.nextLine();
		System.out.println("ENTER YOUR password");
		String pass=sc.nextLine();
		
		
		
		
		
		boolean check=l1.log_in_user(email,pass);
		if(check) {
			System.out.println("you have been loged-in");
			uo.welcome(email);
			while(check) {
			System.out.println("enter the number of following operation that you wwant to do\n 1.  anime list \n 2. Rating wise anime list \n 3. whatch anime \n 4. to logout ");
			int choose=sc.nextInt();
			switch(choose) {
				case 2:
					while(true) {
					System.out.println("------------------RATING WISE ANIME--------------------");
					System.out.println("");
					uo.des_anime();
					System.out.println("");
					System.out.println("enter 2 if you want to move out");
					int one=sc.nextInt();
					if(one==2) {
						break;
					}
					}
				break;
				case 1:
					while(true) {
						System.out.println("------------------ ANIME List --------------------");
						System.out.println("");
						uo.list_anime();
						System.out.println("");
						System.out.println("enter 2 if you want to move out");
						int one=sc.nextInt();
						if(one==2) {
							break;
						}
						}
				break;
				case 3:
					while(true) {
					System.out.println("enter the anime name that you want to watch");
					sc.nextLine();
					String a_name=sc.nextLine();
					boolean a1=uo.watch_anime(a_name);
					if(a1) {
					System.out.println("enter 2 if you want to stop watching ");
					int one=sc.nextInt();
					if(one==2) {
						System.out.println("stoped watching anime");
						break;
					}
					}
					else {
						System.out.println("entered wrong name");
						break;
					}
					}
					break;
				case 4:
					System.out.println("-------------------- Loged out ---------------- ");
					check=false;
				break;
				default:
					System.out.println("retry again");
				break;
				}
			}
		}else {
			System.out.println("email or password is wrong retry again");
		}
		
	}
}
