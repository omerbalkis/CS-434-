
public class Motorcycle extends Vehicle implements Payment {
	public Motorcycle(String plate, double hours) {
		super(plate,hours);
		setHourlyFee(5.0);
		calculatePayment(hours);			
	}

	@Override
	public double calculatePayment(double hours) {
		setPaymentCost(hours * getHourlyFee());
		return getPaymentCost();
	}

	@Override
	public String getModel(){
		return "motorcycle";
	}
}
