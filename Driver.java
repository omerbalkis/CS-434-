
public class Driver {
	private Vehicle vehicle;
	private String fullname;
	private String phoneNumber;
	private Location location;
	
	public Driver(String fullname, String phoneNumber, Vehicle vehicle, Location location){
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		this.vehicle = vehicle;
		this.location = location;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getFullname() {
		return fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public double calculateTotalPayment(){
		return this.getVehicle().getPaymentCost();
	}

	public Location getLocation(){
		return this.location;
	}

	public String toString(){
		return this.getFullname()  + " has parked his/her "+this.getVehicle().getModel()+" to "
				+this.getLocation()+". And total fee is: "+this.calculateTotalPayment()+"$";
	}
}


