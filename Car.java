
public class Car extends Vehicle implements Payment {

	public Car(String plate, Driver driver, double duration) {
		super(plate, driver);
		setDuration(duration);
		setHourlyFee(7.0);
	}

	@Override
	public double calculatePayment() {
		if (getDuration() <= 1.0) {
			setPaymentCost(0.0);
			System.out.println("Free parking spot for an hour");
		} else if (getDuration() > 12.0 && getDuration() < 24.0) {
			setPaymentCost(getDuration() * getHourlyFee() * 1.25);
		} else if (getDuration() == 24.0) {
			setPaymentCost(150.0);
			System.out.println("You will have %10 discount in 24-hour parking");
		} else {
			setPaymentCost(getDuration() * getHourlyFee());
		}
		return getPaymentCost();
	}
	
}
