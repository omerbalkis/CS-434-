
public class App {
	public static void main(String[] args) {
		VıpPark ortakoy = new VıpPark.Builder(Location.Ortakoy, 10).withStatus(Status.Indoor).build();
		VıpPark atasehir = new VıpPark.Builder(Location.Atasehir, 20).withStatus(Status.Outdoor).build();
		VıpPark besiktas = new VıpPark.Builder(Location.Besiktas, 50).withStatus(Status.Indoor).build();
		VıpPark kadikoy = new VıpPark.Builder(Location.Kadikoy, 20).withStatus(Status.Outdoor).build();
		VıpPark cekmekoy  = new VıpPark.Builder(Location.Cekmekoy, 20).withStatus(Status.Indoor).build();

		Driver onurhan = new Driver("Onurhan Turfanda", "05393662646");
		Driver omer = new Driver("Omer Balkis","05347415754");
		Driver alara = new Driver("Alara Baransel","05303208911");
		Driver atakan = new Driver("Atakan Çokgünlü","05349701006");
		Driver murat = new Driver("Murat Balkis	","05359663000");

		Vehicle bmw = new Car("34 BLK 97",omer,6.8);
		Vehicle range = new LargeVehicle("34 KRL 98",alara,12);
		Vehicle alfa = new Car("34 MERSIN 07",atakan,1.2);
		Vehicle kurye = new Motorcycle("34 KURYE",onurhan,5);
		Vehicle pejo = new Car("34 NOM 07",murat,9);

		for (int i = 0; i < 10; i++){
			ortakoy.addVehicle(new Car("34 ii 5"+i,omer,5));
		}

		for (int i = 0; i < 10; i++){
			atasehir.addVehicle(new Car("34 ATA 54",alara,6));
		}

		System.out.println(ortakoy);







	}
}
