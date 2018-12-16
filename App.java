
public class App {
	public static void main(String[] args) {

		Vehicle bmw = new Car("34 NOM 07",4);
	System.out.println(bmw.getPaymentCost());

	Vehicle jeep = new LargeVehicle("23323",4);
	System.out.println(jeep.getPaymentCost());

	Driver omer = new Driver("Omer Balkis","05347415754",jeep,Location.Kadikoy);
	System.out.println(omer);

	Driver murat = new Driver("Murat","05359663000",bmw,Location.Atasehir);
	System.out.println(murat);

	omer.setVehicle(bmw);
	System.out.println(omer);

	Driver alara = new Driver("Alara Baransel","1111111111",
			new Motorcycle("34 RR 043",6),Location.Cekmekoy);
	System.out.println(alara);

	VıpPark.Builder ortakoyP = new VıpPark.Builder(Location.Ortakoy,50);
	ortakoyP.withVehicle(bmw);
	ortakoyP.withVehicle(jeep);
	VıpPark ortakoyPark = ortakoyP.build();
	System.out.println(ortakoyPark);
	ortakoyP.removeVehicle(bmw);
	System.out.println(ortakoyP.build());

	}
}
