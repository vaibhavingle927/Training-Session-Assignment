package Quick_Anime;
import java.sql.SQLException;
import java.util.Scanner;

public class QUICKANIME {
	static Scanner sc=new Scanner(System.in);
	
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		//variables
		boolean loop;
		
		//objects
		auth a1=new auth();
		signup s1=new signup();
		signup_validation sv1=new signup_validation();
		log_in l1=new log_in();
		login_validation lv1=new login_validation();
		admin admin1=new admin();
		admin_validation av1=new admin_validation();
		admin_operations ao=new admin_operations();
		
		//all operation
		System.out.println("--------       WELCOME TO QUICK ANIME     ----------");
		Thread.sleep(2000);
		System.out.println("          SELECT FROM THE NUMBERS GIVEN BELOW   ");
		Thread.sleep(2000);
		System.out.println("1. SIGN-UP (NEW USER) \n" +"2. USER LOG-IN \n3. ADMIN LOGIN \n");
		int n=sc.nextInt();
		if(n==1) {
			sv1.check_new_user(a1,s1,l1);
			
		}
		else if(n==2) {
			lv1.check_login(l1);
			
		}
		else if(n==3) {
			loop=av1.check_admin(admin1);
			while(loop) {
				System.out.println("ENTER THE NUMBER OPPRATION THAT ADMIN WANT TO DO\n1. ADD ANIME \n2. DELETE ANIME \n3. UPDATE ANIME \n4. DELETE USER \n5. logout");
				int op=sc.nextInt();
				switch(op) {
					case 1:
						while(true) {
							ao.add_anime();
							System.out.println("you have succesfully entered your anime\n you want to add more anime \n enter 1(to add anime) \n enter 2 (to not add more anime)");
							int add=sc.nextInt();
							if(add!=1) {
								System.out.println("you came out of the add anime");
								break;
							}
		
						}
						break;
					case 2:
						while(true) {
							System.out.println("enter the anime name you want to delete ");
							sc.nextLine();
							String a_name=sc.nextLine();
							ao.del_anime(a_name);
							System.out.println("You want to delete more anime \n enter 1(to delete anime) \n enter 2 (to not delete more anime)");
							int add=sc.nextInt();
							if(add!=1) {
								System.out.println("you came out of the add anime");
							break;
							}
					}
						break;
					case 3:
						while(true) {
							System.out.println("enter the anime name whose rating you want to update");
							sc.nextLine();
							String a_name=sc.nextLine();
							System.out.println("enter the new rating");
							int rat=sc.nextInt();
							ao.up_anime(rat,a_name);
							System.out.println("You want to update the rating again \n enter 1(to update rating) \n enter 2 (if you dont want to update review)");
							int add=sc.nextInt();
							if(add!=1) {
								System.out.println("you came out of the add anime");
							break;
				
			}
			}
						break;
					case 4:
						while(true) {
							System.out.println("enter the email of the user you want to delete");
							String em=sc.next();
							ao.del_user(em);
							
							System.out.println("You want to delete more user \n enter 1(to delete user) \n enter 2 (to not delete more user)");
							int add=sc.nextInt();
							if(add!=1) {
								System.out.println("you came out of the add anime");
							break;
							}
						}
						break;
					case 5:
						System.out.println("you have successfully logout");
						loop=false;
						break;
					default:
						System.out.println("opption no available try again");
						break;
				}
		
			}
		}
		else {
			System.out.println("please select the correct option");
		}
	sc.close();
	}

}
