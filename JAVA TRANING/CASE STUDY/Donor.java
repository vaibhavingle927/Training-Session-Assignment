package assign;

public class Donor extends person {
	private String bloodBankName;
	private String donorType;
	private String donationDate;
	public String getBloodBankName() {
	return bloodBankName;
	}
	public void setBloodBankName(String bloodBankName) {
	this.bloodBankName = bloodBankName;
	}
	public String getDonorType() {
	return donorType;
	}
	public void setDonorType(String donorType) {
	this.donorType = donorType;
	}
	public String getDonationDate() {
	return donationDate;
	}
	public void setDonationDate(String donationDate) {
	this.donationDate = donationDate;
	}
	public void displayDonationDetails(String name,String dob,String gen,String
	num,String blood_group,String blood_bank_name,String Donor_Type,String Donation_Date
	) {
	Donor d = new Donor();
	d.setName(name);
	d.setDateOfBirth(dob);
	d.setGender(gen);
	d.setMobileNumber(num);
	d.setBloodGroup(blood_group);
	d.setBloodBankName(blood_bank_name);
	d.setDonorType(Donor_Type);
	d.setDonationDate(Donation_Date);
	System.out.println("Donation Details :");
	System.out.println("Name : "+ d.getName());
	System.out.println("Date Of Birth : "+ d.getDateOfBirth());
	System.out.println("Gender : "+ d.getGender());
	System.out.println("Mobile Number : "+ d.getMobileNumber());
	System.out.println("Blood Group : "+ d.getBloodGroup());
	System.out.println("Blood Bank Name : "+ d.getBloodBankName());
	System.out.println("Donor Type : "+ d.getDonorType());
	System.out.println("Donation Date : "+ d.getDonationDate());
	}

}
