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
		
		VıpPark atasehir = new VıpPark.Builder(Location.Atasehir, 20).withStatus(Status.Outdoor).build();
		atasehir.initializeFullwithMotorcycle();
		parks.add(atasehir);
		
		VıpPark besiktas = new VıpPark.Builder(Location.Besiktas, 50).withStatus(Status.Indoor).build();
		besiktas.initializeFullwithLargeVehicle();
		parks.add(besiktas);
		
		Driver onurhan = new Driver("Onurhan Turfanda", "05393662646");
		Driver omer = new Driver("Omer Balkis", "05347415754");
		Driver alara = new Driver("Alara Baransel", "05303208911");
		Driver atakan = new Driver("Atakan Çokgünlü", "05349701006");
		Driver murat = new Driver("Murat Balkis	", "05359663000");
		Driver mine = new Driver("Mine Imirzalioglu", "05359663000");
		

		Vehicle bmw = new Car("34 BLK 97", omer, 6.8);
		Vehicle range = new LargeVehicle("34 KRL 98", alara, 12);
		Vehicle alfa = new Car("34 MRS 07", atakan, 1.2);
		Vehicle kurye = new Motorcycle("34 KURYE", onurhan, 5);
		Vehicle pejo = new Car("34 NOM 07", murat, 9);
		Vehicle volks = new Car("34 MN 098", mine, 4);
		

		VıpPark kadikoy = new VıpPark.Builder(Location.Kadikoy, 30).withStatus(Status.Outdoor).build();
		kadikoy.addVehicle(bmw);
		kadikoy.addVehicle(range);
		kadikoy.addVehicle(alfa);
		kadikoy.addVehicle(kurye);
		kadikoy.addVehicle(pejo);
		kadikoy.addVehicle(volks);
		parks.add(kadikoy);
		
		System.out.println(kadikoy.isFull());
		
		
		
		VıpPark cekmekoy = new VıpPark.Builder(Location.Cekmekoy, 40).withStatus(Status.Indoor).build();
		parks.add(cekmekoy);
		
		
		DriverLogin driverlogin = new DriverLogin();
		
		//Vehicle bmw = new Car("34 BLK 97", driverlogin.getDriver(), 6.8);
//		System.out.println(bmw.toString());
//		

		
		

//		Driver alara = new Driver("Alara Baransel", "05303208911");
//		DriverLogin view = new DriverLogin();
		
		

	}
	
}


