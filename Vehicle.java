
public abstract class Vehicle {
	private String plate;
	private Driver driver;
	private double paymentCost;
	private double hourlyFee;
	private double duration;

	public Vehicle(){

	}

	public Vehicle(String plate, Driver driver) {
		this.plate = plate;
		this.driver = driver;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public double getPaymentCost() {
		return paymentCost;
	}

	public void setPaymentCost(double paymentCost) {
		this.paymentCost = paymentCost;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getHourlyFee() {
		return hourlyFee;
	}

	public void setHourlyFee(double hourlyFee) {
		this.hourlyFee = hourlyFee;
	}

	@Override
	public String toString() {
		return "Vehicle [plate=" + plate + ", driver=" + driver + ", hourlyFee="
				+ hourlyFee + ", duration=" + duration + "]";
	}

}
