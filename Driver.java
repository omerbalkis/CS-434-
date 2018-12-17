
public class Driver {
	private Vehicle vehicle;
	private String fullname;
	private String phoneNumber;

	public Driver(String fullname, String phoneNumber, Vehicle vehicle) {
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public String getFullname() {
		return fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Driver [vehicle=" + vehicle.getClass().getName() + ", fullname=" + fullname + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
