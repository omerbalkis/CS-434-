package Model;

public class LargeVehicle extends Vehicle implements Payment {

	public LargeVehicle(String plate, Driver driver, double duration) {
		super(plate, driver);
		if (duration < 24.0) {
			setDuration(duration);
		} else {
			throw new IllegalArgumentException("Large Vehicles can not park more than one day in VıpPark");
		}
		setHourlyFee(10.0);
	}

	public LargeVehicle() {}

	@Override
	public double calculatePayment() {
		setPaymentCost(getDuration() * getHourlyFee());
		return getPaymentCost();
	}

	public String toString() {
		return (super.toString() + "\nTOTAL COST: " + calculatePayment());
	}
}