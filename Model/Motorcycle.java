package Model;

public class Motorcycle extends Vehicle implements Payment {

	public Motorcycle(String plate, Driver driver, double duration) {
		super(plate, driver);
		setDuration(duration);
		setHourlyFee(5.0);
	}

	public Motorcycle() {
		setHourlyFee(5.0);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public double calculatePayment() {
		if (getDuration() <= 2.0) {
			setPaymentCost(0.0);
			System.out.println("Free parking spot for 2 Hours");
		} else if (getDuration() > 12 && getDuration() < 24) {
			setPaymentCost(getDuration() * getHourlyFee() * 1.10);
		} else if (getDuration() == 24.0) {
			setPaymentCost(96.0);
			System.out.println("You will have %20 discount in 24-hour parking");
		} else {
			setPaymentCost(getDuration() * getHourlyFee());
		}
		return getPaymentCost();
	}

	public String toString() {
		return (super.toString() + "\nTOTAL COST: " + calculatePayment());
	}

}
