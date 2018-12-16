
public class LargeVehicle extends Vehicle implements Payment {
	
	public LargeVehicle(String plate, double hours) {
		super(plate,hours);
		setHourlyFee(12.0);
		calculatePayment(hours);			
	}

	@Override
	public double calculatePayment(double hours) {
		setPaymentCost(hours * getHourlyFee());
		return getPaymentCost();
	}

	@Override
	public String getModel(){
		return "large vehicle";
	}
	
}