package GUI;
import java.util.ArrayList;
import Model.VıpPark;
import Model.Driver;
import Model.Car;
import Model.LargeVehicle;
import Model.Location;
import Model.Motorcycle;
import Model.Status;
import Model.Vehicle;


public class GUImain {
	public static ArrayList<VıpPark> parks = new ArrayList<VıpPark>();

	public static void main(String[] args) {
		VıpPark ortakoy = new VıpPark.Builder(Location.Ortakoy, 10).withStatus(Status.Indoor).build();
		ortakoy.initializeFullwithCar();
		parks.add(ortakoy);
		
		DriverLogin driverlogin = new DriverLogin();
		
		
//		Vehicle bmw = new Car("34 BLK 97", driverlogin.getDriver(), 6.8);
//		System.out.println(bmw.toString());
//		
		
		
		
		
		
		ParkView view = new ParkView(ortakoy);
		

//		Driver alara = new Driver("Alara Baransel", "05303208911");
//		DriverLogin view = new DriverLogin();
		
		

	}
	
}


