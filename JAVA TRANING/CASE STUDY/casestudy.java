package assign;
import java.util.Scanner;
public class casestudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		System.out.println("Enter Date of Birth :");
		String dob = sc.nextLine();
		System.out.println("Enter Gender :");
		String gen = sc.nextLine();
		System.out.println("Enter Mobile Number :");
		String num = sc.nextLine();
		System.out.println("Enter Blood Group :");
		String blood_group = sc.nextLine();
		System.out.println("Enter Blood Bank Name :");
		String blood_bank_name = sc.nextLine();
		System.out.println("Enter Donor Type :");
		String Donor_Type = sc.nextLine();
		System.out.println("Enter Donation Date");
		String Donation_Date = sc.nextLine();
		Donor d = new Donor();
		d.displayDonationDetails(name,dob,gen,num,blood_group,blood_bank_name,Donor_Type,Donation_Date);
		}


	}


