import java.util.ArrayList;

public class VıpPark {
	// REQUIRED
	private Location location;
	private double occupancy;

	// OPTIONAL
	private Status status;
	private int capacity;
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public VıpPark(Builder builder) {
		this.location = builder.location;
		this.capacity = builder.capacity;
		this.occupancy = builder.occupancy;
		this.status = builder.status;
		this.vehicles = builder.vehicles;
	}

	public Location getAddress() {
		return this.location;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public double getOccupancy() {
		return vehicles.size();
	}

	public Status getStatus() {
		return this.status;
	}

	public void addVehicle(Vehicle vehicle) {
		if (vehicles.contains(vehicle)) {
			throw new IllegalArgumentException("You have already parked your vehicle hear.");
		} else if (!(this.occupancy < this.capacity)) {
			throw new IllegalArgumentException("Sorry, parking space is full.");
		} else {
			this.vehicles.add(vehicle);
			this.occupancy++;
		}
	}

	public void removeVehicle(Vehicle vehicle) {
		if (this.vehicles.contains(vehicle)) {
			vehicles.remove(vehicle);
			this.occupancy--;
		} else {
			throw new IllegalArgumentException("There is no such a vehicle in this parking space.");
		}
	}

	public void initializeFullwithMotorcycle() {
		System.out.println("VıpPark " + this.location + " is for motorcycles only");
		for (int i = 0; i < this.capacity; i++) {
			addVehicle(new Motorcycle());
		}
	}

	public void initializeFullwithCar() {
		System.out.println("VıpPark " + this.location + " is for cars only");
		for (int i = 0; i < this.capacity; i++) {
			addVehicle(new Car());
		}
	}

	public void initializeFullwithLargeVehicle() {
		System.out.println("VıpPark " + this.location + " is for large vehicles only");
		for (int i = 0; i < this.capacity; i++) {
			addVehicle(new LargeVehicle());
		}
	}

	public boolean isFull() {
		if (this.capacity == this.occupancy) {
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Location : ").append(location).append("\nOccupancy : ").append(occupancy)
				.append("\nAvaible Space : ").append(capacity - occupancy);

		if (status != null) {
			sb.append("\nStatus : ").append(status);
		}
		if (capacity != 0) {
			sb.append("\nCapacity : ").append(capacity);
		}
		if (vehicles != null) {
			sb.append("\nVehicles : ").append(viewVehicleList(vehicles));
		}
		return sb.toString();
	}

	public String viewVehicleList(ArrayList<Vehicle> v) {
		String list = "";
		for (int i = 0; i < v.size(); i++) {
			if (isFull())
				list += (v.get(i).getClass().getName() + " ");
			else
				list += (v.get(i).getPlate() + ", ");
		}
		return list;
	}

	public static class Builder {
		private Location location;
		private double occupancy;
		private Status status;
		private int capacity;
		private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		public Builder(Location location, int capacity) {
			if (location == null) {
				throw new IllegalArgumentException("Invalid information detected");
			}
			this.location = location;
			this.capacity = capacity;
		}

		public Builder withStatus(Status status) {
			this.status = status;
			return this;
		}

		public Builder withVehicles(ArrayList<Vehicle> vehicles) {
			for (int i = 0; i < vehicles.size(); i++) {
				this.vehicles.add(vehicles.get(i));
			}
			return this;
		}

		public VıpPark build() {
			return new VıpPark(this);
		}
	}
}
