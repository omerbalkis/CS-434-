
public class Car extends Vehicle implements Payment {
	public Car(String plate, double hours) {
		super(plate,hours);
		setHourlyFee(8.0);
		calculatePayment(hours);			
	}

	@Override
	public double calculatePayment(double hours) {
		setPaymentCost(hours * getHourlyFee());
		return getPaymentCost();
	}

	@Override
	public String getModel(){
		return "car";
	}
	
}

