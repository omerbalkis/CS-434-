package Model;

public class VehicleFactory {

	public Vehicle createVehicle(String vehicleType, String plate, Driver driver, double duration) {
		if (vehicleType == null) {
			return null;
		}
		if (vehicleType.equalsIgnoreCase("Car")) {
			return new Car(plate, driver, duration);

		} else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
			return new Motorcycle(plate,driver,duration);

		} else if (vehicleType.equalsIgnoreCase("Large Vehicle")) {
			return new LargeVehicle(plate,driver,duration);
		}

		return null;
	}

}
