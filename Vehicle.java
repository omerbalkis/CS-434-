
public abstract class Vehicle {
	private String plate;
	private double hours;
	private double hourlyFee;
	private double paymentCost;
	
	public Vehicle(String plate, double hours) {
		this.plate = plate;
		this.hours = hours;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double getHourlyFee() {
		return hourlyFee;
	}

	public void setHourlyFee(double hourlyFee) {
		this.hourlyFee = hourlyFee;
	}

	public double getPaymentCost() {
		return paymentCost;
	}

	public void setPaymentCost(double paymentCost) {
		this.paymentCost = paymentCost;
	}

	public String getModel() { return this.getModel();}

}
