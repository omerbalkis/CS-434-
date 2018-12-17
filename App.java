import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<VıpPark> parks = new ArrayList<VıpPark>();

		VıpPark ortakoy = new VıpPark.Builder(Location.Ortakoy, 10).withStatus(Status.Indoor).build();
		VıpPark atasehir = new VıpPark.Builder(Location.Atasehir, 20).withStatus(Status.Outdoor).build();
		VıpPark besiktas = new VıpPark.Builder(Location.Besiktas, 50).withStatus(Status.Indoor).build();
		VıpPark kadikoy = new VıpPark.Builder(Location.Kadikoy, 20).withStatus(Status.Outdoor).build();
		VıpPark cekmekoy = new VıpPark.Builder(Location.Cekmekoy, 20).withStatus(Status.Indoor).build();

		parks.add(ortakoy);
		parks.add(atasehir);
		parks.add(besiktas);
		parks.add(kadikoy);
		parks.add(cekmekoy);

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

		Vehicle bmw = new Car("34 BLK 97", omer, 6.8);
		Vehicle range = new LargeVehicle("34 KRL 98", alara, 12);
		Vehicle alfa = new Car("34 MRS 07", atakan, 1.2);
		Vehicle kurye = new Motorcycle("34 KURYE", onurhan, 5);
		Vehicle pejo = new Car("34 NOM 07", murat, 9);

		kadikoy.addVehicle(bmw);
		kadikoy.addVehicle(range);
		kadikoy.addVehicle(alfa);
		kadikoy.addVehicle(kurye);
		kadikoy.addVehicle(pejo);
		System.out.println(kadikoy);
		
		Driver sema = new Driver("Sema Baransel", "05055813757");
		Driver akif = new Driver("Akif Baransel", "05322876944");
		Driver buse = new Driver("Buse Cehreli", "05545044014");
		Driver beste = new Driver("Beste Cehreli", "05545044015");
		Driver ismet = new Driver("Ismet Sarı", "05348419445");

		Vehicle subaru = new Car("34 YB 7530", sema, 6.8);
		Vehicle honda = new LargeVehicle("34 BV 567", akif, 12);
		Vehicle seat = new Car("34 BS 61", buse, 1.2);
		Vehicle harley = new Motorcycle("34 FS 129", beste, 5);
		Vehicle volvo = new Car("34 FB 1907", ismet, 9);
		
		cekmekoy.addVehicle(subaru);
		cekmekoy.addVehicle(honda);
		cekmekoy.addVehicle(seat);
		cekmekoy.addVehicle(harley);
		cekmekoy.addVehicle(volvo);
		System.out.println(cekmekoy);

	}

}
