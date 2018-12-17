
public class Driver {
	private Vehicle vehicle;
	private String fullname;
	private String phoneNumber;

	public Driver(String fullname, String phoneNumber) {
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		
	}

	public String getFullname() {
		return fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "Driver fullname=" + fullname + ", phoneNumber=" + phoneNumber ;
	}
	
}
