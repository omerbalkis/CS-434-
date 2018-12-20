package Model;

import java.util.ArrayList;

public class App {
	public static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public static void main(String[] args) {

		VıpPark ortakoy = new VıpPark.Builder(Location.Ortakoy, 10).withStatus(Status.Indoor).build();
		VıpPark atasehir = new VıpPark.Builder(Location.Atasehir, 20).withStatus(Status.Outdoor).build();
		VıpPark besiktas = new VıpPark.Builder(Location.Besiktas, 50).withStatus(Status.Indoor).build();

		ortakoy.initializeFullwithMotorcycle();
		System.out.println(ortakoy);

		atasehir.initializeFullwithCar();
		System.out.println(atasehir);

		besiktas.initializeFullwithLargeVehicle();
		System.out.println(besiktas);

		Driver onurhan = new Driver("Onurhan Turfanda", "05393662646");
		Driver omer = new Driver("Omer Balkis", "05347415754");
		Driver alara = new Driver("Alara Baransel", "05303208911");
		Driver atakan = new Driver("Atakan Çokgünlü", "05349701006");
		Driver murat = new Driver("Murat Balkis	", "05359663000");

		vehicles.add(new Car("34 BLK 97", omer, 6.8));
		vehicles.add(new LargeVehicle("34 KRL 98", alara, 12));
		vehicles.add(new Car("34 MRS 07", atakan, 1.2));
		vehicles.add(new Motorcycle("34 KRY", onurhan, 5));
		vehicles.add(new Car("34 NOM 07", murat, 9));

		VıpPark kadikoy = new VıpPark.Builder(Location.Kadikoy, 20).withStatus(Status.Outdoor).withVehicles(vehicles)
				.build();

		System.out.println(kadikoy);
		System.out.println("Payment list of vehicles in this park : ");
		for (Vehicle v : vehicles) {
			v.accept(new DisplayVisitor());
		}

		vehicles.clear();

		Driver sema = new Driver("Sema Baransel", "05055813757");
		Driver akif = new Driver("Akif Baransel", "05322876944");
		Driver buse = new Driver("Buse Cehreli", "05545044014");
		Driver beste = new Driver("Beste Cehreli", "05545044015");
		Driver ismet = new Driver("Ismet Sarı", "05348419445");

		vehicles.add(new Car("34 YB 7530", sema, 6.8));
		vehicles.add(new LargeVehicle("34 BV 567", akif, 12));
		vehicles.add(new Car("34 BS 61", buse, 1.2));
		vehicles.add(new Motorcycle("34 FS 129", beste, 5));
		vehicles.add(new Car("34 FB 1907", ismet, 9));

		VıpPark cekmekoy = new VıpPark.Builder(Location.Cekmekoy, 20).withStatus(Status.Indoor).withVehicles(vehicles)
				.build();

		System.out.println(cekmekoy);
		System.out.println("Payment list of vehicles in this park : ");
		for (Vehicle v : vehicles) {
			v.accept(new DisplayVisitor());
		}

		vehicles.clear();

	}

}
